package FacebookPKG.FacebookProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FacebookPKG.FacebookProject.FacebookLoginPage;

public class FacebookLoginTest{

	public WebDriver driver;

	@Test
	public void loginToFacebook() {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FacebookLoginPage fb = new FacebookLoginPage(driver);
		fb.loginToFacebook("Aravindhan", "asde");
		
	}
	
}
