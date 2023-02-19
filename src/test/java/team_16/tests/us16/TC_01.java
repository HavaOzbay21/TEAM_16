package team_16.tests.us16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_01 {



    //Vendor "Downloadable" secenegine tiklar
    //Vendor "Name" kutusuna urunun ismini girer
    //Vendor "File " kutusuna ait " UPLOAD" butonuna tiklar
    //Vendor "Download Limit" kutugunu default olarak "Unlimited" olarak gorur
    //Vendor "Download Expiry" kutusunda olan "Never" secenegini default olarak gorur
    //Vendor "Attributes" secenegine tiklar
    //Vendor "Color" kutucugunu secer
    //Vendor yeni acilan sayfada "SELECT ALL" butonuna tiklar
    //Vendor "Color" kutusuna gelen tum renkleri gorur
    //Vendor "SELECT NONE" butonuna tiklar
    //Vendor sectigi butun renklerin silindigini gorur
    //Vendor "ADD NEW" butonuna tiklar
    //Vendor cikaln "iframe" eklemek istedigi rengi yazar
    //Vendor "Aceptar"a tiklar
    //Vendor ekledigi rengi "Color" kutuna geldigini gorur
    //Vendor  "Size" a tiklar
    //Vendor yeni acilan "Size" sayfasinda "SELECT ALL" a tiklar
    //Vendor "Size" kutusuna sistemde kayitli olan butun bedenleri gorur
    //Vendor "SELECT NONE" e tiklar
    //Vendor butun bedenlerin silindigini gorur
    //Vendor "ADD NEW" e tiklar
    //Vendor cikan "iframe" kutusuna eklemek istedigi bedeni girer
    //Vendor "Aceptar"a tiklar
    //Vendor ekledigi yeni bedeni "Size" kutusunda gorur
    //Vendor "SEO" secenegine tiklar
    //Vendor "Enter a focus keyword" kutusuna anahtar bir kelime girer
    //Vendor "Meta description" kutusa bazi degerler girer
    //Vendor "Toptan Ürün Gösterme Ayarları" secenegine tiklar
    //Vendor "Piece Type" dropdownundan "Piece" i secer
    //Vendor "Parça Başına Birimler" kutusuna bir INTEGER deger girer
    //Vendor " Min. Sipariş Miktarı?" kutusuna bir INTEGER deger girer
    //Vendor "Advanced" secenegine tiklar
    //Vendor " Menu Order" kutusuna bir INTEGER deger girer
    //Vendor "Purchase Note" kutusuna bir not girer
    //Vendor "SUBMIT" butonuna tiklar
    //Vendor islemin tamamlandigi onayini gorur

    @Test
    public void testTC_01() {
        HomePage homePage = new HomePage();
        SignIn signIn = new SignIn();
        MyAccount myAccount = new MyAccount();
        StoreManagerPage storeManagerPage = new StoreManagerPage();
        InventoryPage inventoryPage = new InventoryPage();
        ChooseImagePage chooseImagePage = new ChooseImagePage();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("emailhava"));
        signIn.passwordH.sendKeys(ConfigReader.getProperty("passwordhava") + Keys.ENTER);
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
        assert storeManagerPage.SimpleProductSecili.isDisplayed();
        ReusableMethods.clickByJS(storeManagerPage.VirtualKutucugu);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(storeManagerPage.DownloadableKutucugu);
        ReusableMethods.waitFor(2);
        storeManagerPage.ProductTitle.sendKeys(ConfigReader.getProperty("ProductTitle"));
        storeManagerPage.Price.sendKeys(ConfigReader.getProperty("Price($)"));
        storeManagerPage.SalePrice.sendKeys(ConfigReader.getProperty("SalePrice($)"));
        Driver.getDriver().switchTo().frame(0);
        ReusableMethods.waitFor(2);
        storeManagerPage.ShortDescription.sendKeys("Lamparas antiguas");
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().defaultContent();
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().frame(1);
        ReusableMethods.waitFor(2);
        storeManagerPage.Description.sendKeys("Lamparas otomanos , todo esta echo a mano , se puede utilizar para habitaciones,para salas ext....");
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().parentFrame();
        ReusableMethods.waitFor(2);



        ReusableMethods.clickByJS(storeManagerPage.BuyukFoto);
        chooseImagePage.MediaLibrary.click();
        chooseImagePage.TuruncuFotoyuSec.click();
        chooseImagePage.SELECTseciliFotoIcin.click();
        storeManagerPage.KucukFoto.click();
        chooseImagePage.MaviFotoyuSec.click();
        chooseImagePage.ADDTOGALLERY.click();
        ReusableMethods.clickByJS(storeManagerPage.CategoryAccessories);
        ReusableMethods.clickByJS(storeManagerPage.ProductBrandsEspanya);
        //Vendor "Inventory" secenegine tiklar
        storeManagerPage.InventorySecenegi.click();
        //Vendor "SKU" kutucuguna bir referans numarasi girer
        inventoryPage.SKUkutucugu.sendKeys("complica8596");
        //Vendor "Manage Stock?" kutucugunu isaretler
        inventoryPage.ManagerStockKutusu.click();
        //Vendor "Stock Qty" kutusuna bir Integer deger girer
        inventoryPage.StockQtyKutusu.sendKeys("50");
        //Vendor "Allow Backorders?" dropdownundan "Allow" secenegini secer
        Select select = new Select(inventoryPage.AllowBackordersDropdown);
        select.selectByVisibleText("Allow");
    }
}
