package SeleniumBasicAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAP on Absolute X path on every component present in JSAM file
public class Assignment118 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/welcome/Downloads/learningHTML1.html");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Aravindhan");
		WebElement hint = driver.findElement(By.name("say hello"));
		hint.sendKeys("say hello");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Aravind");
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Aravindhan");
		WebElement lastname = driver.findElement(By.name("lname"));
		boolean lastnameEnabled = lastname.isEnabled();
		System.out.println("Last Name is Enabled : " + lastnameEnabled);
		WebElement submitBtn1 = driver.findElement(By.xpath("(//input[@value='Submit'])[1]"));
		boolean submitIsDispaly1 = submitBtn1.isDisplayed();
		System.out.println("1st Submit Button Is Displayed : " + submitIsDispaly1);
		String[] values = { "Boy", "Girl", "baby" };
		for (int i = 0; i <= values.length - 1; i++) {
			String value = values[i];
			WebElement havingCheckbox = driver.findElement(By.xpath("//input[@value='" + value + "']"));
			havingCheckbox.click();
			boolean checked = havingCheckbox.isSelected();
			System.out.println("Ticked " + value + " is : " + checked);
		}
		WebElement submitBtn2 = driver.findElement(By.xpath("(//input[@value='Submit'])[2]"));
		boolean submitIsDispaly2 = submitBtn2.isDisplayed();
		System.out.println("2nd Submit Button Is Displayed : " + submitIsDispaly2);
		int[] types = { 1, 2 };
		for (int i = 0; i <= types.length - 1; i++) {
			int type = types[i];
			WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[" + type + "]"));
			gender.click();
			boolean checked = gender.isSelected();
			System.out.println("Ticked " + type + " is : " + checked);
		}
		WebElement relocate = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		relocate.click();
		boolean checked = relocate.isSelected();
		System.out.println("Ticked relocate to Bangalore : " + checked);
		WebElement aboutUs = driver.findElement(By.linkText("Click to know about us"));
		aboutUs.click();
		Thread.sleep(10000);
		String expectedTitle = "GroTechMinds - online courses and certification";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Successfully Navigated to GTM page : " + actualTitle);
		} else {
			System.out.println("Failed to Navigate to GTM page : " + actualTitle);
		}
		driver.navigate().back();
		WebElement dropdown = driver.findElement(By.id("Relegion"));
		Select sc = new Select(dropdown);
		List<WebElement> options = sc.getOptions();
		for (WebElement option : options) {
			String eachOption = option.getText();
			System.out.println("Dropdown Options : " + eachOption);
			String value = "Christian";
			if (eachOption == value) {
				Thread.sleep(2000);
				sc.selectByValue(value);
			}
		}
		WebElement signUp = driver.findElement(By.xpath("//input[@value='Sign up']"));
		boolean signUpDispaly = signUp.isDisplayed();
		System.out.println("Sign Up Button Is Displayed : " + signUpDispaly);
	}
}
