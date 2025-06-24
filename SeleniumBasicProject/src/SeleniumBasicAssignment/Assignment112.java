package SeleniumBasicAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to perform login on https://www.facebook.com/ with correct credentials using xpath locator
public class Assignment112 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("Aravindhan");
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Password");
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		loginBtn.click();


	}

}
