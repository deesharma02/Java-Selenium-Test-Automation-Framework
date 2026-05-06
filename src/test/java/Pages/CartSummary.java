package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtility;

public class CartSummary extends BrowserUtility {

    private static final By PROCEED_TO_CHECKOUT_BUTTON = By.xpath("//span[text()='Proceed to checkout']");

    public CartSummary(WebDriver driver) {
        super(driver);
    }

    public ConfirmAddressPage confirmCartSummary(){
        clickOn(PROCEED_TO_CHECKOUT_BUTTON);
        return new ConfirmAddressPage(getDriver());
    }
}
