package pages;

import org.openqa.selenium.By;

import core.ActionDriver;

public class CartPage {
	
	public static class deleteProduct {
		private static String elementName = "deleteProduct";
		private static By locator = By.xpath("//a[@class='action action-delete']");
		
		public static void jsClick() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			ActionDriver.WebActions.jsClick(elementName, locator);
			}
	}
	
	public static class validateProductIsDeleted {
		private static String elementName = "validateProductIsDeleted";
		private static By locator = By.xpath("//div[@class='cart-empty']");
		
		public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(elementName, locator);}
	}
	
	public static class editProduct {
		private static String elementName = "editProduct";
		private static By locator = By.xpath("//a[@title='Edit item parameters']");
		
		public static void jsClick() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			ActionDriver.WebActions.jsClick(elementName, locator);
			}
	}
	
	
	public static class moveToWishlist {
		private static String elementName = "moveToWishlist";
		private static By locator = By.xpath("//span[text()='Move to Wishlist']");
		
		public static void jsClick() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			ActionDriver.WebActions.jsClick(elementName, locator);
			}
	}
	
	public static class validateProductIsUpdated {
		private static String elementName = "validateProductIsUpdated";
		private static By locator = By.xpath("//div[text()='Proteus Fitness Jackshirt was updated in your shopping cart.']");
		
		public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(elementName, locator);}
	}
	
	public static class validateProductWishlist {
		private static String elementName = "validateProductWishlist";
		private static By locator = By.xpath("//div[@data-ui-id=\"message-success\"]");
		
		public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(elementName, locator);}
	}
}
