package SeleniumBasicAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAP to find the below elements from https://www.google.com/ page(About, Store, Gmail and Images ) links using partial linktext locator and perform click action on each of them
public class Assignment116 {

		
		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			WebElement aboutLink = driver.findElement(By.partialLinkText("Abo"));
			aboutLink.click();
			
			driver.navigate().back();
			//driver.get("https://www.google.com/");
			WebElement storeLink = driver.findElement(By.partialLinkText("Sto"));
			storeLink.click();
			
			driver.navigate().back();
			//driver.get("https://www.google.com/");
			WebElement gmailLink = driver.findElement(By.partialLinkText("Gma"));
			gmailLink.click();
			
			driver.navigate().back();
			//driver.get("https://www.google.com/");
			WebElement imagesLink = driver.findElement(By.partialLinkText("Imag"));
			imagesLink.click();
		}

}