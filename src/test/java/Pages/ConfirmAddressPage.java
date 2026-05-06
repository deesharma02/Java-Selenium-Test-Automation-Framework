package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtility;

public class ConfirmAddressPage extends BrowserUtility {

    private static final By PROCEED_TO_CHECKOUT_BUTTON = By.xpath("//span[text()='Proceed to checkout']");
    protected ConfirmAddressPage(WebDriver driver) {
        super(driver);
    }

    public ShippingPage confirmAddress(){
        clickOn(PROCEED_TO_CHECKOUT_BUTTON);
        return new ShippingPage(getDriver());
    }
}
