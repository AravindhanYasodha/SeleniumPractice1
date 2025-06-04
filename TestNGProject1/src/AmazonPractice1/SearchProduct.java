package AmazonPractice1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class SearchProduct extends BaseClass {

	@Test
	public void searchProduct() throws InterruptedException {

		WebElement profile = driver.findElement(By.xpath("//span[contains(text(),'Hello, Aravind')]"));
		boolean profilename = profile.isDisplayed();
		Assert.assertEquals(profilename, true);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("WallClock"+Keys.ENTER);

		String clockPageTitle = driver.getTitle();
		System.out.println("Clock Page Title : " + clockPageTitle);
		String expectedClockPage = "Amazon.in : Clock";
		
		if (clockPageTitle.equals(expectedClockPage)) {
			System.out.println("It is a Clock page");
		} else {
			System.out.println("It is not a Clock page");
		}

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@role='listitem']"));

		for (int i = 0; i <= 2; i++) {
			if (parentWindow.equals(parentWindow)) {
				allProducts.get(i).click();
			} else {
				driver.switchTo().window(parentWindow);
			}
		}

		driver.switchTo().window(parentWindow);

		
	}

}
