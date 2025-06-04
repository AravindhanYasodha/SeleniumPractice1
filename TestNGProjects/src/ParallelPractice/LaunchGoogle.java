package ParallelPractice;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.TakeScreenShot;

public class LaunchGoogle extends BaseClass {

	@Test
	public void Login() throws IOException, InterruptedException {
		driver.get("https://www.google.com");
		TakeScreenShot.Screenshot(browsername + "Google Page");
		Reporter.log("Google Launched");
		Thread.sleep(2000);
	}

}
