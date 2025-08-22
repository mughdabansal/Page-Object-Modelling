package Pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends BaseClass {

    @FindBy(css = "#shopping_cart_container > a > svg")
    WebElement addToCartBtn;

    @FindBy(css = "#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button")
    WebElement checkoutBtn;

    @FindBy(id = "first-name")
    WebElement firstname;

    @FindBy(id = "last-name")
    WebElement lastname;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(css = "#checkout_info_container > div > form > div.checkout_buttons > input")
    WebElement continueButton;

    @FindBy(css = "#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button")
    WebElement finishButton;

    @FindBy(css = "#checkout_complete_container > img")
    WebElement finishpage;

    public AddToCartPage(){
        PageFactory.initElements(driver,this);
    }
    public void addtocart(String name, String last, String Postal){
        addToCartBtn.click();
        checkoutBtn.click();
        firstname.sendKeys(name);
        lastname.sendKeys(last);
        postalCode.sendKeys(Postal);
        continueButton.click();
        finishButton.click();

    }
    public boolean verifyCheckout(){
        return finishpage.isDisplayed();
    }

    public contactPage contactPage(){
        return new contactPage();
    }
}
