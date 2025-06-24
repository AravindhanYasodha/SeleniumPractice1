package amazonpackage.AmazonProjectMaven;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonUtilities.Amz_BaseClass;
import AmazonUtilities.CommonFunctions;
import AmazonUtilities.RetryClass;
import AmazonUtilities.TestListenerClass;

@Listeners(TestListenerClass.class)
public class TC01_NewUserRegistration extends Amz_BaseClass {

	@Test(retryAnalyzer = RetryClass.class)
	public void NewUserRegistration() throws IOException {
		//Page Objects
		AmzHomePage homepage = new AmzHomePage(driver);
		AmzLoginPage loginpage = new AmzLoginPage(driver);
		AmzCreateAccountPage createaccpage = new AmzCreateAccountPage(driver);
		
		//Page Methods
		homepage.hoverOnProfile();
		homepage.clickOnStartHereLink();
		loginpage.enterMobileOrEmail(CommonFunctions.generateRandomString(10) + "@gmail.com");
		loginpage.clickOnContinueButton();
		loginpage.clickOnProceedCreatAccBtn();
		createaccpage.enterMobileNumber(CommonFunctions.generateRandomNumber());
		createaccpage.enterYourName(CommonFunctions.generateRandomString(10));
		createaccpage.enterPassword(CommonFunctions.generateRandomString(10));
		createaccpage.clickOnVerifyMobNumBtn();
		// Verifying Authentication
		boolean actualtitle = driver.getTitle().contains("Authentication required");
		String title = "Authentication required";
		boolean expectedtitle = title.equals("Authentication required");
		Assert.assertEquals(actualtitle, expectedtitle);
	}

}
