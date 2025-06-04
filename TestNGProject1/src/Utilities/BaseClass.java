package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver;
	public static String browsername;

	@Parameters("browser")
	@BeforeSuite
	public void InitilizeBrowser(String browsername) throws InterruptedException {

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("Chrome Launched Successfully");
		}
		if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			Reporter.log("Chrome Launched Successfully");
		}
		if (browsername.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			Reporter.log("Chrome Launched Successfully");
		}
	}

	@AfterSuite
	public void tearDown() throws InterruptedException {
		if (driver != null) {
			//driver.quit();
		}
		Thread.sleep(2000);
	}

}
