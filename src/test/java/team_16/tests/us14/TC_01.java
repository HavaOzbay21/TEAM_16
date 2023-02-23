package team_16.tests.us14;


import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

//        Kullanici https://spendinggood.com/ siteye giris yapar
//        Anasayfada sag ust kosedeki Sign In linkine tiklar
//        Kullanici Sign-in sayfasina yonlendirilir
//        Kullanici Vendor olarak "Username or email address" alanina gecerli bir deger girer
//        Password alanina gecerli bir deger girer
//        Sign In butonuna tiklar
//        Vendor "My Account" sayfasina yonlendirilir
//        "Store Manager" butonuna tiklar
//        "Product" butonuna tiklar
//        "Add new " e tiklar
//        "Simple Product" e tiklar
//        "Variable Product" ü görür
//        "Grouped Product" ü görür
//        "External - Affiliate Product " ü görür

public class TC_01 {

    HomePage homePage = new HomePage();
    SignIn signIn = new SignIn();

    StoreManagerPage storeManagerPage= new StoreManagerPage();

    MyAccount myAccount= new MyAccount();
    @Test
    public void TC01() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        ReusableMethods.waitFor(10);
        ReusableMethods.waitForPageToLoad(50);

        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("halit_email"));
        signIn.password.sendKeys(ConfigReader.getProperty("halit_sifre"));
        signIn.signInButton.click();

        ReusableMethods.waitFor(9);
        homePage.myAccountSecenegi.click();
        ReusableMethods.waitFor(3);





    }
}