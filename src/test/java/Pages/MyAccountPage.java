package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtility;

public final class MyAccountPage extends BrowserUtility {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    private static final By VERIFY_USER_LOCATOR = By.xpath("//a[@title = 'View my customer account']/span");

    public String visibleText(){
        return getText(VERIFY_USER_LOCATOR);
    }

}
