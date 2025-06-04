package SeleniumDay02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMindsForm {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/welcome/Downloads/learningHTML1%20(2).html");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Aravindhan"+(Keys.CONTROL+"a"));
		username.sendKeys(Keys.CONTROL+"s");
		Thread.sleep(2000);
		WebElement hints = driver.findElement(By.name("say hello"));
		hints.sendKeys(Keys.CONTROL+"v");
		
	}

}
