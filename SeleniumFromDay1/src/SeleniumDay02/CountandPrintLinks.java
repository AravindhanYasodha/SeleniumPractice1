package SeleniumDay02;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CountandPrintLinks {

//	public static void GetLinkText() {
//
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
//		ChromeDriver driver = new ChromeDriver(option);
//		driver.get("https://www.facebook.com/");
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("Total Links : " + links.size());
//		for (WebElement link : links) {
//			// String url = link.getDomAttribute("href");
//			String urlText = link.getText();
//			System.out.println(urlText);
//		}
//
//	}

	public static void main(String[] args) {

		EdgeOptions option = new EdgeOptions();
		option.addArguments("--headless");

		EdgeDriver driver = new EdgeDriver(option);
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links : " + links.size());

		int goodLinks = 0;
		int badLinks = 0;
		int emptyLinks = 0;

		for (WebElement link : links) {
			
			String urlText = link.getText();
			String url = link.getDomAttribute("href");

			try {
				HttpURLConnection connect = (HttpURLConnection) new URL(url).openConnection();
				connect.setRequestMethod("GET");
				connect.connect();
				int response = connect.getResponseCode();
				if (response < 400) {
					System.out.println("Good Link Text : "+urlText);
					System.out.println("Good Url : " + url);
					goodLinks++;
				} else {
					System.out.println("Bad Link Text : "+urlText);
					System.out.println("Bad Url : " + url);
					badLinks++;
				}

			} catch (Exception e) {
				System.out.println("Empty Link Text : "+urlText);
				System.out.println("Empty Links : " + emptyLinks);
				emptyLinks++;

			}

		}
		System.out.println("Total Good Links are : " + goodLinks);
		System.out.println("Total Bad Links are : " + badLinks);
		System.out.println("Total Empty Links are : " + emptyLinks);
		
		//GetLinkText();
	}

}
