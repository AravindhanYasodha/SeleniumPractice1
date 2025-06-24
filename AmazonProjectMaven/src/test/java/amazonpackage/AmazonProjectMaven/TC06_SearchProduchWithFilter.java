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
public class TC06_SearchProduchWithFilter extends Amz_BaseClass {

	public String filelocation = "TestData/AmazonTestData.xlsx";
	String sheetname = "TC06";

	@DataProvider(name = "dataset")
	public Object[][] productdata() throws IOException {
		Object[][] obj = new Object[1][1];
		obj[0][0] = CommonFunctions.getStringData(filelocation, sheetname, 0, 0);// Clocks

		return obj;
	}

	@Test(dataProvider = "dataset", retryAnalyzer = RetryClass.class)
	public void SearchProduct(String product) throws InterruptedException {
		AmzHomePage homepage = new AmzHomePage(driver);
		AmzSearchResultPage resultpage = new AmzSearchResultPage(driver);
		
		homepage.enterProductSearch(product);
		homepage.clickProductSearchIcon();
		String currenttitle = homepage.verifyProductTitlePage();
		System.out.println(currenttitle);
		boolean titleverify = currenttitle.equalsIgnoreCase("Amazon.in : " + product);
		Assert.assertEquals(titleverify, true);
		resultpage.checkBrandFilter("Vintage Clock");
		resultpage.checkCategory("Wall Clocks");
		resultpage.clickOnSortBy();
		resultpage.clickOnLowToHight();
		resultpage.printProductDetails();

	}

}
