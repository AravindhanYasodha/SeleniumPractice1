package SeleniumBasicAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to search product on amazon and press enter button after searching
public class Assignment117 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("Shoes"+Keys.ENTER);

	}

}
