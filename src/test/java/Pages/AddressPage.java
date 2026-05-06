package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pojo.Address;
import utilities.BrowserUtility;

public class AddressPage extends BrowserUtility {

    private static final By COMPANY_TEXT_BOX_LOCATOR = By.id("company");
    private static final By ADDRESS1_TEXT_BOX_LOCATOR = By.id("address1");
    private static final By ADDRESS2_TEXT_BOX_LOCATOR = By.id("address2");
    private static final By CITY_TEXT_BOX_LOCATOR = By.id("city");
    private static final By ZIPCODE_TEXT_BOX_LOCATOR = By.id("postcode");
    private static final By HOME_PHONE_TEXT_BOX_LOCATOR = By.id("phone");
    private static final By MOB_PHONE_TEXT_BOX_LOCATOR = By.id("phone_mobile");
    private static final By ADDITIONAL_INFO_TEXT_BOX_LOCATOR = By.id("other");
    private static final By ALIAS_ADDRESS_TEXT_BOX_LOCATOR = By.id("alias");
    private static final By STATE_SELECT_DROPDOWN_LOCATOR = By.id("id_state");
    private static final By SAVE_ADDRESS_BUTTON_LOCATOR = By.id("submitAddress");



    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public void saveAddress(Address address){
        enterText(COMPANY_TEXT_BOX_LOCATOR , address.getCompany_name());
        enterText(ADDRESS1_TEXT_BOX_LOCATOR , address.getAddress1());
        enterText(ADDRESS2_TEXT_BOX_LOCATOR , address.getAddress2());
        enterText(CITY_TEXT_BOX_LOCATOR, address.getCity());
        enterText(ZIPCODE_TEXT_BOX_LOCATOR , address.getZipcode());
        enterText(HOME_PHONE_TEXT_BOX_LOCATOR , address.getHomePhone());
        enterText(MOB_PHONE_TEXT_BOX_LOCATOR , address.getMobPhone());
        enterText(ADDITIONAL_INFO_TEXT_BOX_LOCATOR , address.getAdditionalInfo());
        clearTextEntry(ALIAS_ADDRESS_TEXT_BOX_LOCATOR);
        enterText(ALIAS_ADDRESS_TEXT_BOX_LOCATOR , address.getAliasAddress());
        selectDropDownValue(STATE_SELECT_DROPDOWN_LOCATOR , "3");
        clickOn(SAVE_ADDRESS_BUTTON_LOCATOR);

    }


}
