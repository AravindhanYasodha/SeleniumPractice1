package AutoSuggesstions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleAutoSuggestion {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement searchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));
		searchBox.sendKeys("Thiruvannamalai");

		List<WebElement> resultList = driver.findElements(By.xpath("//div[@class]/ul/li"));
		wait.until(ExpectedConditions.visibilityOfAllElements(resultList));

		resultList.get(2).click();
	}

}
