package SeleniumBasicAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch and Close the Browser
public class Assignment108 {

	public static void main(String[] args) throws InterruptedException {

		// Browser Launched
		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);
		// Browser Closed
		driver.close();
	}

}
