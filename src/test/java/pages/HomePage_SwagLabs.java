package pages;



import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage_SwagLabs {
	
	protected WebDriver driver;

	@FindBy(xpath = "//div[@class='app_logo']")
	WebElement img_logo;
	
	@FindBy(xpath = "//button[@id= 'react-burger-menu-btn']")
	WebElement btn_HomeBurgerMenu;
	
	@FindBy(xpath = "//a[@id= 'logout_sidebar_link']")
	WebElement btn_ALogoutSideBar;
	
	@FindBy(xpath = "//a[@id= 'about_sidebar_link']")
	WebElement btn_AboutSideBar;
	
	@FindBy(xpath = "//a[@id= 'reset_sidebar_link']")
	WebElement btn_ResetAppStateSideBar;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement btn_AddtoCartBackPack;
	
	@FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
	WebElement btn_RemovToCareBackpack;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement btn_Cart;
	
	public HomePage_SwagLabs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickBurgerMenuBtn() {
		btn_HomeBurgerMenu.click();
	}

	public void clickALogoutSideBarBtn() {
		btn_ALogoutSideBar.click();
	}
	
	public boolean HomePageLogoIsDisplayed() {
		return img_logo.isDisplayed();
		
	}
	
	
	public void clickaddToCartBackpack() {
		btn_AddtoCartBackPack.click();
	}
	
	public void clickCartButton() {
		btn_Cart.click();
	}
	
	public void removeLabelIsDisplayed() {
		assertEquals(btn_RemovToCareBackpack.getText(),"REMOVE");
		
	}
	
}
