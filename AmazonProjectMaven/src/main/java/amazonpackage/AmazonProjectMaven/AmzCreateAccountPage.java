package amazonpackage.AmazonProjectMaven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class AmzCreateAccountPage {

	public WebDriver driver;
	WebDriverWait wait;

	@FindBy(id = "ap_phone_number")
	WebElement mobileNumText;

	@FindBy(xpath = "//input[@name='customerName']")
	WebElement yourNameText;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordText;

	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement verifyMobNumBtn;

	public void enterMobileNumber(String mobilenumber) {
		wait.until(ExpectedConditions.visibilityOf(mobileNumText));
		mobileNumText.sendKeys(mobilenumber);
		Reporter.log("User Entered : " + mobilenumber);
	}

	public void enterYourName(String yourname) {
		wait.until(ExpectedConditions.visibilityOf(yourNameText));
		yourNameText.sendKeys(yourname);
		Reporter.log("User Entered : " + yourname);
	}

	public void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(passwordText));
		passwordText.sendKeys(password);
		Reporter.log("User Entered Password : password");
	}

	public void clickOnVerifyMobNumBtn() {
		wait.until(ExpectedConditions.visibilityOf(verifyMobNumBtn));
		verifyMobNumBtn.click();
		Reporter.log("User Clicked Verify Mobile number Button");
	}

	public AmzCreateAccountPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
}
