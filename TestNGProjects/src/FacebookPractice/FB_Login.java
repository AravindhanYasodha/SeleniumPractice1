package FacebookPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.FetchDataFromExcel;

public class FB_Login extends BaseClass {

	@Test
	public void loginToFacebook() throws IOException {


		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");

		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/");

		String filelocation = "C:\\Users\\welcome\\eclipse-workspace\\GroTechMindsSelenium\\TestNGProjects\\TestData\\TestDataPersonal.xlsx";
		
		String mobileNumber = FetchDataFromExcel.getDataMethod2(filelocation, 0, 0, 0);
		String pass = FetchDataFromExcel.getDataMethod2(filelocation, 0, 0, 1);
		
		

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(mobileNumber);

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(pass);

		WebElement submitBtn = driver.findElement(By.name("login"));
		submitBtn.click();

	}

}
