package team_16.tests.us10_11_12;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.SignIn;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class US_11 {

    @Test
    public void TC() throws IOException {
        HomePage homePage = new HomePage();
        SignIn signIn= new SignIn();
        MyAccount myAccount= new MyAccount();
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        // ReusableMethods.waitForPageToLoad(50);

        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("sehri_email"));
        signIn.password.sendKeys(ConfigReader.getProperty("sehri_password"));
        signIn.signInButton.click();

        ReusableMethods.waitFor(5);
        homePage.myAccountSecenegi.click();
        ReusableMethods.waitFor(3);
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(myAccount.myAccountSayfasi.isDisplayed());
        softAssert.assertTrue(myAccount.orders.isDisplayed());
        softAssert.assertTrue( myAccount.downloads.isDisplayed());
        softAssert.assertTrue(myAccount.adresses.isDisplayed());
        softAssert.assertTrue(myAccount.accountDetails.isDisplayed());
        softAssert.assertTrue(myAccount.wishList.isDisplayed());
        softAssert.assertTrue(myAccount.logOut.isDisplayed());
        softAssert.assertTrue(myAccount.storeManager.isDisplayed());
        softAssert.assertTrue(myAccount.orders2.isDisplayed());
        softAssert.assertTrue(myAccount.downloads2.isDisplayed());
        softAssert.assertTrue(myAccount.adresses2.isDisplayed());
        softAssert.assertTrue(myAccount.accountDetails2.isDisplayed());
        softAssert.assertTrue(myAccount.wishList2.isDisplayed());
        softAssert.assertTrue(myAccount.supportTickets.isDisplayed());
        softAssert.assertTrue(myAccount.followings.isDisplayed());
        softAssert.assertTrue(myAccount.logOut2.isDisplayed());
        softAssert.assertAll();

        ReusableMethods.scrollDownActions();
        ReusableMethods.getScreenshot("EkranGoruntusu");
        Driver.closeDriver();
    }



}

