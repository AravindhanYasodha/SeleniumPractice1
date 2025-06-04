package SeleniumDay02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindLengthAndWidthOfElement {

	public static void main(String[] args) {


		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Dimension d1 =loginButton.getSize();
		
		int height = d1.getHeight();
		System.out.println(height);
		
		int width = d1.getWidth();
		System.out.println(width);
		

	}

}
