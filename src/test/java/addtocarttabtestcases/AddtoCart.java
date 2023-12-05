package addtocarttabtestcases;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import com.assessment.base.Base;
import com.qa.pages.AccountPage;
import com.qa.pages.AddtoCartPage;
import com.qa.pages.CheckoutPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.RemovefromCartPage;




public class AddtoCart extends Base {
	
	LoginPage loginPage;
	AccountPage accountPage;
	
	public AddtoCart() {
		super();
	}
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browserName"));
		
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccount();
		loginPage = homePage.selectLoginOption();
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
		
	}
	
	
	@Test
	public void verifyUserisabletoaddTablettoCartandRemovefromCart( ) {

		
	AddtoCartPage addcart = new AddtoCartPage(driver);
		
	loginPage.enterEmailAddress(prop.getProperty("Email"));
	loginPage.enterPassword(prop.getProperty("Password"));
//	loginPage.enterEmailAddress(email);
//	loginPage.enterPassword(password);
//		loginPage.enterEmailAddress(Utilities.generateEmail());
//		loginPage.enterPassword(Utilities.generatePassword());
		accountPage=loginPage.clickOnLoginButton();
		Assert.assertTrue(accountPage.getDisplayStatusOfEditYourAccountInformation());
		addcart.selecttablet();
	    String actualName = addcart.asserttabletName();
	    String expectedName = "Samsung Galaxy Tab 10.1";
	    Assert.assertEquals(actualName,expectedName);	
	    addcart.addtoCart();;
	    Assert.assertTrue(addcart.assertSuccessfullyaddedtoCart());
	    addcart.checkTheCart();
	    CheckoutPage checkoutpage = new CheckoutPage(driver);
	    Assert.assertTrue(checkoutpage.subTotal());
	    Assert.assertTrue(checkoutpage.subTotalValue());
	    Assert.assertTrue(checkoutpage.echoTax());
	    Assert.assertTrue(checkoutpage.echoTaxValue());
	    Assert.assertTrue(checkoutpage.vat());
	    Assert.assertTrue(checkoutpage.vatValue());
     	Assert.assertTrue(checkoutpage.total());
	    Assert.assertTrue(checkoutpage.totalValue());
	    checkoutpage.checkoutTheCart();
	    Assert.assertTrue(checkoutpage.notAvailable());
	    RemovefromCartPage remove = new RemovefromCartPage(driver);
	    remove.removeItemfromCart();
	    Assert.assertTrue(remove.cartEmpty());
	    
	}
	

	
	
		
	
	
	

	
	
}
