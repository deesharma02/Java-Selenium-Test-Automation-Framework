package tests;

import Pages.HomePage;
import Pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductSearchTest extends BaseTest{

//    public static HomePage homePage ;
    public static MyAccountPage myAccountPage;
    @BeforeMethod(description = "Open the application and Login with valid credentials")
    public void setup(){
        myAccountPage = homePage.ClickOnSignIn().doLoginWithCredentials("doe.john@test.com","Test@12345");
    }

    @Test(description = "Verify Login with Invalid credential")
    public void VerifyProductSearch() {
        myAccountPage.searchProduct("Printed Summer Dress").VerifyProductSearchResult();
    }


}
