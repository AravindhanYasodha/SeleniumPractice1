package BasicTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelPractice2 extends BaseClass {

	int count=0;
	

	@Test
	public void LaunchApplication() {
		driver.get("http://www.google.com");
		Reporter.log(count + " : Application Launched Successfully");
		count++;
	}

}
