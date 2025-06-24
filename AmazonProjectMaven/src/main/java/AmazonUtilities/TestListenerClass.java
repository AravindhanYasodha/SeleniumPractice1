package AmazonUtilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListenerClass implements ITestListener {

	int startcount = 0;
	int successcount = 0;
	int failedcount = 0;
	int skippedcount = 0;

	@Override
	public void onTestStart(ITestResult result) {

		Reporter.log("Test Started " + result.getName());

		Object testClass = result.getInstance();
		if (testClass instanceof Amz_BaseClass) {
			WebDriver driver = ((Amz_BaseClass) testClass).driver;
			try {
				startcount++;
				CommonFunctions.Screenshot(driver,
						result.getInstanceName().replace("amazonpackage.AmazonProjectMaven.", ""), "Started");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Success " + result.getName());

		Object testClass = result.getInstance();
		if (testClass instanceof Amz_BaseClass) {
			WebDriver driver = ((Amz_BaseClass) testClass).driver;
			try {
				successcount++;
				CommonFunctions.Screenshot(driver,
						result.getInstanceName().replace("amazonpackage.AmazonProjectMaven.", ""), "Success");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Failed " + result.getName());
		Object testClass = result.getInstance();
		if (testClass instanceof Amz_BaseClass) {
			WebDriver driver = ((Amz_BaseClass) testClass).driver;
			try {
				failedcount++;
				CommonFunctions.Screenshot(driver,
						result.getInstanceName().replace("amazonpackage.AmazonProjectMaven.", ""), "Failed");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Skipped " + result.getName());

		Object testClass = result.getInstance();
		if (testClass instanceof Amz_BaseClass) {
			WebDriver driver = ((Amz_BaseClass) testClass).driver;
			try {
				skippedcount++;
				CommonFunctions.Screenshot(driver,
						result.getInstanceName().replace("amazonpackage.AmazonProjectMaven.", ""), "Skipped");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public TestListenerClass() {
		// Default Constructor
	}

}
