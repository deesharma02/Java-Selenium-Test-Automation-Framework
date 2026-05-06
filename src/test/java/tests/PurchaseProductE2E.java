package tests;

import Pages.MyAccountPage;
import Pages.SearchPage;
import static constants.Size.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PurchaseProductE2E extends BaseTest{

    public static SearchPage searchPage;
    @BeforeMethod(description = "Open the application and Login with valid credentials")
    public void setup(){
        searchPage = homePage.ClickOnSignIn().doLoginWithCredentials("doe.john@test.com","Test@12345").searchProduct("Printed Summer Dress");
    }

    @Test(description = "Purchase the product E2E")
    public void purchaseProductE2E(){
        searchPage.clickOnMore().selectSize(M).clickOnAddToCart().clickOnProceedToCheckOut().confirmCartSummary().confirmAddress().confirmShipping();
    }


}
