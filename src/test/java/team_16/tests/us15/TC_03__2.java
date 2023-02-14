package team_16.tests.us15;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_03__2 {
    //Vendor products'un uzerindeyken gelen  "Add New" segenegine tiklar


    @Test
    public void testTC_03_2() {
        HomePage homePage = new HomePage();
        SignIn signIn = new SignIn();
        MyAccount myAccount = new MyAccount();
        StoreManagerPage storeManagerPage = new StoreManagerPage();
        ShippingPage shippingPage = new ShippingPage();


        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("emailhava"));
        signIn.passwordH.sendKeys(ConfigReader.getProperty("passwordhava") + Keys.ENTER);
        ReusableMethods.waitFor(2);
        homePage.myAccountSecenegi.click();
        assert myAccount.myAccountSayfasi.isDisplayed();
        ReusableMethods.clickByJS(myAccount.StoreManagerSecenegi);
        assert storeManagerPage.StoreManagerSayfaGorunumu.isDisplayed();
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.ProductSecenegi);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.AddNewSecenegi);
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(storeManagerPage.ShippingSecenegi);
        shippingPage.WeightKGKutusu.sendKeys("50");
        shippingPage.LenghtCMKutusu.sendKeys("");
        Driver.closeDriver();
    }
}
