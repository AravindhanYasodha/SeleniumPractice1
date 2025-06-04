package SeleniumDay01Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay01 {

	public static void main(String[] args)  {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.close();
		
		

	}

}
