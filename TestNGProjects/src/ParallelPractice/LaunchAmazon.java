package ParallelPractice;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.TakeScreenShot;

public class LaunchAmazon extends BaseClass {

	@Test
	public void Login() throws IOException, InterruptedException {
		driver.get("https://www.amazon.in");
		TakeScreenShot.Screenshot(browsername + "Amazon Home");
		Reporter.log("Amazon Launched");
		Thread.sleep(2000);
	}
}
