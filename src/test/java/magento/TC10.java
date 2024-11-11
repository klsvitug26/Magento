package magento;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import data.checkoutform;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import utilities.ConfigReader;

public class TC10 extends Hooks{
	
	@Test(description="Guest Checkout", 
			groups = {"Regression"})
	public static void TestCase010() throws InterruptedException
	{
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("qaMagentoURL"));	
		
		HomePage.hoverMen.moveToElement();
		HomePage.hoverTops.moveToElement();
		HomePage.jackets.jsClick();
		
		ProductPage.showCart.jsClick();
		ProductPage.proteusJacket.jsClick();
		ProductPage.proteusXS.jsClick();
		ProductPage.proteusBlue.jsClick();
		ProductPage.addToCart.jsClick();
		ProductPage.showCartGuest.jsClick();
		ProductPage.checkout.jsClick();

		CheckoutPage.guestEmail.setText(checkoutform.guestEmail);
		CheckoutPage.firstName.setText(checkoutform.firstName);
		CheckoutPage.lastName.setText(checkoutform.lastName);
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

