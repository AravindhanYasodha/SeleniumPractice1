package PopupHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPopup {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		WebElement chooseFile = driver.findElement(By.cssSelector(".form-control"));
		chooseFile.sendKeys("C:\\Users\\welcome\\Downloads\\FileUpload\\Test1.png");
		
		WebElement submit = driver.findElement(By.cssSelector("#fileSubmit"));
		submit.click();
		
		WebElement verifyUploaded = driver.findElement(By.tagName("h1"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(verifyUploaded));
		
		if (verifyUploaded.isDisplayed()) {
		    System.out.println("File upload verified!");
		}else {
			System.out.println("File not upload");
		}

	}

}
