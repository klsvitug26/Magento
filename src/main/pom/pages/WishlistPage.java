package pages;

import org.openqa.selenium.By;

import core.ActionDriver;

public class WishlistPage {
	
	public static class validateItem {
		private static String elementName = "validateItem";
		private static By locator = By.xpath("(//span[@class='toolbar-number'][normalize-space()='1 Item'])[1]");
		
		public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(elementName, locator);}
	}

}
