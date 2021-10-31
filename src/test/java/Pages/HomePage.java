package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;

	//----------------Page elements of the top menu items------------------------
	//Page element for Home menu on top of the page
	public static WebElement Home_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@title='Home']"));
		return element;		
	}

	//Page Element for Wish list on top of the home page
	public static WebElement WishList_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@title='Wishlist']"));
		return element;		
	}

	//Page Element for Cart on top right corner of the homepage
	public static WebElement Cart_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@title='Cart']"));
		return element;		
	}

	//----------------Page elements for the products on the list------------
	//Page element for Black Pants
	public static WebElement BlackPantsAddToWishList_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='?add_to_wishlist=17']"));
		return element;		
	}

	//Page element for Product Watch i.e. Modern
	public static WebElement ModernAddToWishList_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='?add_to_wishlist=14']"));
		return element;		
	}

	//Page element for Single Shirt
	public static WebElement SingleShirtAddToWishList_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='?add_to_wishlist=20']"));
		return element;		
	}


	//Page element for Top Pants Upper
	public static WebElement TopPantsUpperAddToWishList_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='?add_to_wishlist=23']"));
		return element;		
	}

	//Page element for Womens Dress
	public static WebElement WomensDressAddToWishList_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='?add_to_wishlist=24']"));
		return element;		
	}

	//---------------Page elements for the Cookies elements ----------------------

	//Page element for Accept All Cookies
	public static WebElement AcceptAll_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='cc-btn cc-accept-all cc-btn-no-href']"));
		return element;		
	}

	//Page element for Cookies Description 
	public static WebElement CookiesDescription_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='cookieconsent:desc']"));
		return element;		
	}
}
