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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class AmzLoginSecurityPage {

	WebDriver driver;
	WebDriverWait wait;
	FluentWait<WebDriver> fwait;
	JavascriptExecutor js;
	SoftAssert soft;
	Actions ac;

	@FindBy(xpath = "//h1[contains(text(),'Login and Security')]")
	WebElement headingLoginSecurity;

	@FindBy(xpath = "//span[@id='NAME_BUTTON']/span/a")
	WebElement nameEditBtn;

	@FindBy(xpath = "//div[@class='a-row a-spacing-large']//input[@type='text']")
	WebElement newNameText;

	@FindBy(xpath = "//span[contains(text(),'Save changes')]")
	WebElement savechangesBtn;

	@FindBy(xpath = "//div[contains(text(),'Name updated')]")
	WebElement nameupdated;

	@FindBy(xpath = "//span[@id='NAME_SUBTITLE']")
	WebElement newname;

	public void verifyLoginSecurityPage() {
		fwait.until(ExpectedConditions.visibilityOf(headingLoginSecurity));
		try {
			headingLoginSecurity.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void clickOnNameEdit() {
		wait.until(ExpectedConditions.visibilityOf(nameEditBtn));
		nameEditBtn.click();
		Reporter.log("Used Clicked Edit button in Name");
	}

	public String enterNewName(String name1, String name2) {

		// String currentname = newNameText.getText();
		String currentname = (String) js.executeScript("return arguments[0].textContent;", newNameText);
		System.out.println("Text from element: " + currentname);

		if (currentname.equalsIgnoreCase(name1)) {
			wait.until(ExpectedConditions.visibilityOf(newNameText));
			newNameText.sendKeys(Keys.CONTROL + "a");
			newNameText.sendKeys(Keys.BACK_SPACE);
			newNameText.sendKeys(name2);
		} else if (!currentname.equalsIgnoreCase(name1)) {
			wait.until(ExpectedConditions.visibilityOf(newNameText));
			newNameText.sendKeys(Keys.CONTROL + "a");
			newNameText.sendKeys(Keys.BACK_SPACE);
			newNameText.sendKeys(name1);
		}
		Reporter.log("Current User Name is : " + currentname);
		return currentname;
	}

	public void clickOnSaveChangesBtn() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(savechangesBtn));
		Thread.sleep(2000);
		if (savechangesBtn.isEnabled()) {
			ac.moveToElement(savechangesBtn).perform();
			ac.click(savechangesBtn).perform();
		} else {
			Thread.sleep(2000);
			driver.navigate().refresh();
			ac.moveToElement(savechangesBtn).perform();
			ac.click(savechangesBtn).perform();;
		}
		// savechangesBtn.sendKeys(Keys.ENTER);
		// savechangesBtn.click();
		Reporter.log("Used Clicked Save Changes button");
	}

	public boolean verifyNameUpdated() {
		boolean actual = false;
		try {
			if (wait.until(ExpectedConditions.visibilityOf(nameupdated)) != null) {
				String actualtext = nameupdated.getText();
				actual = actualtext.matches("(.*)Name updated(.*)");
				soft.assertEquals(actual, true);
				soft.assertAll();
				Reporter.log("Verified Invalid Mobile Number : " + actualtext);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return actual;
	}

	public String verifyNewName() {
		String newn = null;
		wait.until(ExpectedConditions.visibilityOf(newname));
		if (newname.isDisplayed()) {
			newn = newname.getText();
			Reporter.log("Used Verify New Name : " + newn);
		}
		return newn;

	}

	public AmzLoginSecurityPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
		this.js = (JavascriptExecutor) driver;
		this.soft = new SoftAssert();
		this.ac = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

}
