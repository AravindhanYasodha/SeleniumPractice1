package AmazonPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class LoginToAmazon extends BaseClass{
	
	@Test
	public void login_ToAmazon() throws IOException {
		WebElement signinHover = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions action = new Actions(driver);
		action.moveToElement(signinHover).perform();
		
		WebElement siginBtn = driver.findElement(By.xpath("//span[text()='Sign in']"));
		siginBtn.click();
		
		//driver.getTitle();
		
		//Data Driven
		String fileLocation = "C:\\Users\\welcome\\eclipse-workspace\\GroTechMindsSelenium\\TestNGProjects\\TestData\\TestDataPersonal.xlsx";
		FileInputStream file = new FileInputStream(fileLocation);
		Workbook wb = WorkbookFactory.create(file);
		String mobilenumber = NumberToTextConverter.toText(wb.getSheet("Login").getRow(0).getCell(0).getNumericCellValue());
		//String password = wb.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
		
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys(mobilenumber);
		
		WebElement continueBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		continueBtn.click();
	}

}
