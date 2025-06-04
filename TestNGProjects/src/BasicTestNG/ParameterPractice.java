package BasicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPractice {

	WebDriver driver;
	
	//Cross Browser Testing
	@Parameters("browser")
	@Test(priority = 2)
	public void LaunchBrowser(String browsername) throws InterruptedException {

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

		driver.get("http://www.google.com");
		Thread.sleep(3000);
		
		driver.close();

	}

//	@Parameters("browser")
//	@Test(priority = 1)
//	public void LaunchEdge(String browsername) throws InterruptedException {
//
//		if (browsername.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		}
//		if (browsername.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		}
//		if (browsername.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		}
//		driver.get("http://www.google.com");
//		Thread.sleep(3000);
//
//	}
//
//	@Parameters("browser")
//	@Test(priority = 0)
//	public void LaunchFirefox(String browsername) throws InterruptedException {
//
//		if (browsername.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		}
//		if (browsername.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		}
//		if (browsername.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		}
//		driver.get("http://www.google.com");
//		Thread.sleep(3000);
//
//	}

}
