package PopupHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindowPopup {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement googleButton = driver.findElement(By.cssSelector(".google-text"));
		googleButton.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it =  allWindows.iterator();
		String parentID = it.next();
		System.out.println(parentID);
		String childID = it.next();
		System.out.println(childID);
		driver.switchTo().window(childID);
		driver.close();
		

	}

}
