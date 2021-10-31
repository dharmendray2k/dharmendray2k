package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewCartPage {

	private static WebElement element = null;

	//Page element for View Cart Title on the page
	public static WebElement ViewCartTitle_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//h1[contains(text(),'Cart')]"));
		return element;		
	}

	//Page element for View Cart Title on the page
	public static WebElement CartItemName_Element(WebDriver driver) {
		element = driver.findElement(By.xpath("//td[@class='product-name']/a"));
		return element;		
	}




}
