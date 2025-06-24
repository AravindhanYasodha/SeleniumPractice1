package SeleniumBasicAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to perform login on https://www.flipkart.com/ 
public class Assignment113 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement login_Text = driver.findElement(By.xpath("//span[text()='Login']"));
		login_Text.click();
		WebElement enterMobile = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']/ancestor::label/preceding-sibling::input"));
		enterMobile.sendKeys("8807881338");
		WebElement reqOtpBtn = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		reqOtpBtn.click();
		Thread.sleep(20000);
		
		WebElement profile = driver.findElement(By.xpath("//a/img/following-sibling::span"));
		String profileName = profile.getText();
		System.out.println("Profile Name is : "+profileName);
	}

}
