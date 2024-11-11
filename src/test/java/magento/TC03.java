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
import utilities.ConfigReader;

public class TC03 extends Hooks{
	

	@Test(description="Edit Product in the Cart", 
			groups = {"Regression"})
	public static void TestCase003() throws InterruptedException
	{
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("qaMagentoURL"));	
		
		LandingPage.signIn.jsClick();
		LoginPage.email.setText(useraccount.email03);
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
		
		CartPage.editProduct.jsClick();
		
		ProductPage.proteusLarge.jsClick();
		ProductPage.proteusBlack.jsClick();
		ProductPage.updateProduct.jsClick();
		
		CartPage.validateProductIsUpdated.assertElementDisplayed();
	}

}
