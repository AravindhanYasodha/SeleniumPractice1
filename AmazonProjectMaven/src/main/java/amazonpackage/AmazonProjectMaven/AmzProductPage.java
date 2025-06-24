package amazonpackage.AmazonProjectMaven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmzProductPage {
	
	@FindBy(xpath = "//span[@id='productTitle']")
	WebElement productName;
	
	@FindBy(xpath = "//div[@id='apex_desktop']//span[@class='a-price-whole']")
	WebElement productWholePrice;
	
	@FindBy(xpath = "//span[text()='Add to Cart']")
	WebElement addtoCartBtn;

}
