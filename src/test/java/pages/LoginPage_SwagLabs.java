package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_SwagLabs {
	
	protected WebDriver driver;

	@FindBy(xpath = "//input[@id='user-name']")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement btn_login;
	
	@FindBy(xpath = "//div[@class= 'login_logo']")
	WebElement img_loginLogo;
	
	
	public LoginPage_SwagLabs(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
		
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	
	
	public boolean LoginPageLogoIsDisplayed() {
		return img_loginLogo.isDisplayed();
		
	}
}
