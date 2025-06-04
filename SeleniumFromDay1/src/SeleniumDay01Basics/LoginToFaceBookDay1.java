package SeleniumDay01Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFaceBookDay1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		
		WebElement emailAddress = driver.findElement(By.id("email"));
		emailAddress.sendKeys("shoes@gmail.com");
		
		WebElement passwordAddress = driver.findElement(By.id("pass"));
		passwordAddress.sendKeys("shoes@gmail.com");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		WebElement errorText = driver.findElement(By.xpath("//div[@id='loginform']/div[2]/div[2]"));
		String errorMessege = errorText.getText();
		System.out.println(errorMessege);
		
		String loginPageTitle2 = driver.getTitle();
		System.out.println(loginPageTitle2);
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		
		
		
	}

}
