package team_16.tests.us15;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_06 {





    @Test
    public void testTC_01() throws IOException {
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
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("emailhava"));
        signIn.passwordH.sendKeys(ConfigReader.getProperty("passwordhava") + Keys.ENTER);
        ReusableMethods.waitFor(2);
        homePage.myAccountSecenegi.click();
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        ReusableMethods.verifyElementDisplayed(myAccount.myAccountSayfasi);
        ReusableMethods.clickByJS(myAccount.StoreManagerSecenegi);
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        ReusableMethods.verifyElementDisplayed(storeManagerPage.StoreManagerSayfaGorunumu);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.ProductSecenegi);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.AddNewSecenegi);
        ReusableMethods.scrollDownActions();
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        assert storeManagerPage.AddProductYazisi.isDisplayed();
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        assert storeManagerPage.SimpleProductSecili.isDisplayed();
        ReusableMethods.clickByJS(storeManagerPage.VirtualKutucugu);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(storeManagerPage.DownloadableKutucugu);
        ReusableMethods.clickByJS(storeManagerPage.DownloadableKutucugu);
        ReusableMethods.waitFor(2);
        storeManagerPage.ProductTitle.sendKeys(ConfigReader.getProperty("ProductTitle"));
        storeManagerPage.Price.sendKeys(ConfigReader.getProperty("Price($)"));
        storeManagerPage.SalePrice.sendKeys(ConfigReader.getProperty("SalePrice($)"));
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(storeManagerPage.CategoryLAMPARAS);
        Driver.getDriver().switchTo().frame(0);
        ReusableMethods.waitFor(2);
        storeManagerPage.ShortDescription.sendKeys("Lamparas antiguas");
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().parentFrame();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(storeManagerPage.KucukFoto);
        ReusableMethods.waitFor(5);
        chooseImagePage.MediaLibrary.click();
        ReusableMethods.waitFor(5);
        chooseImagePage.MaviFotoyuSec.click();
        ReusableMethods.waitFor(5);
        chooseImagePage.ADDTOGALLERY.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(storeManagerPage.BuyukFoto);
        ReusableMethods.clickByJS(chooseImagePage.UploadFiles);
        chooseImagePage.SELECTFILESBuyukFoto.click();
        String pathBuyukFoto = "C:\\Users\\havao\\OneDrive\\Masaüstü\\Screenshot 2023-02-14 123805.png";
        ReusableMethods.uploadFilePath(pathBuyukFoto);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(chooseImagePage.SELECTseciliFotoIcin);
        ReusableMethods.waitFor(5);

        Driver.getDriver().switchTo().frame(1);
        ReusableMethods.waitFor(5);
        ReusableMethods.scrollDownActions();
        storeManagerPage.ShortDescription.sendKeys("Lamparas otomanos ,todo esta echo a mano , se puede utilizar para habitaciones,para salas ext....");
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().parentFrame();
        ReusableMethods.waitFor(5);

        ReusableMethods.clickByJS(storeManagerPage.ProductBrandsEspanya);
        ReusableMethods.clickByJS(storeManagerPage.InventorySecenegi);
        inventoryPage.SKUkutucugu.sendKeys("20710204");
        ReusableMethods.clickByJS(inventoryPage.ManagerStockKutusu);
        inventoryPage.StockQtyKutusu.clear();
        inventoryPage.StockQtyKutusu.sendKeys("50");
        Select select = new Select(inventoryPage.AllowBackordersDropdown);
        select.selectByVisibleText("Allow");
        ReusableMethods.clickByJS(storeManagerPage.AttributesSecenegi);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(attributesPage.ColorSecenegi);
        ReusableMethods.clickByJS(attributesPage.SelectAllSecenegi);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(attributesPage.SelectNoneSecenegi);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(attributesPage.AddNewSecenegi);
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().alert().sendKeys("rosachillon");
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(attributesPage.SizeSecenegi);
        ReusableMethods.clickByJS(attributesPage.SelectAllSizeSecenegi);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(attributesPage.SelectNoneSizeSecenegi);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(attributesPage.AddNewSizeSecenegi);
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().alert().sendKeys("muyyylargo");
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(storeManagerPage.SEOSecenegi);
        seoPage.EnterAFocusKeywordKutucugu.sendKeys("REGALOS");
        seoPage.MetaDescriptionKutucugu.sendKeys("regalos diferentes");
        ReusableMethods.clickByJS(storeManagerPage.ToptanUrunGostermeAyarlarıSecenegi);
        Select select1 = new Select(toptanUrunGostermeAyarlarıPage.PieceTypeDropdown);
        select1.selectByVisibleText("Piece");
        toptanUrunGostermeAyarlarıPage.UnitsPerPieceKutucugu.clear();
        toptanUrunGostermeAyarlarıPage.UnitsPerPieceKutucugu.sendKeys("50");
        toptanUrunGostermeAyarlarıPage.MinOrderQuantityKutucugu.clear();
        toptanUrunGostermeAyarlarıPage.MinOrderQuantityKutucugu.sendKeys("1");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(storeManagerPage.AdvancedSecenegi);
        ReusableMethods.waitFor(2);
        advancedPage.MenuOrderKutucugu.sendKeys("1");
        ReusableMethods.waitFor(2);
        advancedPage.PurchaseNoteKutucugu.sendKeys("GRACIAS POR SU COMPRA");
        ReusableMethods.clickByJS(storeManagerPage.SUBMITButonu);
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        assert storeManagerPage.EditProductGorunuyormu.isDisplayed();

    }
}
