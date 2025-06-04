package AutoSuggesstions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartAutoSuggestion {

	
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().refresh();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Shoes");
		Thread.sleep(3000);
		List<WebElement> searchList = driver.findElements(By.xpath("//form[@class]/ul/li"));
		wait.until(ExpectedConditions.visibilityOfAllElements(searchList));
		searchList.get(2).click();
	}

}
