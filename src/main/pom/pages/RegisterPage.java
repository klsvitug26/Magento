package pages;

import org.openqa.selenium.By;

import core.ActionDriver;

public class RegisterPage {
	
	public static class firstName {
		private static String elementName = "firstname";
		private static By locator = By.xpath("//input[@id='firstname']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class lastName {
		private static String elementName = "lastName";
		private static By locator = By.xpath("//input[@id='lastname']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class emailAddress {
		private static String elementName = "emailAddress";
		private static By locator = By.xpath("//input[@id='email_address']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class password {
		private static String elementName = "password";
		private static By locator = By.xpath("//input[@id='password']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	
	public static class conPassword {
		private static String elementName = "conPassword";
		private static By locator = By.xpath("//input[@id='password-confirmation']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class createButton {
		private static String elementName = "createButton";
		private static By locator = By.xpath("(//span[contains(text(),'Create an Account')])[1]");
		
		public static void jsClick() {ActionDriver.WebActions.jsClick(elementName, locator);}

	}
	
	public static class validateNewUser {
		private static String elementName = "validateNewUser";
		private static By locator = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
		
		public static void assertElementDisplayed() {ActionDriver.WebActions.assertElementDisplayed(elementName, locator);}
	}
	
	
	
}
