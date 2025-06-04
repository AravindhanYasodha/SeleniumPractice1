package SeleniumDay02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindOutColorOfElement {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		String loginButtonColor = loginButton.getCssValue("color");
		System.out.println(loginButtonColor);
		
		WebElement createAccButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		String createAccButtonColor = createAccButton.getCssValue("color");
		System.out.println(createAccButtonColor);
	}

}
