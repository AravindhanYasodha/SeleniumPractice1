package AmazonUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {

	public WebDriver driver;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public CommonFunctions(WebDriver driver) {
		this.driver = driver;
	}

	// Utilizing Random String without Length
	public static String generateRandomString(int length) {

		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			sb.append(characters.charAt(random.nextInt(characters.length())));
		}

		return sb.toString();

	}

	// Utilizing Random Numeric with Length
	public static String generateRandomNumber() {

		String characters = "0123456789";
		String prefi = "94";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 8;

		for (int i = 0; i < length; i++) {
			sb.append(characters.charAt(random.nextInt(characters.length())));
		}

		return prefi + sb.toString();

	}

	// Read Data from Config.properties file
	public static String CofigReader(String key) {
		Properties prop = new Properties();
		String fileLocation = "C:\\Users\\welcome\\eclipse-workspace\\GroTechMindsSelenium\\AmazonProjectMaven\\TestData\\config.properties";
		try {
			FileInputStream file = new FileInputStream(fileLocation);
			prop.load(file);
		} catch (IOException e) {
			e.getMessage();
		}
		return prop.getProperty(key);
	}

	// DDT Read and Write String data from Excel Sheet
	public static String getStringData(String filelocation, String sheetname, int rowindex, int cellindex)
			throws IOException {

		FileInputStream fs = new FileInputStream(filelocation);
		Workbook wb = WorkbookFactory.create(fs);
		String stringValue = wb.getSheet(sheetname).getRow(rowindex).getCell(cellindex).getStringCellValue();

		return stringValue;
	}

	// DDT Read and Write Numeric data from Excel Sheet
	public static String getNumericData(String filelocation, String sheetname, int rowindex, int cellindex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fs = new FileInputStream(filelocation);
		Workbook wb = WorkbookFactory.create(fs);
		String numericValue = NumberToTextConverter
				.toText(wb.getSheet(sheetname).getRow(rowindex).getCell(cellindex).getNumericCellValue());

		return numericValue;
	}

	// TakeScreenshot
	public static void Screenshot(WebDriver driver, String classname, String filename) throws IOException {

		Date dt = new Date();
		int year = dt.getYear();
		int month = dt.getMonth();
		int date = dt.getDate();
		int hour = dt.getHours();
		int minutes = dt.getMinutes();
		int seconds = dt.getSeconds();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\welcome\\eclipse-workspace\\GroTechMindsSelenium\\AmazonProjectMaven\\target\\" + classname
						+ "_" + year + month + date + hour + minutes + seconds + "_" + filename + ".png");
		FileHandler.copy(source, destination);

	}

}
