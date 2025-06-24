package SeleniumBasicAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAP to launch and Close Any Website
public class Assignment109 {

	public static void main(String[] args) throws InterruptedException {
		// Browser Launched
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(10000);
		// Browser Closed
		driver.close();
	}
	
}
