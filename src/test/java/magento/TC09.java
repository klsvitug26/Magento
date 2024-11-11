package magento;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import data.useraccount;
import pages.CartPage;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import pages.ProductPage;
import pages.WishlistPage;
import utilities.ConfigReader;

public class TC09 extends Hooks {
	
	@Test(description="Move Products from Cart to Wishlist", 
			groups = {"Regression"})
	public static void TestCase009() throws InterruptedException
	{
		
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("qaMagentoURL"));	
		
		LandingPage.signIn.jsClick();
		LoginPage.email.setText(useraccount.emailTest);
		LoginPage.password.setText(useraccount.password);
		LoginPage.logIn.jsClick();
		
		HomePage.hoverMen.moveToElement();
		HomePage.hoverTops.moveToElement();
		HomePage.jackets.jsClick();
		
		ProductPage.proteusJacket.jsClick();
		ProductPage.proteusXS.jsClick();
		ProductPage.proteusBlue.jsClick();
		ProductPage.addToCart.jsClick();
		ProductPage.showCart.jsClick();
		ProductPage.viewEditCart.jsClick();
		
		CartPage.moveToWishlist.jsClick();
		CartPage.validateProductWishlist.assertElementDisplayed();
		HomePage.myWishlist.jsClick();
		
		WishlistPage.validateItem.assertElementDisplayed();

}
}
