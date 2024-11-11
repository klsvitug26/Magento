package magento;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import data.useraccount;
import pages.LandingPage;
import pages.RegisterPage;
//import pages.LoginPage;
import utilities.ConfigReader;

public class TC01 extends Hooks {
	
	@Test(description="Create New Account", 
			groups = {"Regression"})
	public static void TestCase001() throws InterruptedException
	{
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("qaMagentoURL"));	
		
		LandingPage.createAccount.jsClick();
		
		RegisterPage.firstName.setText(useraccount.firstName);
		RegisterPage.lastName.setText(useraccount.lastName);
		RegisterPage.emailAddress.setText(useraccount.dummyEmail);
		RegisterPage.password.setText(useraccount.dummyPassword);
		RegisterPage.conPassword.setText(useraccount.dummyPassword);
		RegisterPage.createButton.jsClick();
		Thread.sleep(1000);
		RegisterPage.validateNewUser.assertElementDisplayed();
	}
	
}
