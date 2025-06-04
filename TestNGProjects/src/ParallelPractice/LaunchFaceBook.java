package ParallelPractice;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.TakeScreenShot;

public class LaunchFaceBook extends BaseClass {

	@Test
	public void Login() throws IOException, InterruptedException {
		driver.get("https://www.facebook.com/login.php/");
		TakeScreenShot.Screenshot(browsername + "FB LoginPage");
		Reporter.log("Facebook Launched");
		Thread.sleep(2000);
	}

}
