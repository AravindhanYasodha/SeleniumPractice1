package SeleniumDay02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FindPostionCoordinates {

	public static void main(String[] args) {

		EdgeOptions option = new EdgeOptions();
		option.addArguments("--headless");
		EdgeDriver driver = new EdgeDriver(option);
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		Point p1 = loginButton.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println(x+", "+y);
	}

}
