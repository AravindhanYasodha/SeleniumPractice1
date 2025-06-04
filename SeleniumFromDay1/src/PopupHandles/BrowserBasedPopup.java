package PopupHandles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserBasedPopup {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\welcome\\eclipse-workspace\\GroTechMindsSelenium\\SeleniumFromDay1\\TestData\\TestDataPersonal.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Login");
		Row row = sheet.getRow(0);
		
		//Username
		Cell cell = row.getCell(0);
		String mobileNumber =NumberToTextConverter.toText(cell.getNumericCellValue());
		
		//Password
		Cell cell1 = row.getCell(1);
		String pass = cell1.getStringCellValue();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(mobileNumber);

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(pass);

		WebElement submitBtn = driver.findElement(By.name("login"));
		submitBtn.click();
	}

}
