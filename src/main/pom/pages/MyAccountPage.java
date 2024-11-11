package pages;

import org.openqa.selenium.By;

import core.ActionDriver;

public class MyAccountPage {
	
	public static class addressBook {
		private static String elementName = "addressBook";
		private static By locator = By.xpath("//a [contains(text(),\"Address Book\")]");
		
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
	
	public static class addAddress {
		private static String elementName = "addAddress";
		private static By locator = By.xpath("//button [@title=\"Add New Address\"]");
		
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
	
	public static class newCompany{
		private static String elementName = "newCompany";
		private static By locator = By.xpath("//input[@title='Company']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
			
}
	public static class newPhoneNumber{
		private static String elementName = "newPhoneNumber";
		private static By locator = By.xpath("//input[@title='Phone Number']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
			
}
	
	public static class newStreet{
		private static String elementName = "newStreet";
		private static By locator = By.xpath("//input[@title='Street Address']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
			
}
	
	public static class newCity{
		private static String elementName = "newCity";
		private static By locator = By.xpath("//input[@title='City']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
			
}
	
	public static class newProvince {
		private static String elementName = "newProvince";
		private static By locator = By.xpath("//input[@class=\"input-text validate-not-number-first\"]");
		
		public static void setText(String value) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			ActionDriver.WebActions.setText(elementName, locator, value);
			}

	}
	
	public static class newZipCode {
		private static String elementName = "newZipCode";
		private static By locator = By.xpath("//input[@title='Zip/Postal Code']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class countryDropdown {
		private static String elementName = "country";
		private static By locator = By.xpath("//select[@title='Country']");
		

	       public static void selectVisibleByText(String visibleText) {
	            ActionDriver.WebActions.selectVisibleByText(elementName, locator, visibleText);
	        }

	}
	
	
	public static class newCountry {
		private static String elementName = "newCountry";
		private static By locator = By.xpath("//option [contains(text(),\"Philippines\")]");
		

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
	
	public static class saveAddress {
		private static String elementName = "saveAddress";
		private static By locator = By.xpath("//button [@data-action=\"save-address\"]");
		

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
	
	public static class validateNewAddress {
		private static String elementName = "validateNewAddress";
		private static By locator = By.xpath("//div[@class='message-success success message']");
		
		public static void assertElementDisplayed() {
			ActionDriver.WebActions.assertElementDisplayed(elementName, locator);
			}
	}
	
	

}
