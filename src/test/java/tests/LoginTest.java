package tests;

import Pages.HomePage;
import static constants.Browser.*;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.User;


public class LoginTest {

    HomePage homePage;

    @BeforeMethod(description = "Setting up the page")
    public void setUp(){
        homePage = new HomePage(CHROME);
    }

    @Test(description = "Verify Login with valid credential" , dataProviderClass =
            dataProviders.LoginDataProvider.class , dataProvider = "LoginTestDataProvider")
    public void VerifyLoginTest(User user) {
        String userName =
                homePage.ClickOnSignIn().doLoginWithCredentials(user.getEmail() , user.getPassword()).visibleText();
        Assert.assertEquals(userName , "John Doe");
    }

    @AfterTest
    public void tearDown(){

    }

}
