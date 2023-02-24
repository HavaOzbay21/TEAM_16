package team_16.tests.us15;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_05 {




    //Vendor "Units Per Piece" kutucuguna bir INTEGER deger girer
    //Vendor "Min Order Quantity?" kutucuguna INTEGER bir deger girer
    //Vendor "Advanced" secenegine tiklar
    //Vendor "Menu Order" kutusuna INTEGER bir deger girer
    //Vendor "Purchase Note" kutusuna bir not girer
    @Test
    public void testTC_05() throws IOException {
        HomePage homePage = new HomePage();
        SignIn signIn = new SignIn();
        MyAccount myAccount = new MyAccount();
        StoreManagerPage storeManagerPage = new StoreManagerPage();
        ShippingPage shippingPage = new ShippingPage();
        LinkedPage linkedPage = new LinkedPage();
        SEOPage seoPage = new SEOPage();
        ToptanUrunGostermeAyarlarıPage toptanUrunGostermeAyarlarıPage = new ToptanUrunGostermeAyarlarıPage();
        AdvancedPage advancedPage = new AdvancedPage();


        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("emailhava"));
        signIn.passwordH.sendKeys(ConfigReader.getProperty("passwordhava") + Keys.ENTER);
        ReusableMethods.waitFor(2);
        homePage.myAccountSecenegi.click();
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        assert myAccount.myAccountSayfasi.isDisplayed();
        ReusableMethods.clickByJS(myAccount.StoreManagerSecenegi);
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        assert storeManagerPage.StoreManagerSayfaGorunumu.isDisplayed();
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.ProductSecenegi);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.AddNewSecenegi);
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(storeManagerPage.LinkedSecenegi);
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        assert linkedPage.Up_sellsKutucugu.isDisplayed();
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        assert linkedPage.Cross_sellsKutucugu.isDisplayed();
        ReusableMethods.clickByJS(storeManagerPage.SEOSecenegi);
        ReusableMethods.scrollDownActions();
        seoPage.EnterAFocusKeywordKutucugu.sendKeys("REGALOS");
        seoPage.MetaDescriptionKutucugu.sendKeys("regalos diferentes");
        ReusableMethods.clickByJS(storeManagerPage.ToptanUrunGostermeAyarlarıSecenegi);
        ReusableMethods.scrollDownActions();
        Select select = new Select(toptanUrunGostermeAyarlarıPage.PieceTypeDropdown);
        select.selectByVisibleText("Piece");
        toptanUrunGostermeAyarlarıPage.UnitsPerPieceKutucugu.clear();
        toptanUrunGostermeAyarlarıPage.UnitsPerPieceKutucugu.sendKeys("50");
        toptanUrunGostermeAyarlarıPage.MinOrderQuantityKutucugu.clear();
        toptanUrunGostermeAyarlarıPage.MinOrderQuantityKutucugu.sendKeys("50");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(storeManagerPage.AdvancedSecenegi);
        ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(2);
        advancedPage.MenuOrderKutucugu.sendKeys("50");
        ReusableMethods.waitFor(2);
        advancedPage.PurchaseNoteKutucugu.sendKeys("merhaba");
        //Driver.closeDriver();


    }
}
