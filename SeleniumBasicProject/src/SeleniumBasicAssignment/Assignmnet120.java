package SeleniumBasicAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAP to typing password and pasting the same into confirm password on the registration. link :   https://grotechminds.com/registration/ using keys functionalities
//I tried this link : https://grotechminds.com/user-account/
public class Assignmnet120 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/user-account/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signUp = driver.findElement(By.linkText("Sign Up"));
		signUp.click();
		
		WebElement pass=driver.findElement(By.name("register_user_password"));
		pass.sendKeys("Aravindhan");
		pass.sendKeys(Keys.CONTROL+"a");
		pass.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		WebElement repeatPass=driver.findElement(By.name("register_user_password_re"));
		repeatPass.sendKeys(Keys.CONTROL+"v");
	}

}
