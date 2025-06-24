package SeleniumBasicAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAP to perform item search using relative Xpath for both flipkart and amazon
public class Assignment119 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		// Amazon
		driver.get("https://www.amazon.in/");
		String amazonHomepage = driver.getTitle();
		System.out.println("Amazon Home Page Title : "+amazonHomepage);
		WebElement amazonSearchBar = driver.findElement(By.xpath("//input[@type='text']"));
		amazonSearchBar.sendKeys("Shoes" + Keys.ENTER);
		Thread.sleep(2000);
		String amazonShoespage = driver.getTitle();
		System.out.println("Amazon Shoes Page Title : "+amazonShoespage);

		// Flipkart
		driver.get("https://www.flipkart.com/");
		String flipkartHomepage = driver.getTitle();
		System.out.println("Flipkart Home Page Title : "+flipkartHomepage);
		WebElement flipkartSearchBar = driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]"));
		flipkartSearchBar.sendKeys("Shoes" + Keys.ENTER);
		Thread.sleep(2000);
		String flipkartShoespage = driver.getTitle();
		System.out.println("Flipkart Shoes Page Title : "+flipkartShoespage);
	}

}
