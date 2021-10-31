package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListPage {

	private static WebElement element = null;
	private static List<WebElement> elements = null;

	//Page element for Wish List Title on the page
	public static WebElement WishListTitle_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[contains(text(),'My wishlist')]"));
		return element;		
	}

	//Page element for Top Pants Upper Element on the page
	public static WebElement TopPantsUpper_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Top pants upper')]"));
		return element;		
	}

	//Page element for Single Shirt Element on the page
	public static WebElement SingleShirt_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[contains(text(),'Single Shirt')]"));
		return element;		
	}

	//Page element for Modern Element on the page
	public static WebElement Modern_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[contains(text(),'Modern')]"));
		return element;		
	}

	//Page element for Womens Dress Element on the page
	public static WebElement WomensDress_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),\"Women's dress\")]"));
		return element;		
	}
	
	//Page element for Womens Dress Element on the page
		public static WebElement ViewCart_Element(WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Cart']"));
			return element;		
		}

	//Page element for Womens Dress Element on the page
	public static List<WebElement> WishListItemsPrice_WebElements(WebDriver driver) {
		elements = driver.findElements(By.xpath("//*[contains(@id,'yith-wcwl-row-')]/td[@class='product-price']"));
		return elements;
	}

	//Page element for Womens Dress Element on the page
	public static List<WebElement> WishListItemsAddToCart_WebElements(WebDriver driver) {
		elements = driver.findElements(By.xpath("//*[contains(@id,'yith-wcwl-row-')]/td[@class='product-add-to-cart']/a"));
		return elements;
	}

	//Page element for Womens Dress Element on the page
	public static List<WebElement> WishListItemsName_WebElements(WebDriver driver) {
		elements = driver.findElements(By.xpath("//*[contains(@id,'yith-wcwl-row-')]/td[@class='product-name']/a"));
		return elements;
	}



}
