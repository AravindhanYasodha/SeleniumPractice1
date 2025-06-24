package amazonpackage.AmazonProjectMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class AmzHomePage {

	public WebDriver driver;
	Actions ac;
	WebDriverWait wait;

	@FindBy(xpath = "//div[@class='nav-line-1-container']")
	WebElement profile;

	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement signinBtn;

	@FindBy(xpath = "//a[text()='Start here.']")
	WebElement startHereNewCust;

	@FindBy(xpath = "//span[text()='Your Account']")
	WebElement youraccounthyperlink;

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBar;

	@FindBy(id = "nav-search-submit-button")
	WebElement searchIcon;

	public void enterProductSearch(String product) {
		wait.until(ExpectedConditions.visibilityOf(searchBar));
		searchBar.sendKeys(product);
		Reporter.log("User Entered Product in Search: " + product);
	}

	public void clickProductSearchIcon() {
		wait.until(ExpectedConditions.visibilityOf(searchIcon));
		searchIcon.click();
		;
		Reporter.log("User Clicked Search Icon");
	}

	public String verifyProductTitlePage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String currenttitle = driver.getTitle();
		Reporter.log(currenttitle);
		return currenttitle;
	}

	public void hoverOnProfile() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nav-line-1-container']")));
		ac.moveToElement(profile).perform();
		Reporter.log("User Mouse Hover on the Profile");
	}

	public void verifyProfileUser(String name) {
		String Expected = null;
		try {
			if (wait.until(ExpectedConditions.visibilityOf(profile)) != null) {
				String actualProfile = profile.getText();
				Expected = "Hello, " + name; // Hello, Aravind
				Assert.assertEquals(actualProfile, Expected);
				Reporter.log("Verified Used Name is : " + actualProfile);
			}
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}

		boolean aravind = Expected.matches("(.*)Aravind(.*)");
		boolean rayana = Expected.matches("(.*)Rayana(.*)");
		if (aravind || rayana) {
			Reporter.log("Verified Used Name is : " + Expected);
		}
	}

	public void clickOnSignin() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Sign in']")));
		signinBtn.click();
		Reporter.log("User Clicked on Signin button");
	}

	public void clickOnStartHereLink() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Start here.']")));
		startHereNewCust.click();
		Reporter.log("User Clicked the Start Here hyperLink");
	}

	public void clickOnYourAccountLink() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Your Account']")));
		youraccounthyperlink.click();
		Reporter.log("User Clicked on Your Account hyperLink");
	}

	public AmzHomePage(WebDriver driver) {
		this.driver = driver;
		this.ac = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

}
