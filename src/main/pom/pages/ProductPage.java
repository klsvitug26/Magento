package pages;

import org.openqa.selenium.By;

import core.ActionDriver;

public class ProductPage {
	
	public static class proteusJacket {
		private static String elementName = "proteusJacket";
		private static By locator = By.xpath("//a[normalize-space()='Proteus Fitness Jackshirt']");
		
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
	
	public static class proteusXS {
		private static String elementName = "proteusXS";
		private static By locator = By.xpath("//div[@id='option-label-size-143-item-166']");
		
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
	
	public static class proteusLarge {
		private static String elementName = "proteusLarge";
		private static By locator = By.xpath("//div[@id='option-label-size-143-item-169']");
		
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
	
	public static class proteusBlue {
		private static String elementName = "proteusBlue";
		private static By locator = By.xpath("//div[@id='option-label-color-93-item-50']");
		
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
	
	public static class proteusBlack {
		private static String elementName = "proteusBlack";
		private static By locator = By.xpath("//div[@id='option-label-color-93-item-49']");
		
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
	
	public static class updateProduct {
		private static String elementName = "updateProduct";
		private static By locator = By.xpath("//button[@id='product-updatecart-button']");
		
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

	public static class addToCart {
		private static String elementName = "addToCart";
		private static By locator = By.xpath("//button[@id='product-addtocart-button']");
		
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
	
	public static class addToWishlist {
		private static String elementName = "addToWishlist";
		private static By locator = By.xpath("//div[@class='product-addto-links']//span[contains(text(),'Add to Wish List')]");
		
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
	
	public static class validateProductWishlist {
		private static String elementName = "validateProductWishlist";
		private static By locator = By.xpath("//div[@class=\"message-success success message\"]");
		
		public static void assertElementDisplayed() {
			ActionDriver.WebActions.assertElementDisplayed(elementName, locator);
			}
	}
	
	public static class showCart {
		private static String elementName = "showCart";
		private static By locator = By.xpath("//a[contains(@class, 'action showcart')]");
		
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
	
	public static class showCartGuest {
		private static String elementName = "showCart";
		private static By locator = By.xpath("//a[@class='action showcart']");
		
		public static void jsClick() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			ActionDriver.WebActions.jsClick(elementName, locator);
			}
		
	}
	
	
	public static class checkout {
		private static String elementName = "checkout";
		private static By locator = By.xpath("//button[@id='top-cart-btn-checkout']");
		
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
	
	public static class viewEditCart {
		private static String elementName = "viewEditCart";
		private static By locator = By.xpath("//span[normalize-space()='View and Edit Cart']");
		
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
	
	public static class validateProductAdded {
		private static String elementName = "validateProductAdded";
		private static By locator = By.xpath("//div[@class=\"message-success success message\"]");
		
		public static void assertElementDisplayed() {
			ActionDriver.WebActions.assertElementDisplayed(elementName, locator);
			}
	}
	
	public static class validateItem {
		private static String elementName = "validateItem";
		private static By locator = By.xpath("//span[text()='Item in Cart']");
		
		public static void assertElementDisplayed() {
			ActionDriver.WebActions.assertElementDisplayed(elementName, locator);
			}
	}
	


}

