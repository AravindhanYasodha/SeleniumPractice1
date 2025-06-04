package AutoSuggesstions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Mobile");
		Thread.sleep(3000);
		List<WebElement> searchList = driver.findElements(By.xpath("//div[@role='rowgroup']/div/div"));
		wait.until(ExpectedConditions.visibilityOfAllElements(searchList));
		searchList.get(2).click();

	}

}
