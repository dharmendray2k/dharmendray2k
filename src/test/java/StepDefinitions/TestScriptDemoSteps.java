package StepDefinitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.HomePage;
import Pages.WishListPage;
import Pages.ViewCartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestScriptDemoSteps {
	private WebDriver driver = null;	
	private ArrayList<Integer> pricelist = new ArrayList<Integer>();
	String NameForLeastPriceItem = null;
		
	@Given("^user opens \"([^\"]*)\" url on \"([^\"]*)\" browser$")
	public void User_open_url_on_given_browser(String GivenURL, String GivenBrowser) {
	    // Code for opening the given url on given browser
		
		System.out.println("Code for opening the given url on given browser");
		
		if (GivenBrowser.toUpperCase().contentEquals("CHROME")) {
			System.out.println("Print - Script will open Chrome browser and open the given url");
			System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(GivenURL);
		}
		else if (GivenBrowser.toUpperCase().contentEquals("FIREFOX") || GivenBrowser.toUpperCase().contentEquals("MOZILLA")){
			System.out.println("Print - Script will open Firefox browser and open the given url");
			System.setProperty("webdriver.gecko.driver","src/main/resources/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(GivenURL);
		}
		else if (GivenBrowser.toUpperCase().contentEquals("EDGE")){
			System.out.println("Print - Script will open Edge browser and open the given url");
			System.setProperty("webdriver.edge.driver","src/main/resources/Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(GivenURL);
		}
		else {
			System.out.println("Print - Browser is not valid");
			}		
		
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("^If user sees Accept All element then clicks$")
	public void If_User_sees_given_element_then_clicks() {
	    // Code for checking if Accept all cookies option is visible then click on it
		
		if (HomePage.AcceptAll_Element(driver).isDisplayed()) {
		HomePage.AcceptAll_Element(driver).click();
		}
		
		System.out.println("Print - If user sees Accept All element then clicks");
	    //throw new io.cucumber.java.PendingException();
	}
	
	@And("^user sees Home page element$")
	public void User_sees_given_element() {
	    // Code for validating a given element
		System.out.println("Print - User sees Home page element");
		if (HomePage.Home_Element(driver).isDisplayed()) {
			System.out.println("Print - Home page element is correctly displayed");
			}
		
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("^user verifies that its a correct Home page$")
	public void User_verifies_the_corrent_given_page() {
	    // Code for validating the page is correct
		
		System.out.println("Print - Code for validating the page is correct");
		
		if (HomePage.Home_Element(driver).isDisplayed()) {
			System.out.println("Print - User is on the correct home page");
			}
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Given("^I add four different products to my wish list$")
	public void i_add_four_different_products_to_my_wish_list() throws InterruptedException {
	    // Code for adding four different products to my wish list
		WebDriverWait wait = new WebDriverWait(driver,30);
		System.out.println("Print - Code for adding four different products to my wish list");
		
		//Add 4 products to wishlist
		//Product 1 - Womens Dress
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(HomePage.WomensDressAddToWishList_Element(driver)));
		if (HomePage.WomensDressAddToWishList_Element(driver).isEnabled()) {
		HomePage.WomensDressAddToWishList_Element(driver).click();
		System.out.println("Print - Product - Women's Dress is added to my wish list");
		}
		
		//Product 2 - Modern watch
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(HomePage.ModernAddToWishList_Element(driver)));
		if (HomePage.ModernAddToWishList_Element(driver).isEnabled()) {
		HomePage.ModernAddToWishList_Element(driver).click();
		System.out.println("Print - Product - Modern Watch is added to my wish list");
		}
				
		//Product 3 - Single Shirt
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(HomePage.SingleShirtAddToWishList_Element(driver)));
		if (HomePage.SingleShirtAddToWishList_Element(driver).isEnabled()) {
		HomePage.SingleShirtAddToWishList_Element(driver).click();
		System.out.println("Print - Product - Single Shirt is added to my wish list");
		}
				
		//Product 4 - Top Pants Upper
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(HomePage.TopPantsUpperAddToWishList_Element(driver)));
		if (HomePage.TopPantsUpperAddToWishList_Element(driver).isEnabled()) {
		HomePage.TopPantsUpperAddToWishList_Element(driver).click();
		System.out.println("Print - Product - Top Pants Upper is added to my wish list");	
		}
	    //throw new io.cucumber.java.PendingException();
		
		System.out.println("Print - All 4 products are added to my wish list");
	}

	@When("^I view my wishlist table$")
	public void i_view_my_wishlist_table() throws InterruptedException {
	    // Code to view the wish list table
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		System.out.println("Print - Code to view the wish list table");
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(HomePage.WishList_Element(driver)));
		HomePage.WishList_Element(driver).click();
		
		wait.until(ExpectedConditions.visibilityOf(WishListPage.WishListTitle_Element(driver)));
		
		if (WishListPage.WishListTitle_Element(driver).isDisplayed()) {
			System.out.println("Print - User is navigate to the Wish List page");	
			}
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("^I find total four selected items in my Wishlist$")
	public void i_find_total_four_selected_items_in_my_wishlist() throws InterruptedException {
	    // Code to find the selected items in my wish list
		
		System.out.println("Print - Code to find the selected items in my wish list");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(WishListPage.WishListTitle_Element(driver)));
		
		if (WishListPage.TopPantsUpper_Element(driver).isDisplayed()) {
			System.out.println("Print - Top Pants Upper is added in the Wish List");	
			}
		
		if (WishListPage.SingleShirt_Element(driver).isDisplayed()) {
			System.out.println("Print - Single Shirt is added in the Wish List");	
			}
		
		if (WishListPage.Modern_Element(driver).isDisplayed()) {
			System.out.println("Print - Modern is added in the Wish List");	
			}
		
		if (WishListPage.WomensDress_Element(driver).isDisplayed()) {
			System.out.println("Print - Women's Dress is added in the Wish List");	
			}
	    //throw new io.cucumber.java.PendingException();
	}

	@When("^I search for lowest price product$")
	public void i_search_for_lowest_price_product() throws InterruptedException {
	    // Code to search for lowest price product in wish list
		
		System.out.println("Print - Code to search for lowest price product in wish list");
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		Thread.sleep(1000);
		
		System.out.println("Print - Price for each element in the wish list");
		
		List<WebElement> elementsPrice = WishListPage.WishListItemsPrice_WebElements(driver);		
		
		
		int itemIndex = 1;
		for(WebElement element : elementsPrice){
			String price = element.getText();
			String onlyAmount = null;
			
			if (price.contains(" –")) {
				int sepDash = price.indexOf(" –");
				price = price.substring(0, sepDash);
				onlyAmount = price.substring(1, price.indexOf("."));
				pricelist.add(Integer.parseInt(onlyAmount));
				System.out.println("Price for item num: " + itemIndex + " is: " + price);
				System.out.println("Only Amount for item num: " + itemIndex + " is: " + onlyAmount);
			}
			else if (price.contains(" £")) {
				int sepDash = price.indexOf(" £");				
				price = price.substring(sepDash+1,price.length());
				onlyAmount = price.substring(1, price.indexOf("."));
				pricelist.add(Integer.parseInt(onlyAmount));
				System.out.println("Price for item num: " + itemIndex + " is: " + price);
				System.out.println("Only Amount for item num: " + itemIndex + " is: " + onlyAmount);
			}	
			else {	
			onlyAmount = price.substring(1, price.indexOf("."));
			pricelist.add(Integer.parseInt(onlyAmount));
			System.out.println("Price for item num: " + itemIndex + " is: " + price);
			System.out.println("Only Amount for item num: " + itemIndex + " is: " + onlyAmount);
			}
			itemIndex++;
		}
		
		int indexOfItemWithLeastPrice = pricelist.indexOf(Collections.min(pricelist));
		System.out.println("Index of the least price item is: " + indexOfItemWithLeastPrice);	
		
		
	    //throw new io.cucumber.java.PendingException();
	}

	@And("^I am able to add the lowest price item to my cart$")
	public void i_am_able_to_add_the_lowest_price_item_to_my_cart() {
	    // Code to add the lowest price item to my cart
		
		System.out.println("Print - Code to add the lowest price item to my cart");
		
		List<WebElement> elementsAddToCart = WishListPage.WishListItemsAddToCart_WebElements(driver);
		List<WebElement> elementsProductName = WishListPage.WishListItemsName_WebElements(driver);
		
		//Click on Add to Cart for the product having least price in the list 
		int indexOfItemWithLeastPrice = pricelist.indexOf(Collections.min(pricelist));
		elementsAddToCart.get(indexOfItemWithLeastPrice).click();
		
		NameForLeastPriceItem = elementsProductName.get(indexOfItemWithLeastPrice).getText();
		
		System.out.println("Print - Name of the product with least price: " + NameForLeastPriceItem);
		System.out.println("Print - Product with least price in the Wish List is added in the Cart");
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("^I am able to verify the item in my cart$")
	public void i_am_able_to_verify_the_item_in_my_cart() throws InterruptedException {
	    // Code to verify the item is added to my cart
		
		System.out.println("Print - Code to verify the item is added to my cart");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(WishListPage.ViewCart_Element(driver)));
		WishListPage.ViewCart_Element(driver).click();
		
		//User is navigated to View Cart Page
		wait.until(ExpectedConditions.visibilityOf(ViewCartPage.ViewCartTitle_Element(driver)));
		
		if (ViewCartPage.ViewCartTitle_Element(driver).isDisplayed()) {
			System.out.println("Print - User is navigate to the View Cart page");	
			}
		
		//Validating the Item in the Cart is the same item which we added from Wishlist
		if (ViewCartPage.CartItemName_Element(driver).getText().equals(NameForLeastPriceItem)) {
			System.out.println("Print - User verifies that Item : " + NameForLeastPriceItem + " is added in the Cart from Wishlist");	
			}
	    //throw new io.cucumber.java.PendingException();
	}
	
	@And("^Browser is closed$")
	public void browser_is_closed() {
	    // Code to close the browser
		
		System.out.println("Print - Code to close the browser");
		driver.quit();
	    //throw new io.cucumber.java.PendingException();
	}

}
