package team_16.tests.us16;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_01 {


    //Vendor "Inventory" secenegine tiklar
    //Vendor "SKU" kutucuguna bir referans numarasi girer
    //Vendor "Manage Stock?" kutucugunu isaretler
    //Vendor "Stock Qty" kutusuna bir Integer deger girer
    //Vendor "Allow Backorders?" dropdownundan "Allow" secenegini secer
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
        //Vendor "Add Product"a oldugunu dogrular
        //Vendor "Simple Product" kutusunda "simple product'u secili gorur
        //Vendor "Virtual" kutucugunu secer
        //Vendor "Downloadable" kutucugunu secer
        //Vendor "ProductTitle" kutusuna ekleyecegi urunun basligini yazar
        //Vendor "Price($)" kutusuna urunun fiyatini yazar
        //Vendor "Sale Price($)" kutusuna urunun indirimli fiyatini yazar
        //Vendor "Short Description" kutusuna  kisa bir aciklama yapar
        //Vendor "Description" kutusuna urunu tanitan bir aciklama yapar
        //Vendor buyuk foto kutusuna urunun fotosunu yuklar
        //Vendor kucuk foto kutusuna urunun fotosunu yuklar
        //Vendor "Categories" kutucugunda urunune ait bir category secer
        //Vendor "Product brands" kutucugundan bir marca ismi secer
    }
}
