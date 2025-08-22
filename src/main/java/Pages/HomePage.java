package Pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

        @FindBy(css = "#header_container > div.header_label > div")
        WebElement homePageLogo;

        @FindBy(css = "#menu_button_container > div > div:nth-child(3) > div > button")
        WebElement menuButton;

        @FindBy(css = "#about_sidebar_link")
        WebElement aboutPagebutton;

        @FindBy(css = "#inventory_sidebar_link")
        WebElement allItemsButton;

        @FindBy(css = "#inventory_filter_container > div")
        WebElement productPageLogo;

        @FindBy(css = "#inventory_container > div > div:nth-child(1) > div.pricebar > button")
        WebElement backpackAddCartBtn;


public HomePage(){
        PageFactory.initElements(driver,this);
}
public String validateHomePagetittle(){
        return driver.getTitle();
}
public boolean validatehomePageLogo(){
        return homePageLogo.isDisplayed();
}
public boolean allItemsPage(){
    menuButton.click();
    allItemsButton.click();
        return productPageLogo.isDisplayed();
}
public AddToCartPage AddToCart(){
        backpackAddCartBtn.click();
        return new AddToCartPage();
}

}
