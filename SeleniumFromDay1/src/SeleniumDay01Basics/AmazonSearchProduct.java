package SeleniumDay01Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonSearchProduct {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String homeTitle = driver.getTitle();
		System.out.println("Home Page Title : " + homeTitle);

		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("Clock" + Keys.ENTER);

		String clockPageTitle = driver.getTitle();
		System.out.println("Clock Page Title : " + clockPageTitle);
		String expectedClockPage = "Amazon.in : Clock";
		if (clockPageTitle.equals(expectedClockPage)) {
			System.out.println("It is a Clock page");
		} else {
			System.out.println("It is not a Clock page");
		}
		
		driver.close();

	}

}
