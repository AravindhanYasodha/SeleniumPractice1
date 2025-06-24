package SeleniumBasicAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAP to launching https://www.google.com/ and typing something in searchbox of it using classname locator
public class Assignment114 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search_box = driver.findElement(By.className("gLFyf"));
		search_box.sendKeys("Tiruvannamalai");

	}

	
}
