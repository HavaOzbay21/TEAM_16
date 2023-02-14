package team_16.tests.us15;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_04 {

    //Vendor "Attributes"e tiklar
    //Vendor "Color"a tiklar
    //Vendor color ekleme sayfasini gorur
    //Vendor "SELECT ALL"a tiklar
    //Vendor "Color" kutusuna gelen butun renkleri gorur
    //Vendor "SELECT NONE"e tiklar
    //Vendor Color kutusunun bosaldigini gorur
    //Vendor "ADD NEW"e tiklar
    //Vender acilan iframe eklemek istedigi rengi girer
    //Vendor "Aceptar"a tiklar
    //Vendor yazdigi rengi "Color" kutusubda gorur
    //Vendor "Size"a tiklar
    //Vendor "SELECT ALL"a tiklar
    //Vendor "Size" kutusuna gelen butun bedenleri gorur
    //Vendor "SELECT NONE"e tiklar
    //Vendor "Size" kutusunun bosaldigini gorur
    //Vendor "ADD NEW"e tiklar
    //Vendor acilan iframe sayfasina eklemek istedigi "beden"i girer
    //Vendor  "Aceptar"a tiklar
    //Vendor ekledigi bedeni "Size" kutusunda gorur

    @Test
    public void testTC_04() {
        HomePage homePage = new HomePage();
        SignIn signIn = new SignIn();
        MyAccount myAccount = new MyAccount();
        StoreManagerPage storeManagerPage = new StoreManagerPage();
        ShippingPage shippingPage = new ShippingPage();
        AttributesPage attributesPage = new AttributesPage();


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
        ReusableMethods.clickByJS(storeManagerPage.AttributesSecenegi);
        attributesPage.ColorSecenegi.click();
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(attributesPage.SelectAllSecenegi);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(attributesPage.SelectNoneSecenegi);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(attributesPage.AddNewSecenegi);
        ReusableMethods.waitFor(2);
//        Driver.getDriver().switchTo().alert();
//        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().alert().sendKeys("rosa");
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(2);
    }

}
