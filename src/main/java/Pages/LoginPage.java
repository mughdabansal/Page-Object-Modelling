package Pages;

import base.BaseClass;
import jdk.jfr.Name;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class LoginPage extends BaseClass {

    //page factory or object repository
    @FindBy(name="user-name")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(id= "login-button")
    WebElement loginBtn;

    @FindBy(css = "body > div.login_wrapper > div.login_wrapper-inner > img")
    WebElement robotlogo;

    //initializing the page objects
    public LoginPage(){
        PageFactory.initElements(driver, this); // to initialize page factory, this is pointing to the current class objects
    }

    public String validateLoginPageTittle(){
        return driver.getTitle();
    }
    public boolean validateCRMLogo(){
        return robotlogo.isDisplayed();
    }
    public HomePage Login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();

        return new HomePage(); //returning homepage class objects
    }
}
