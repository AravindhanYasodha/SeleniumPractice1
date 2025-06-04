package GroMindTechApp;

import java.time.Duration;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchGTMApplication extends BaseClassGMT {

	@Parameters("url")
	@Test
	public void launchApplication(String appUrl) {
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log(appUrl + " Application Launched");
	}
}
