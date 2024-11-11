package magento;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import data.useraccount;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.ConfigReader;

public class TC08 extends Hooks{

	@Test(description="Checkout using New Address", 
			groups = {"Regression"})
	public static void TestCase008() throws InterruptedException
	{
		
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("qaMagentoURL"));	
		
		LandingPage.signIn.jsClick();
		LoginPage.email.setText(useraccount.email04);
		LoginPage.password.setText(useraccount.password);
		ActionDriver.WebActions.scrollToPosition(0, 300);
		LoginPage.logIn.jsClick();
		
		HomePage.hoverMen.moveToElement();
		HomePage.hoverTops.moveToElement();
		HomePage.jackets.jsClick();
		
		ProductPage.showCart.jsClick();
		ProductPage.proteusJacket.jsClick();
		ProductPage.proteusXS.jsClick();
		ProductPage.proteusBlue.jsClick();
		ProductPage.addToCart.jsClick();
		ProductPage.showCart.jsClick();
		ProductPage.checkout.jsClick();
		
		CheckoutPage.shipHere.jsClick();
		CheckoutPage.next.jsClick();
		CheckoutPage.placeOrder.jsClick();
		CheckoutPage.validateOrderNumber.assertElementDisplayed();
}
	
}
