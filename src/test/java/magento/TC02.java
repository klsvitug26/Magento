package magento;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import data.useraccount;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.ConfigReader;

public class TC02 extends Hooks{
	
	
	@Test(description="Add product in the Cart", 
			groups = {"Regression"})
	public static void TestCase002() throws InterruptedException
	{
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("qaMagentoURL"));	
		
		LandingPage.signIn.jsClick();
		
		LoginPage.email.setText(useraccount.email02);
		LoginPage.password.setText(useraccount.password);
		LoginPage.logIn.jsClick();
		
		HomePage.hoverMen.moveToElement();
		HomePage.hoverTops.moveToElement();
		HomePage.jackets.jsClick();
		
		ProductPage.showCart.jsClick();
		ProductPage.proteusJacket.jsClick();
		ProductPage.proteusXS.jsClick();
		ProductPage.proteusBlue.jsClick();
		ProductPage.addToCart.jsClick();
		ProductPage.validateProductAdded.assertElementDisplayed();
		ProductPage.showCart.jsClick();
		ProductPage.validateItem.assertElementDisplayed();
		
	}
}
