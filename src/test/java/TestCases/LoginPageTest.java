package TestCases;

import Pages.HomePage;
import Pages.LoginPage;
import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super(); // super class constructor is called
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage(); //
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        String title = loginPage.validateLoginPageTittle(); //
        Assert.assertEquals(title, "Swag Labs", "Login Page title is incorrect!");
    }

    @Test(priority = 2)
    public void crmLogoImageTest() {
        boolean flag = loginPage.validateCRMLogo();
        Assert.assertTrue(flag, "robot Logo is not displayed!");
    }

    @Test(priority = 3)
    public void loginTest() {
        homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
        Assert.assertNotNull(homePage, "Login failed - HomePage object is null!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
