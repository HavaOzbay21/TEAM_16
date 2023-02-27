package team_16.tests.us14;


import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
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

    @Test
    public void testTC_01() {
        HomePage homePage = new HomePage();
        SignIn signIn = new SignIn();
        MyAccount myAccount = new MyAccount();
        StoreManagerPage storeManagerPage = new StoreManagerPage();
        InventoryPage inventoryPage = new InventoryPage();
        ChooseImagePage chooseImagePage = new ChooseImagePage();
        AttributesPage attributesPage = new AttributesPage();
        SEOPage seoPage = new SEOPage();
        ToptanUrunGostermeAyarlarıPage toptanUrunGostermeAyarlarıPage = new ToptanUrunGostermeAyarlarıPage();
        AdvancedPage advancedPage = new AdvancedPage();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("halit_email"));
        signIn.passwordH.sendKeys(ConfigReader.getProperty("halit_sifre") + Keys.ENTER);
        ReusableMethods.waitFor(2);
        homePage.myAccountSecenegi.click();
        ReusableMethods.verifyElementDisplayed(myAccount.myAccountSayfasi);
        ReusableMethods.clickByJS(myAccount.StoreManagerSecenegi);
        ReusableMethods.verifyElementDisplayed(storeManagerPage.StoreManagerSayfaGorunumu);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.ProductSecenegi);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.AddNewSecenegi);
        ReusableMethods.scrollDownActions();
        assert storeManagerPage.AddProductYazisi.isDisplayed();

        Select select= new Select(storeManagerPage.SimpleProductSecili);

        select.selectByVisibleText("Simple Product");
        ReusableMethods.waitFor(2);
        assert storeManagerPage.simpleProduct.isDisplayed();
        select.selectByVisibleText("Variable Product");
        ReusableMethods.waitFor(2);
        assert storeManagerPage.variableProduct.isDisplayed();
        select.selectByVisibleText("Grouped Product");
        ReusableMethods.waitFor(2);
        assert storeManagerPage.groupedProduct.isDisplayed();
        select.selectByVisibleText("External/Affiliate Product");
        ReusableMethods.waitFor(2);
        assert storeManagerPage.externalAffiliate.isDisplayed();
        ReusableMethods.waitFor(5);

        //ReusableMethods.clickByJS(storeManagerPage.ProductTittle2);
       // storeManagerPage.externalAffiliate.sendKeys(Keys.TAB);  // Burada kaliyor
        storeManagerPage.ProductTittle2.sendKeys(ConfigReader.getProperty("ayakkabi_"));
        Driver.getDriver().switchTo().frame(0);
        ReusableMethods.waitFor(2);



        storeManagerPage.ShortDescription.sendKeys("ayakkabi");
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().parentFrame();

        ReusableMethods.waitFor(5);

        Driver.getDriver().switchTo().frame(1);
        ReusableMethods.waitFor(5);
        ReusableMethods.scrollDownActions();
        storeManagerPage.ShortDescription.sendKeys("rahat ve kullanisli bir ayakkabi..");//aciklama
        Driver.getDriver().switchTo().parentFrame();










//kucukfoto

        ReusableMethods.clickByJS(storeManagerPage.minnakresim);
        ReusableMethods.waitFor(5);
        chooseImagePage.MediaLibrary.click();
        ReusableMethods.waitFor(5);
        chooseImagePage.ayakkabifoto2.click();
        ReusableMethods.waitFor(5);
        chooseImagePage.ADDTOGALLERY.click();
        ReusableMethods.waitFor(5);

//buyuk foto
        ReusableMethods.clickByJS(storeManagerPage.BuyukFoto);
        ReusableMethods.clickByJS(chooseImagePage.UploadFiles);
        chooseImagePage.SELECTFILESBuyukFoto.click();
        String pathBuyukFoto = "C:\\Users\\User\\Desktop\\ürün fot.jpg";
        ReusableMethods.uploadFilePath(pathBuyukFoto);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(chooseImagePage.SELECTseciliFotoIcin);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(storeManagerPage.ProductBrandsEspanya);
        ReusableMethods.clickByJS(storeManagerPage.CategoryLAMPARAS);//katagori

        Driver.getDriver().switchTo().parentFrame();

        storeManagerPage.caption.sendKeys("super ayakkabi");

        storeManagerPage.alt_text.sendKeys("a.kabi");

        storeManagerPage.description.sendKeys("havadar rahat terletmeyen ayakkabi");










    }
}