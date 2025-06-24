package SeleniumBasicAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to find the below elements from https://www.google.com/  page(About, Store, Gmail and Images ) links using linktext locator and perform click action on each of them
public class Assignment115 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement aboutLink = driver.findElement(By.linkText("About"));
		aboutLink.click();
		
		driver.navigate().back();
		//driver.get("https://www.google.com/");
		WebElement storeLink = driver.findElement(By.linkText("Store"));
		storeLink.click();
		
		driver.navigate().back();
		//driver.get("https://www.google.com/");
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		gmailLink.click();
		
		driver.navigate().back();
		//driver.get("https://www.google.com/");
		WebElement imagesLink = driver.findElement(By.linkText("Images"));
		imagesLink.click();
	}

}
