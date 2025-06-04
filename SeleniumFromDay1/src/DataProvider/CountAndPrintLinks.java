package DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CountAndPrintLinks {

	public static void main(String[] args) throws IOException {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int countLinks = links.size();
		System.out.println("Total links : " +countLinks);
		
		for(int i=0; i<=countLinks-1; i++) {
			WebElement link = links.get(i);
			String url = link.getDomAttribute("href");
			System.out.println(url);
		}
		
		TakesScreenshot ts = driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\welcome\\eclipse-workspace\\GroTechMindsSelenium\\SeleniumFromDay1\\target\\test2.png");
		FileHandler.copy(source, desti);
	}

}
