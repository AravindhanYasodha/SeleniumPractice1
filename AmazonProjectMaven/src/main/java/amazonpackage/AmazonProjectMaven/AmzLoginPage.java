package amazonpackage.AmazonProjectMaven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class AmzLoginPage {

	public WebDriver driver;
	WebDriverWait wait;
	FluentWait<WebDriver> fwait;
	SoftAssert sa;

	@FindBy(name = "email")
	WebElement userMobileNumText;

	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement continueBtn;

	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement proceedCreatAccBtn;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement siginBtn;

	@FindBy(xpath = "//div[@id='invalid-phone-alert']/div/div")
	WebElement invalidMobNum;

	@FindBy(xpath = "//div[@id='invalid-email-alert']/div/div")
	WebElement invalidEmailAdd;

	@FindBy(xpath = "//div[@id='auth-error-message-box']/descendant::div/div")
	WebElement incorrectPassword;

	@FindBy(xpath = "//div[@id='auth-password-missing-alert']/descendant::div/div")
	WebElement emptyPassword;

	public void enterMobileOrEmail(String MobileOrEmail) {
		wait.until(ExpectedConditions.visibilityOf(userMobileNumText));
		userMobileNumText.sendKeys(MobileOrEmail);
		Reporter.log("User Entered Mobile# or Email : " + MobileOrEmail);
	}

	public boolean verifyInvalidMobNumInfo() {

		boolean actualerror = false;
		try {
			if (fwait.until(ExpectedConditions.visibilityOf(invalidMobNum)) != null) {
				String actualText = invalidMobNum.getText();
				actualerror = actualText.matches("(.*)Invalid mobile number(.*)");
				sa.assertEquals(actualerror, true);
				sa.assertAll();
				Reporter.log("Verified Invalid Mobile Number : " + actualText);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return actualerror;

	}

	public boolean verifyInvalidEmailAddInfo() {

		boolean actualerror = false;
		try {
			if (fwait.until(ExpectedConditions.visibilityOf(invalidEmailAdd)) != null) {
				String actualText = invalidEmailAdd.getText();
				actualerror = actualText.matches("(.*)Invalid email address.(.*)");
				sa.assertEquals(actualerror, true);
				sa.assertAll();
				Reporter.log("Verified Invalid Email Address : " + actualText);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return actualerror;
	}

	public boolean verifyIncorrectPasswordInfo() {

		boolean actualerror = false;
		try {
			if (fwait.until(ExpectedConditions.visibilityOf(incorrectPassword)) != null) {
				String actualText = incorrectPassword.getText();
				actualerror = actualText.matches("(.*)Your password is incorrect(.*)");
				sa.assertEquals(actualerror, true);
				sa.assertAll();
				Reporter.log("Verified Incorrect Password : " + actualText);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return actualerror;
	}

	public boolean verifyEmptyPasswordInfo() {

		boolean actualerror = false;
		try {
			if (fwait.until(ExpectedConditions.visibilityOf(emptyPassword)) != null) {
				String actualText = emptyPassword.getText();
				actualerror = actualText.matches("(.*)Enter your password(.*)");
				sa.assertEquals(actualerror, true);
				sa.assertAll();
				Reporter.log("Verified Incorrect Password : " + actualText);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return actualerror;
	}

	public void clickOnContinueButton() {
		wait.until(ExpectedConditions.visibilityOf(continueBtn));
		continueBtn.click();
		Reporter.log("User Clicked Continue Button");
	}

	public void clickOnProceedCreatAccBtn() {
		wait.until(ExpectedConditions.visibilityOf(proceedCreatAccBtn));
		proceedCreatAccBtn.click();
		Reporter.log("User Clicked Proceed Create Account Button");
	}

	public void clickOnSigninButton() {
		wait.until(ExpectedConditions.visibilityOf(siginBtn));
		siginBtn.click();
		Reporter.log("User Clicked Sigin Button");
	}

	public AmzLoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
		this.sa = new SoftAssert();
		PageFactory.initElements(driver, this);

	}
}
