package pages;

import org.openqa.selenium.By;

import core.ActionDriver;

public class CheckoutPage {
	
	public static class guestEmail {
		private static String elementName = "guestEmail";
		private static By locator = By.xpath("(//input[@id='customer-email'])[1]");
		
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
	

	public static class firstName {
		private static String elementName = "firstName";
		private static By locator = By.xpath("//input[@name='firstname']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class lastName {
		private static String elementName = "lastName";
		private static By locator = By.xpath("//input[@name='lastname']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class company {
		private static String elementName = "company";
		private static By locator = By.xpath("//input [contains(@name,'company')]");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}

	public static class address {
		private static String elementName = "address";
		private static By locator = By.xpath("//input[@name='street[0]']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class city {
		private static String elementName = "city";
		private static By locator = By.xpath("//input[@name='city']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class provinceDropdown {
		private static String elementName = "province";
		private static By locator = By.xpath("//input[@name=\"region\"]");
		
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
	
	public static class zipCode {
		private static String elementName = "zipCode";
		private static By locator = By.xpath("//input[@name=\"postcode\"]");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class countryDropdown {
		private static String elementName = "country";
		private static By locator = By.xpath("//select[@name='country_id']");
		
	       public static void selectVisibleByText(String visibleText) {
	            ActionDriver.WebActions.selectVisibleByText(elementName, locator, visibleText);
	        }

	}
	
	public static class selectCountry {
		private static String elementName = "country";
		private static By locator = By.xpath("//option[text()=\"Philippines\"]");
		

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
	
	public static class phone {
		private static String elementName = "phone";
		private static By locator = By.xpath("//input[@name='telephone']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class flatRate {
		private static String elementName = "flatRate";
		private static By locator = By.xpath("//input[@value='flatrate_flatrate']");
		
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
	
	public static class next {
		private static String elementName = "next";
		private static By locator = By.xpath("//span[normalize-space()='Next']");
		
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
	
	public static class placeOrder {
		private static String elementName = "placeOrder";
		private static By locator = By.xpath("//span[normalize-space()='Place Order']");
		
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
	
	public static class placeOrderGuest {
		private static String elementName = "placeOrder";
		private static By locator = By.xpath("//button[@title='Place Order']");
		
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
	
	public static class validateOrderNumber {
		private static String elementName = "validateOrderNumber";
		private static By locator = By.xpath("//div[@class='checkout-success']");
		
		public static void assertElementDisplayed() {
			ActionDriver.WebActions.assertElementDisplayed(elementName, locator);
			}
	}
	
	public static class validateOrderNumberGuest {
		private static String elementName = "validateOrderNumberGuest";
		private static By locator = By.xpath("//div[@class='checkout-success']//p[1]");
		
		public static void assertElementDisplayed() {
			ActionDriver.WebActions.assertElementDisplayed(elementName, locator);
			}
	}
	
	public static class shipHere {
		private static String elementName = "shipHere";
		private static By locator = By.xpath("(//span[contains(text(),'Ship Here')])[1]");
		
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
