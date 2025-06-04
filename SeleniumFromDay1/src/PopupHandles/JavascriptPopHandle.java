package PopupHandles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class JavascriptPopHandle {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://practice-automation.com/popups/");
		
		driver.findElement(By.id("alert")).click(); 
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirm")).click(); 
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("prompt")).click(); 	
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Aravindhan");
		Thread.sleep(2000);
		alert.accept();

	}

}
