package TestCases;

import Pages.AddToCartPage;
import Pages.HomePage;
import Pages.LoginPage;
import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    LoginPage loginPage;
    HomePage homePage;
    AddToCartPage addToCartPage;
    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
    initialization();
    loginPage = new LoginPage();
        homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void verifyHomepageTittle(){
       String Tittle =  homePage.validateHomePagetittle();
        Assert.assertEquals(Tittle,"Swag Labs","title does not match!");
    }

    @Test(priority = 2)
    public  void verifyHomePageLogo(){
        boolean logo = homePage.validatehomePageLogo();
        Assert.assertTrue(logo,"logo does not match!");
    }
    @Test(priority = 3)
    public void verifyAllProductPage(){
       boolean allItemLogo =  homePage.allItemsPage();
        Assert.assertTrue(allItemLogo,"logo does not match");
    }
@Test
public void addCartTest(){
        addToCartPage = homePage.AddToCart();
}
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
