package OtherPractices;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectHighestOrLowestPriceProduct {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("Mobile phones" + Keys.ENTER);

		List<WebElement> allWholePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		Map<WebElement, Integer> map = new HashMap<WebElement, Integer>();
		
//		for (WebElement wholeprice : allWholePrice) {
//			if (wholeprice != null) {
//				map.put(wholeprice, Integer.parseInt((wholeprice).getText().replaceAll(",", "")));
//			}
//		}

		for (int i = 0; i <= allWholePrice.size() - 1; i++) {

			if (allWholePrice.get(i) != null) {
				map.put(allWholePrice.get(i), Integer.parseInt((allWholePrice.get(i)).getText().replaceAll(",", "")));
			}
		}

		List<Entry<WebElement, Integer>> le = new ArrayList<Map.Entry<WebElement, Integer>>(map.entrySet());
		le.sort(Entry.comparingByValue());

		for (Entry e : le) {
			System.out.println(e.getValue());
		}
		le.get(0).getKey().click();

		Set<String> ls = driver.getWindowHandles();
		Iterator<String> it = ls.iterator();
		if (it.hasNext() == true) {
			it.next();
		}
		int size = le.size();
		le.get(size - 1).getKey().click();

	}

}
