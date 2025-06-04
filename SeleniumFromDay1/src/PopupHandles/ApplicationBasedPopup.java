package PopupHandles;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationBasedPopup {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();

		WebElement searchBar = driver.findElement(By.cssSelector("input[id^='twotabsearchtextbox']"));
		searchBar.sendKeys("Shoes");

		int selectresult = 3;
		List<WebElement> searchsugges = driver
				.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		wait.until(ExpectedConditions.visibilityOfAllElements(searchsugges));
		for (int i = 0; i <= searchsugges.size(); i++) {
			if (i == selectresult) {
				searchsugges.get(i).click();
				break;
			}
		}

		int selectProduct = 3;
		List<WebElement> productList = driver.findElements(By.xpath("//div[@role='listitem']"));
		for (int i = 0; i <= productList.size(); i++) {
			if (i == selectProduct) {
				productList.get(i).click();
				break;
			}
		}

		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> it = allwindows.iterator();
		String parentID = it.next();
		System.out.println(parentID);
		String childID = it.next();
		System.out.println(childID);

		driver.switchTo().window(childID);

		WebElement addToWishList = driver.findElement(By.xpath("//a[text()=' Add to Wish List ']"));
		wait.until(ExpectedConditions.visibilityOf(addToWishList));
		addToWishList.click();

		// It ask to login

		// Application Based Popup open
//		WebElement closePopup = driver.findElement(By.xpath("//i[@class='a-icon a-icon-close']"));
//		closePopup.click();
	}

}
