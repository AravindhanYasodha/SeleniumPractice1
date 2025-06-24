package SeleniumBasicAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to find all the components one by one from https://www.facebook.com/ page by using id locator 
public class Assignment110 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Aravindhan");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Password");
		WebElement loginBtn = driver.findElement(By.id("u_0_5_JJ"));
		loginBtn.click();

	}

}
