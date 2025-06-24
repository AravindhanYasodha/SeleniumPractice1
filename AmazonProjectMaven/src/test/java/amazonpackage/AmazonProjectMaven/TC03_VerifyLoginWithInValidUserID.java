package amazonpackage.AmazonProjectMaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonUtilities.Amz_BaseClass;
import AmazonUtilities.CommonFunctions;
import AmazonUtilities.RetryClass;
import AmazonUtilities.TestListenerClass;

@Listeners(TestListenerClass.class)
public class TC03_VerifyLoginWithInValidUserID extends Amz_BaseClass {

	public String filelocation = "TestData/AmazonTestData.xlsx";
	String sheetname = "TC03";

	@DataProvider(name = "dataset1")
	public Object[][] dataset() throws EncryptedDocumentException, IOException, NullPointerException {

		Object[][] obj = null;
		try {
			obj = new Object[3][3];

			obj[0][1] = CommonFunctions.getNumericData(filelocation, sheetname, 0, 1);
			obj[0][2] = CommonFunctions.getStringData(filelocation, sheetname, 0, 2);

			obj[1][1] = CommonFunctions.getStringData(filelocation, sheetname, 1, 1);
			obj[1][2] = CommonFunctions.getStringData(filelocation, sheetname, 1, 2);

			obj[2][1] = CommonFunctions.getNumericData(filelocation, sheetname, 2, 1);
			obj[2][2] = CommonFunctions.getStringData(filelocation, sheetname, 2, 2);

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		return obj;
	}

	@Test(dataProvider = "dataset1", retryAnalyzer = RetryClass.class)
	public void VerifyLoginWithInvalidUser(String simple, String username, String password) {
		// Page Objects
		AmzHomePage homepage = new AmzHomePage(driver);
		AmzLoginPage loginpage = new AmzLoginPage(driver);
		AmzCreateAccountPage creataccpage = new AmzCreateAccountPage(driver);

		// Page Methods
		homepage.hoverOnProfile();
		homepage.clickOnSignin();
		loginpage.enterMobileOrEmail(username);
		loginpage.clickOnContinueButton();
		// Verifying Invalid Mobile Number or Invalid Email Address
		if (loginpage.verifyInvalidMobNumInfo() == true || loginpage.verifyInvalidEmailAddInfo() == true) {
			return;
		}
		creataccpage.enterPassword(password);
		loginpage.clickOnSigninButton();
		// Verifying Invalid Password or EmptyPassword
		if (loginpage.verifyIncorrectPasswordInfo() == true || loginpage.verifyEmptyPasswordInfo() == true) {
			return;
		}
		Reporter.log("User Verified Invalid User");
	}
}
