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
public class TC04_EditProfileInformation extends Amz_BaseClass {

	public String filelocation = "TestData/AmazonTestData.xlsx";
	String sheetname = "TC04";

	@DataProvider(name = "dataset")
	public Object[][] dataset() throws EncryptedDocumentException, IOException {
		Object[][] obj = new Object[1][3];
		obj[0][0] = CommonFunctions.getNumericData(filelocation, sheetname, 0, 0);
		obj[0][1] = CommonFunctions.getStringData(filelocation, sheetname, 0, 1);
		obj[0][2] = CommonFunctions.getStringData(filelocation, sheetname, 0, 2);

		return obj;
	}

	@Test(dataProvider = "dataset", retryAnalyzer = RetryClass.class)
	public void EditProfileInformation(String username, String password, String userprofile)
			throws InterruptedException {
		// Page Objects
		AmzHomePage homepage = new AmzHomePage(driver);
		AmzLoginPage loginpage = new AmzLoginPage(driver);
		AmzCreateAccountPage createaccpage = new AmzCreateAccountPage(driver);
		AmzYourAccountPage youraccpage = new AmzYourAccountPage(driver);
		AmzLoginSecurityPage loginsecuritypage = new AmzLoginSecurityPage(driver);

		// Page Methods
		homepage.hoverOnProfile();
		homepage.clickOnSignin();
		loginpage.enterMobileOrEmail(username);
		loginpage.clickOnContinueButton();
		createaccpage.enterPassword(password);
		loginpage.clickOnSigninButton();
		homepage.verifyProfileUser(userprofile);

		homepage.hoverOnProfile();
		homepage.clickOnYourAccountLink();
		youraccpage.clickOnLoginAndSecurity();
		// It ask Otp
		boolean otp = youraccpage.verifyOTPPage();
		System.out.println("Is OTP page is Present? : " + otp);
		loginsecuritypage.verifyLoginSecurityPage();
		loginsecuritypage.clickOnNameEdit();
		String currentname = loginsecuritypage.enterNewName("Rayana Aravind", "Aravind Rayana");
		System.out.println("Current User Name is : " + currentname);
		loginsecuritypage.clickOnSaveChangesBtn();
		loginsecuritypage.verifyNameUpdated();
		String newmane = loginsecuritypage.verifyNewName();
		// homepage.verifyProfileUser(newmane);

		// Repeat
		homepage.hoverOnProfile();
		homepage.clickOnYourAccountLink();
		youraccpage.clickOnLoginAndSecurity();
		// It ask Otp
		boolean otp2 = youraccpage.verifyOTPPage();
		System.out.println("Is OTP page is Present? : " + otp2);
		loginsecuritypage.verifyLoginSecurityPage();
		loginsecuritypage.clickOnNameEdit();
		String currentname2 = loginsecuritypage.enterNewName("Rayana Aravind", "Aravind Rayana");
		System.out.println("Current User Name is : " + currentname);
		loginsecuritypage.clickOnSaveChangesBtn();
		loginsecuritypage.verifyNameUpdated();
		String oldname = loginsecuritypage.verifyNewName();

//		youraccpage.clickOnYourAddress();
//		youraddresspage.clickOnEditforAddress();
//		String Enterednewname = youraddresspage.enterFullNameText(CommonFunctions.generateRandomString(8));
//		youraddresspage.clickOnUpdateAddressBtn();
//		String newprofilename = youraddresspage.verifyNewNameAddress();
//		boolean verifyNewProfilename = Enterednewname.equals(newprofilename);
//		Assert.assertEquals(verifyNewProfilename, true);
//		Reporter.log("User Verified Entered New Name : " + Enterednewname + ", Updated New Name : " + newprofilename);

	}
}
