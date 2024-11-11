package magento;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import data.checkoutform;
import data.useraccount;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.ConfigReader;

public class TC04 extends Hooks{

	@Test(description="Checkout Product", 
			groups = {"Regression"})
	public static void TestCase004() throws InterruptedException
	{
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("qaMagentoURL"));	
		
		LandingPage.signIn.jsClick();
		LoginPage.email.setText(useraccount.email04);
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
		ProductPage.showCart.jsClick();
		ProductPage.checkout.jsClick();
		
		CheckoutPage.company.setText(checkoutform.company);
		CheckoutPage.address.setText(checkoutform.address);
		CheckoutPage.city.setText(checkoutform.city);
		CheckoutPage.countryDropdown.selectVisibleByText(checkoutform.CountryPH);
		CheckoutPage.selectCountry.jsClick();
		CheckoutPage.provinceDropdown.setText(checkoutform.provincePH);
		CheckoutPage.zipCode.setText(checkoutform.zipCode);
		CheckoutPage.phone.setText(checkoutform.phone);
		CheckoutPage.next.jsClick();
		CheckoutPage.placeOrder.jsClick();
		CheckoutPage.validateOrderNumber.assertElementDisplayed();

	}
	
}
