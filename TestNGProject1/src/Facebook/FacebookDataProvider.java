package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookDataProvider {
	
	@DataProvider(name="LoginData1")
	public Object[][] TestData() {
		Object[][] data1=new Object[5][2];
		//1st Row Login data Valid UN and Valid PW
		data1[0][0]="8807881338";
		data1[0][1]="Gunapaaroli@1210";
		//2st Row Login data InValid UN and Valid PW
		data1[1][0]="sdfafef@sdvsd";
		data1[1][1]="Gunapaaroli@1210";
		//3st Row Login data Valid UN and InValid PW
		data1[2][0]="8807881338";
		data1[2][1]="acevfd";
		//4st Row Login data InValid UN and InValid PW
		data1[3][0]="szfesrf";
		data1[3][1]="vsfvvszefe";
		//5st Row Login data Null UN and Null PW
		data1[4][0]="";
		data1[4][1]="";
		
		return data1;
	}

	@Test(dataProvider = "LoginData1")
	public void loginToFacebook(String UN, String PW) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login.php/");

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(UN);

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(PW);

		WebElement submitBtn = driver.findElement(By.name("login"));
		submitBtn.click();
	}
}
