package amazonpackage.AmazonProjectMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class AmzYourAccountPage {

	public WebDriver driver;
	WebDriverWait wait;
	FluentWait<WebDriver> fwait;
	SoftAssert sa;

	@FindBy(xpath = "//h2[contains(text(),'Your Addresses')]")
	WebElement youraddress;

	@FindBy(xpath = "//h2[contains(text(),'Login & security')]")
	WebElement loginandsecurity;

	@FindBy(xpath = "(//div[@class='a-section a-spacing-medium']/span)[1]")
	WebElement otppageverify;

	public void clickOnYourAddress() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(text(),'Your Addresses')]")));
		youraddress.click();
		Reporter.log("User Clicked on the Your Address");
	}

	public void clickOnLoginAndSecurity() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(text(),'Login & security')]")));
		loginandsecurity.click();
		Reporter.log("User Clicked on the Login & Security");
	}

	public boolean verifyOTPPage() {

		boolean actualerror = false;
		try {
			if (wait.until(ExpectedConditions.visibilityOf(otppageverify)) != null) {
				String actualText = otppageverify.getText();
				actualerror = actualText.matches("(.*)Enter verification code(.*)");
				sa.assertEquals(actualerror, true);
				sa.assertAll();
				Reporter.log("OTP Page is Present : " + actualText);
				fwait.until(ExpectedConditions.invisibilityOf(otppageverify));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return actualerror;
	}

	public AmzYourAccountPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
		this.sa = new SoftAssert();
		PageFactory.initElements(driver, this);
	}

}
