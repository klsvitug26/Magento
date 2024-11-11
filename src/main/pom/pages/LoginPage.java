package pages;

import org.openqa.selenium.By;

import core.ActionDriver;

public class LoginPage {
	
	
	public static class email {
		private static String elementName = "email";
		private static By locator = By.xpath("//input[@id='email']");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class password {
		private static String elementName = "password";
		private static By locator = By.xpath("(//input[@id='pass'])[1]");
		
		public static void setText(String value) {ActionDriver.WebActions.setText(elementName, locator, value);}
	}
	
	public static class logIn {
		private static String elementName = "logIn";
		private static By locator = By.xpath("//fieldset[@class='fieldset login']//button[@id='send2']");
		
		public static void jsClick() {ActionDriver.WebActions.jsClick(elementName, locator);}
	}
	
}

