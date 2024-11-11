package magento;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import data.checkoutform;
import data.newaddress;
import data.useraccount;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import pages.MyAccountPage;
import utilities.ConfigReader;

public class TC07 extends Hooks {
	
	@Test(description="Add New Address", 
			groups = {"Regression"})
	public static void TestCase007() throws InterruptedException
	{
		
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("qaMagentoURL"));	
		
		LandingPage.signIn.jsClick();
		LoginPage.email.setText(useraccount.email04);
		LoginPage.password.setText(useraccount.password);
		ActionDriver.WebActions.scrollToPosition(0, 300);
		LoginPage.logIn.jsClick();
		
		HomePage.menuDropdown.jsClick();
		HomePage.myAccount.jsClick();
		
		MyAccountPage.addressBook.jsClick();
		MyAccountPage.addAddress.jsClick();
		ActionDriver.WebActions.scrollToPosition(0, 400);
		MyAccountPage.newCompany.setText(newaddress.company);
		MyAccountPage.newPhoneNumber.setText(newaddress.phone);
		MyAccountPage.newStreet.setText(newaddress.address);
		MyAccountPage.newCity.setText(newaddress.city);
		MyAccountPage.countryDropdown.selectVisibleByText(checkoutform.CountryPH);
		MyAccountPage.newCountry.jsClick();
		MyAccountPage.newProvince.setText(checkoutform.provincePH);
		MyAccountPage.newZipCode.setText(newaddress.zipCode);
		MyAccountPage.saveAddress.jsClick();
		MyAccountPage.validateNewAddress.assertElementDisplayed();
	}
	
}


