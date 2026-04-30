package Pages;

import constants.Browser;
import static constants.Environments.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtility;
import utilities.PropertiesUtil;

import java.io.IOException;
import java.net.URL;

public final class HomePage extends BrowserUtility {

    public HomePage(Browser driver){
        super(driver);
        gotoWebsite(PropertiesUtil.readProperty(QA , "URL"));
        maximizaBrowser();
    }

    private static final By SIGN_ON_LOCATOR = By.xpath("//a[@title='Log in to your customer account']");

    public LoginPage ClickOnSignIn(){
        clickOn(SIGN_ON_LOCATOR);
        return new LoginPage(getDriver());
    }
}
