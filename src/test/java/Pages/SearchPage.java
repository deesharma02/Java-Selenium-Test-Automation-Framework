package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtility;

public class SearchPage extends BrowserUtility {

    private static final By VERIFY_PRODUCT_SEARCH_LOCATOR = By.xpath("//div[@id='center_column']//span[@class='lighter']");
    private static final By ADD_TO_CART_BUTTON_LOCATOR = By.xpath("//ul[@id='product_list']/li[1]//a[@class='button lnk_view btn btn-default']");
    private static final By VERIFY_CONFIRMATION_MESSAGE_LOCATOR = By.xpath("//span[@class='title']/i");
    private static final By SELECT_FIRST_PRODUCT_LOCATOR = By.xpath("//ul[@id='product_list']/li[1]");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void VerifyProductSearchResult(){
        System.out.println(getText(VERIFY_PRODUCT_SEARCH_LOCATOR));
    }

    public ProductDetailsPage clickOnMore(){
        mouseHoverAction(SELECT_FIRST_PRODUCT_LOCATOR);
        clickOn(ADD_TO_CART_BUTTON_LOCATOR);
        return new ProductDetailsPage(getDriver());
    }

//    public ProductDetailsPage clickProceedToCheckOut(){
//        clickOn(PROCEED_TO_CHECKOUT_LOCATOR);
//        return new ProductDetailsPage(getDriver());
//    }

}
