package amazonpackage.AmazonProjectMaven;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class AmzYourAddressPage {

	public WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Actions ac;

//	int editnumber;
//	String editaddressxpath = "(//a[contains(text(),'Edit')])["+editnumber+"]";
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[2]")
	WebElement editaddresshyper;

	@FindBy(xpath = "//input[contains(@id,'FullName')]")
	WebElement enterfullnametext;

	@FindBy(xpath = "//div[contains(@id,'enterAddressFormContainer')]/span[@data-action='form-submit-button-click']/span/span/input")
	WebElement updateaddressBtn;

	@FindBy(xpath = "(//div[contains(@class,'a-span-last')]//h5[@id='address-ui-widgets-FullName'])[1]")
	WebElement name2ndAddress;

	public String verifyNewNameAddress() {
		wait.until(ExpectedConditions.visibilityOf(name2ndAddress));
		String name = name2ndAddress.getText();
		return name;
	}

	public void clickOnEditforAddress() {
		wait.until(ExpectedConditions.visibilityOf(editaddresshyper));
		editaddresshyper.click();
		Reporter.log("User Clicked on Edit Hyperlink");
	}

	public String enterFullNameText(String enterfullname) {
		wait.until(ExpectedConditions.visibilityOf(enterfullnametext));
		String oldfullname = enterfullnametext.getDomAttribute("value");
		if (oldfullname == null) {
			enterfullnametext.sendKeys(enterfullname);
			Reporter.log("User Entered Fullname : " + enterfullname);
		} else {
			enterfullnametext.sendKeys(Keys.CONTROL + "a");
			enterfullnametext.sendKeys(Keys.BACK_SPACE);
			enterfullnametext.sendKeys(enterfullname);
			Reporter.log("User Removed Old Fullname : " + oldfullname);
			Reporter.log("User Entered New Fullname : " + enterfullname);
		}
		return enterfullname;
	}

	public void clickOnUpdateAddressBtn() {
		ac.moveToElement(updateaddressBtn).perform();
		wait.until(ExpectedConditions.visibilityOf(updateaddressBtn));
		js.executeScript("arguments[0].click();", updateaddressBtn);
		// updateaddressBtn.click();
		Reporter.log("User Clicked on Update Address Button");
	}

	public AmzYourAddressPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.js = (JavascriptExecutor) driver;
		this.ac = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

}
