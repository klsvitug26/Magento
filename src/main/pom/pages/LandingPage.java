package pages;

import org.openqa.selenium.By;

import core.ActionDriver;

public class LandingPage {
	
	public static class createAccount {
		private static String elementName = "createAccount";
		private static By locator = By.xpath("(//a[normalize-space()='Create an Account'])[1]");
		
		public static void jsClick() {ActionDriver.WebActions.jsClick(elementName, locator);}

}
	public static class signIn {
		private static String elementName = "signIn";
		private static By locator = By.xpath("//header//a[contains(text(),'Sign In')]");
		
		public static void jsClick() {ActionDriver.WebActions.jsClick(elementName, locator);}

}

}