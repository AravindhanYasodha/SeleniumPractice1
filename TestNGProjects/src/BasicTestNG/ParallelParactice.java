package BasicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelParactice {

	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void InitializeBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("Chrome Launched Successfully");
		}
		if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			Reporter.log("Edge Launched Successfully");
		}
		if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			Reporter.log("Firefox Launched Successfully");
		}

	}

	@Test
	public void LaunchApplication() throws InterruptedException {

		driver.get("http://www.amazon.in");
		Thread.sleep(3000);
	}

	@AfterMethod
	public void TearDown() {

		if (driver != null) {
			driver.close();
		}
	}

}
