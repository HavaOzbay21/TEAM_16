package team_16.tests.us15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.SignIn;
import team_16.pages.StoreManagerPage;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;
import java.security.Key;
import java.util.jar.JarEntry;

public class TC_01 {







    //Vendor acilan  sayfada en altina iner
    //Vendor "Inventory" secenegini gorur
    //Vendor "Shipping" secenegini gorur
    //Vendor "Attributes" secenegini gorur
    //Vendor "Linked" secenegini gorur
    //Vendor "SEO" secenegini gorur
    //Vendor "Toptan Urun Gosterme Ayarlari" secenegini gorur
    //Vendor "Advanced" secenegini gorur


    @Test
    public void testTC_01() throws IOException {
        HomePage homePage = new HomePage();
        SignIn signIn = new SignIn();
        MyAccount myAccount = new MyAccount();
        StoreManagerPage storeManagerPage = new StoreManagerPage();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("emailhava"));
        signIn.passwordH.sendKeys(ConfigReader.getProperty("passwordhava") + Keys.ENTER);
        ReusableMethods.waitFor(2);
        homePage.myAccountSecenegi.click();
        assert myAccount.myAccountSayfasi.isDisplayed();
        ReusableMethods.clickByJS(myAccount.StoreManagerSecenegi);
        assert storeManagerPage.StoreManagerSayfaGorunumu.isDisplayed();
        ReusableMethods.takeScreenshotOfElementH(storeManagerPage.StoreManagerSayfaGorunumu);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.ProductSecenegi);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.AddNewSecenegi);
        ReusableMethods.waitFor(2);
        assert storeManagerPage.InventorySecenegi.isDisplayed();
        assert storeManagerPage.ShippingSecenegi.isDisplayed();
        assert storeManagerPage.AttributesSecenegi.isDisplayed();
        assert storeManagerPage.LinkedSecenegi.isDisplayed();
        assert storeManagerPage.SEOSecenegi.isDisplayed();
        assert storeManagerPage.ToptanÜrünGöstermeAyarlarıSecenegi.isDisplayed();
        assert storeManagerPage.AdvancedSecenegi.isDisplayed();
        ReusableMethods.takeScreenshotOfElementH(storeManagerPage.ShippingSecenegi);
    }
}







