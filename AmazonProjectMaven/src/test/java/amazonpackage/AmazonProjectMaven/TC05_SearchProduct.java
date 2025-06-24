package amazonpackage.AmazonProjectMaven;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonUtilities.Amz_BaseClass;
import AmazonUtilities.CommonFunctions;
import AmazonUtilities.RetryClass;
import AmazonUtilities.TestListenerClass;

@Listeners(TestListenerClass.class)
public class TC05_SearchProduct extends Amz_BaseClass {

	public String filelocation = "TestData/AmazonTestData.xlsx";
	String sheetname = "TC05";

	@DataProvider(name = "dataset")
	public Object[][] productdata() throws IOException {
		Object[][] obj = new Object[4][1];
		obj[0][0] = CommonFunctions.getStringData(filelocation, sheetname, 0, 0);// Shoes
		obj[1][0] = CommonFunctions.getStringData(filelocation, sheetname, 1, 0);// Mobiles
		obj[2][0] = CommonFunctions.getStringData(filelocation, sheetname, 2, 0);// Books
		obj[3][0] = CommonFunctions.getStringData(filelocation, sheetname, 3, 0);// Clocks

		return obj;
	}

	@Test(dataProvider = "dataset", retryAnalyzer = RetryClass.class)
	public void SearchProduct(String product) throws InterruptedException {
		AmzHomePage homepage = new AmzHomePage(driver);
		homepage.enterProductSearch(product);
		homepage.clickProductSearchIcon();
		String currenttitle = homepage.verifyProductTitlePage();
		System.out.println(currenttitle);
		boolean titleverify = currenttitle.equalsIgnoreCase("Amazon.in : " + product);
		Assert.assertEquals(titleverify, true);

	}
}
