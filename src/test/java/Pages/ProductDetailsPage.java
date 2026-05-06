package Pages;

import constants.Size;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtility;

public class ProductDetailsPage extends BrowserUtility {

    private static final By SIZE_DROPDOWN_LOCATOR = By.id("group_1");
    private static final By ADD_TO_CART_BUTTON_LOCATOR = By.xpath("//button[@name='Submit']");
    private static final By PROCEED_TO_CHECKOUT_LOCATOR = By.xpath("//a[@title='Proceed to checkout']");

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public ProductDetailsPage selectSize(Size size){
        String val;
        if(size.toString().equalsIgnoreCase("S")){
            val = "1";
        } else if (size.toString().equalsIgnoreCase("M")) {
            val = "2";
        }else {
            val = "3";
        }
        selectDropDownValue(SIZE_DROPDOWN_LOCATOR,val);
        return new ProductDetailsPage(getDriver());
    }

    public ProductDetailsPage clickOnAddToCart(){
        clickOn(ADD_TO_CART_BUTTON_LOCATOR);
        return new ProductDetailsPage(getDriver());
    }

    public CartSummary clickOnProceedToCheckOut(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickOn(PROCEED_TO_CHECKOUT_LOCATOR);
        return new CartSummary(getDriver());
    }

}
