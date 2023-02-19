package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.CartPage_SwagLabs;
import pages.HomePage_SwagLabs;
import pages.LoginPage_SwagLabs;

public class Steps_SwagLabs {

	WebDriver driver = null;
	LoginPage_SwagLabs login_SL;
	HomePage_SwagLabs homePage_SL;
	CartPage_SwagLabs cartPage_SL;
	String username = "standard_user";
	String password = "secret_sauce";
	
	@Before("@First")
	public void open_browser() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.drive", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("browser is open");
	}

	@Before("@Second")
	public void LoginToSwagLabs() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.drive", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("browser is open");
		
		user_enter_valid_username_and_Password(username, password);
		click_login_button();
		
	}	
	
	
	@After
	public void exit_browser() {
		homePage_SL.clickBurgerMenuBtn();
		homePage_SL.clickALogoutSideBarBtn();
		assertEquals(true, login_SL.LoginPageLogoIsDisplayed());
		driver.quit();
		System.out.print("Browser is successfully closed");
	}
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.print("user is on login page");
	}

	@When("user enter valid {string} and {string}")
	public void user_enter_valid_username_and_Password(String username, String password) {
		
		login_SL = new LoginPage_SwagLabs(driver);
		
		login_SL.enterUsername(username);
		login_SL.enterPassword(password);
		
		System.out.print("user enter valid username and Password");
	}

	@And("click login button")
	public void click_login_button() {

		login_SL.clickLogin();
		System.out.print("click login button");
	}

	@Then("home page should be loaded")
	public void home_page_should_be_loaded() {
		homePage_SL = new HomePage_SwagLabs(driver);
		assertEquals(true, homePage_SL.HomePageLogoIsDisplayed());
		System.out.print("home page should be loaded");

	}
	
	
	@Given("user is in the Home page")
	public void user_is_in_the_Home_page() {
		System.out.print("when user is in the Home page");

	}
	
	@When("user click Add to Cart on an item")
	public void user_click_Add_to_Cart_on_an_item() {
		homePage_SL = new HomePage_SwagLabs(driver);
		
		homePage_SL.clickaddToCartBackpack();
		System.out.print("user click Add to Cart on an item");

	}
	
	@And("click the cart button")
	public void click_the_cart_button() {
		System.out.print("click the cart button");
		homePage_SL.clickCartButton();


	}
	
	@Then("added item should be displayed in the cart")
	public void added_item_should_be_displayed_in_the_cart_() {
		cartPage_SL = new CartPage_SwagLabs(driver);
		
		System.out.print("added item should be displayed in the cart");
		assertEquals(true,cartPage_SL.cartItemIsDisplayed());
	}
	
	
	@Given("user add an item to cart and click the cart button")
	public void user_add_an_item_to_cart_and_click_the_cart_button() {
		System.out.print("user add an item to cart and click the cart button");
		
		user_click_Add_to_Cart_on_an_item();
		click_the_cart_button();

	}
	
	@When("user hit continue shopping button")
	public void user_hit_continue_shopping_button() {
		System.out.print("user hit continue shopping button");
		cartPage_SL = new CartPage_SwagLabs(driver);
		cartPage_SL.clickContinueShopping();
		
		
	}
	
	
	@Then("button label should be changed to removed")
	public  void button_label_changed_to_removed() {
		System.out.print("button label should be changed to removed");
		homePage_SL.removeLabelIsDisplayed();
	}
	

}
