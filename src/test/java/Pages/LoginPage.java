package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtility;

public final class LoginPage extends BrowserUtility {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private static final By EMAIL_TEXTBOX_LOCATOR =By.id("email");
    private static final By PASSWORD_TEXTBOX_LOCATOR =By.id("passwd");
    private static final By SIGNIN_BUTTON_LOCATOR =By.id("SubmitLogin");

    public MyAccountPage doLoginWithCredentials(String email ,String pswd){
        enterText(EMAIL_TEXTBOX_LOCATOR , email);
        enterText(PASSWORD_TEXTBOX_LOCATOR , pswd);
        clickOn(SIGNIN_BUTTON_LOCATOR);
        return new MyAccountPage(getDriver());
    }


}
