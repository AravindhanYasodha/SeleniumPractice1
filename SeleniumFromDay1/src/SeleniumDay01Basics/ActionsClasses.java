package SeleniumDay01Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClasses {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebElement advancementElement = driver.findElement(By.xpath("(//a[text()='Advancement'])[1]"));
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
		//HoverOver
		ac.moveToElement(advancementElement).perform();
		Thread.sleep(5000);
		
		//Drag and Drop
		WebElement dragJenkinsContain = driver.findElement(By.xpath("//div[@id='container-2']"));
		WebElement dropArea = driver.findElement(By.xpath("//div[@class='w3-container ' and @id='div2']"));
		ac.dragAndDrop(dragJenkinsContain, dropArea).perform();
		Thread.sleep(2000);
		
		//Revert Drag and Drop
		ac.dragAndDrop(dropArea, dragJenkinsContain).perform();
		Thread.sleep(2000);
		
		//Right Click
		WebElement logo = driver.findElement(By.xpath("(//img[@alt='GroTechMinds logo'])[1]"));
		ac.contextClick(logo).perform();
		
		
		
		
		
		
		
		
		
	}

}
