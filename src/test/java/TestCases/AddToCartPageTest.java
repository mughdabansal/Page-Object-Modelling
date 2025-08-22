package TestCases;

import Pages.AddToCartPage;
import Pages.HomePage;
import Pages.LoginPage;
import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseClass {

    LoginPage loginPage;
    HomePage homePage;
    AddToCartPage addToCartPage;

    public AddToCartPageTest(){
        super();
    }

    @BeforeMethod
    public  void setup(){
        initialization();
        loginPage  = new LoginPage();
        homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
        homePage = new HomePage();
        addToCartPage = homePage.AddToCart();
    }

    @Test(priority = 1)
    public  void verifyCheckout(){
       addToCartPage.addtocart(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("postalCode"));
        boolean finshPage= addToCartPage.verifyCheckout();
        Assert.assertTrue(finshPage,"checkout not done! - error occurred!");
    }




    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
}
