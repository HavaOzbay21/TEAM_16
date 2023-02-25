package team_16.tests.us10_11_12;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.SignIn;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class US_11 {


    @BeforeTest
    public void init() {
        HomePage homePage = new HomePage();
        SignIn signIn= new SignIn();
        MyAccount myAccount= new MyAccount();
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        ReusableMethods.waitForPageToLoad(50);

        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("sehri_email"));
        signIn.password.sendKeys(ConfigReader.getProperty("sehri_password"));
        signIn.signInButton.click();

        ReusableMethods.waitFor(5);
        homePage.myAccountSecenegi.click();
        ReusableMethods.waitFor(3);
    }
    @Test
    public void TC_01() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.myAccountSayfasi.isDisplayed();

    }

    @Test
    public void TC_02() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.orders.isDisplayed();

    }

    @Test
    public void TC_03() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.downloads.isDisplayed();

    }


    @Test
    public void TC_04() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.adresses.isDisplayed();

    }

    @Test
    public void TC_05() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.accountDetails.isDisplayed();

    }

    @Test
    public void TC_06() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.wishList.isDisplayed();

    }

    @Test
    public void TC_07() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.logOut.isDisplayed();

    }

    @Test
    public void TC_08() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.storeManager.isDisplayed();

    }

    @Test
    public void TC_09() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.orders2.isDisplayed();

    }

    @Test
    public void TC_10() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.downloads2.isDisplayed();

    }

    @Test
    public void TC_11() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.adresses2.isDisplayed();

    }

    @Test
    public void TC_12() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.accountDetails2.isDisplayed();

    }

    @Test
    public void TC_13() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.wishList2.isDisplayed();

    }

    @Test
    public void TC_14() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.supportTickets.isDisplayed();

    }

    @Test
    public void TC_15() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.followings.isDisplayed();

    }

    @Test
    public void TC_16() {
        MyAccount myAccount= new MyAccount();
        assert myAccount.logOut2.isDisplayed();

    }

    @AfterTest
    public void destroy() throws IOException {
        ReusableMethods.scrollDownActions();
        ReusableMethods.getScreenshot("EkranGoruntusu");
        Driver.closeDriver();

    }
}

