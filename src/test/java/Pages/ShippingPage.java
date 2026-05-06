package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtility;

public class ShippingPage extends BrowserUtility {

    private static final By AGREE_TERMS_LOCATOR = By.id("uniform-cgv");
    private static final By PROCEED_TO_CHECKOUT_BUTTON_LOCATOR = By.xpath("//button[@name='processCarrier']");

    public ShippingPage(WebDriver driver) {
        super(driver);
    }

    public void confirmShipping(){
        clickOn(AGREE_TERMS_LOCATOR);
        clickOn(PROCEED_TO_CHECKOUT_BUTTON_LOCATOR);
    }


}
