package SeleniumBasicAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAP to find login button component on https://www.facebook.com/  page by using name locator and perform click action on it
public class Assignment111 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("Aravindhan");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Password");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();

	}

}
