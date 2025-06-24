package amazonpackage.AmazonProjectMaven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class AmzSearchResultPage {

	WebDriver driver;
	WebDriverWait wait;

	// Delivery Day
	@FindBy(xpath = "//span[text()='Get It Today']")
	WebElement todayCheckBox;
	@FindBy(xpath = "//span[text()='Get It by Tomorrow']")
	WebElement tomorrowCheckBox;
	@FindBy(xpath = "//span[text()='Get It in 2 Days']")
	WebElement twodaysCheckBox;

	@FindBy(xpath = "//span[@class]/descendant::span[contains(text(),'Sort by')]")
	WebElement sortby;
	@FindBy(xpath = "//li/a[contains(text(),'Price: Low to High')]")
	WebElement lowtoHighPrice;

	@FindBy(xpath = "//div[@role='listitem']")
	List<WebElement> listitem;
	
	@FindBy(xpath = "//div[@role='listitem']/descendant::h2/span")
	List<WebElement> listProductNames;
	
	@FindBy(xpath = "//div[@role='listitem']/descendant::span[@class='a-price-whole']")
	List<WebElement> listWholePrice;

	public WebElement getBrandElement(String brandName) {
		String xpath = "//div[@id='brandsRefinements']/descendant::span[contains(text(),'" + brandName + "')]";
		WebElement wb = driver.findElement(By.xpath(xpath));
		return wb;
	}

	public void checkBrandFilter(String brandName) {
		WebElement byBrand = getBrandElement(brandName);
		wait.until(ExpectedConditions.visibilityOf(byBrand));
		byBrand.click();
	}

	public WebElement getCategoryElement(String cateName) {
		String xpath = "//div[@id='departments']/descendant::span[contains(text(),'" + cateName + "')]";
		WebElement wb = driver.findElement(By.xpath(xpath));
		return wb;
	}

	public void checkCategory(String cateName) {
		WebElement byCategory = getCategoryElement(cateName);
		wait.until(ExpectedConditions.visibilityOf(byCategory));
		byCategory.click();
	}

	public void clickOnSortBy() {
		wait.until(ExpectedConditions.visibilityOf(sortby));
		sortby.click();
	}

	public void clickOnLowToHight() {
		wait.until(ExpectedConditions.visibilityOf(lowtoHighPrice));
		lowtoHighPrice.click();
	}

	public void printProductDetails() {
		wait.until(ExpectedConditions.visibilityOfAllElements(listitem));
		int totalProducts = listitem.size();
		Reporter.log("Total Number of Product is : " + totalProducts);
		try {
			for (WebElement item : listitem) {
				System.out.println(item.getText());
				Reporter.log(item.getText());
				Reporter.log("==========================================");
			}
		} catch (Exception e) {
			System.out.println("Null WebElement Product");
		}
	}

	public void selectProduct(int selectproduct) {
		wait.until(ExpectedConditions.visibilityOfAllElements(listitem));
		int totalProducts = listitem.size();
		for (int i = 0; i <= totalProducts-1; i++) {
			if(i==selectproduct) {
				Reporter.log("Selected Product is : ");
				Reporter.log(listitem.get(i).getText());
				listitem.get(i).click();
				Reporter.log("========================================");
			}
		}
	}

	public AmzSearchResultPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
}
