package tests;

import Pages.AddressPage;
import Pages.MyAccountPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Address;
import utilities.AddressFakerUtility;

public class AddAddressTest extends BaseTest{

    private AddressPage addressPage;
    private Address address;
    @BeforeMethod(description = "Open the application and Login with valid credentials")
    public void setup(){
        addressPage = homePage.ClickOnSignIn().doLoginWithCredentials("doe.john@test.com","Test@12345").goToAddressPage();
        address = AddressFakerUtility.getFakerAddress();
    }

    @Test
    public void addAddressTest(){
        addressPage.saveAddress(address);
    }
}
