package AmazonUtilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Amz_BaseClass {

	public WebDriver driver;
	public String browsername;
	String filelocation = "TestData/AmazonTestData.xlsx";
	String sheetname = "URL";

	@Parameters("browser")
	@BeforeMethod
	public void LaunchBrowser(String browsername) throws IOException {

		if (browsername.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--headless");
			driver = new ChromeDriver();
			Reporter.log("Chrome Launched Successfully");
		}
		if (browsername.equalsIgnoreCase("edge")) {
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--headless");
			driver = new EdgeDriver();
			Reporter.log("Edge Launched Successfully");
		}
		if (browsername.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
			Reporter.log("Firefox Launched Successfully");
		}
		driver.manage().window().maximize();
		driver.get(CommonFunctions.CofigReader("url"));
		Reporter.log("User Launched " + CommonFunctions.CofigReader("url") + " Application");

		do {
			driver.navigate().refresh();
		} while (!driver.getTitle().contains("Online Shopping site in India"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean actualtitle = driver.getTitle().contains("Online Shopping site in India");
		String title = "Online Shopping site in India";
		boolean expectedtitle = title.matches("(.*)Online Shopping(.*)");
		Assert.assertEquals(actualtitle, expectedtitle);
		String titleofPage = driver.getTitle();
		Reporter.log("User in " + titleofPage + " : page");
	}

	@AfterMethod
	public void QuitBrowser() {
		if (driver != null) {
			 //driver.quit();
			Reporter.log("User Quit Browser");
		}
	}

}