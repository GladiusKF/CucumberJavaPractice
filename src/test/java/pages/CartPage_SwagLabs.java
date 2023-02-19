package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage_SwagLabs {
	
	protected WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id=\'cart_contents_container\']/div/div[1]/div[3]/div[1]")
	WebElement txt_itemQty;
	
	@FindBy(xpath = "//*[@id='item_4_title_link']")
	WebElement label_backpackItem;
	
	@FindBy(xpath = "//*[@id=\'continue-shopping\']")
	WebElement btn_continueShopping;
	
	
	
	public CartPage_SwagLabs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public boolean cartItemIsDisplayed() {
		return label_backpackItem.isDisplayed();
	}
	
	public void clickContinueShopping() {
		btn_continueShopping.click();
	
	}
}