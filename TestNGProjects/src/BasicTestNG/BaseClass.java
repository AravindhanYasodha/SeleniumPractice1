package BasicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
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
	
	@AfterMethod
	public void tearDown() {
		if(driver != null) {
			driver.close();
		}
	}
	

}
