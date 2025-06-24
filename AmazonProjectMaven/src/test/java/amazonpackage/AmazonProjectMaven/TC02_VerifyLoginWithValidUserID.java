package amazonpackage.AmazonProjectMaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonUtilities.Amz_BaseClass;
import AmazonUtilities.CommonFunctions;
import AmazonUtilities.RetryClass;
import AmazonUtilities.TestListenerClass;

@Listeners(TestListenerClass.class)
public class TC02_VerifyLoginWithValidUserID extends Amz_BaseClass {

	public String filelocation = "TestData/AmazonTestData.xlsx";
	String sheetname = "TC02";

	@DataProvider(name = "dataset")
	public Object[][] dataset() throws EncryptedDocumentException, IOException {
		Object[][] obj = new Object[1][2];
		obj[0][0] = CommonFunctions.getNumericData(filelocation, sheetname, 0, 0);
		obj[0][1] = CommonFunctions.getStringData(filelocation, sheetname, 0, 1);

		return obj;
	}

	@Test(dataProvider = "dataset", retryAnalyzer = RetryClass.class)
	public void VerifyLoginWithValidUser(String username, String password) throws IOException {
		//Page Objects
		AmzHomePage homepage = new AmzHomePage(driver);
		AmzLoginPage loginpage = new AmzLoginPage(driver);
		AmzCreateAccountPage createaccpage = new AmzCreateAccountPage(driver);

		//Page Methods
		homepage.hoverOnProfile();
		homepage.clickOnSignin();
		loginpage.enterMobileOrEmail(username);
		loginpage.clickOnContinueButton();
		createaccpage.enterPassword(password);
		loginpage.clickOnSigninButton();
		homepage.verifyProfileUser("Aravind");

	}

}
