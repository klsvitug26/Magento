package pages;

import org.openqa.selenium.By;

import core.ActionDriver;

public class HomePage {
	
	public static class hoverMen {
		private static String elementName = "hoverMen";
		private static By locator = By.xpath("//a[@id='ui-id-5']");
		
		public static void moveToElement() {ActionDriver.WebActions.moveToElement(elementName, locator);}
	}
	
	public static class hoverTops {
		private static String elementName = "hoverTops";
		private static By locator = By.xpath("//a[@id='ui-id-17']");
		
		public static void moveToElement() {ActionDriver.WebActions.moveToElement(elementName, locator);}

	}
	
	public static class jackets {
		private static String elementName = "jackets";
		private static By locator = By.xpath("//a[@id='ui-id-19']");
		
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
	
	public static class menuDropdown {
		private static String elementName = "menuDropdown";
		private static By locator = By.xpath("(//button[@type='button'])[1]");
		
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
	
	public static class myAccount {
		private static String elementName = "myAccount";
		private static By locator = By.xpath("(//a [contains(text(),\"My Account\")])[1]");
		
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
	public static class myWishlist {
		private static String elementName = "myAccount";
		private static By locator = By.xpath("(//a[@href='https://magento.softwaretestingboard.com/wishlist/'])[1]");
		
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
}
