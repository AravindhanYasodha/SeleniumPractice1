package AmazonPractice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException, AWTException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String homeTitle = driver.getTitle();
		System.out.println("Home Page Title : " + homeTitle);

		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("Clock" + Keys.ENTER);

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

		Set<String> allWindows = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(allWindows);
		int totalWindow = allWindows.size();
		System.out.println(totalWindow);
		int count = 1;
		for (String allWin : allWindows) {
			if (!parentWindow.equals(allWindows)) {
				System.out.println(count + " : " + allWin.toString());
				count++;
			}

		}

		driver.switchTo().window(windowList.get(1));

	}

}
