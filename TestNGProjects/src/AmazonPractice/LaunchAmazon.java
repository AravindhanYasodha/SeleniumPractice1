package AmazonPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class LaunchAmazon extends BaseClass {

	@Test
	public void launchApplication() throws InterruptedException {

		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		String Actualcaptchatitle = driver.getTitle();
		System.out.println(Actualcaptchatitle);
		String Expectecaptchatitle = "Amazon.in";

		if (Actualcaptchatitle.equals(Expectecaptchatitle)) {
			driver.navigate().refresh();
		}
		if (Actualcaptchatitle.equals(Expectecaptchatitle)) {
			driver.navigate().refresh();
		}
		if (Actualcaptchatitle.equals(Expectecaptchatitle)) {
			driver.navigate().refresh();
		} else {
			String hometitle = driver.getTitle();
			System.out.println(hometitle);
			Assert.assertEquals(hometitle,
					"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		}
	}

}
