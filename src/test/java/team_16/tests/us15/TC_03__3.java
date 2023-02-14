package team_16.tests.us15;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_03__3 {

    //Vendor siteye gider
    //Vendor sag ust kisimdaki "Sign In" e tiklar
    //Vendor "SIGN IN - SIGN-UP" sayfasini gorur
    //Vendor "SIGN IN" secenegini secili gorur
    //Vendor "Username or email address" kismina kayitli emaili girer
    //Vendor "Password" bolumune sifresini girer
    //Vendor "SIGN IN" butonuna tiklar
    //Vendor  acilan sayfada"My Account"a tiklar
    //Vendor "My Account" sayfasini gorur
    //Vendor "Store Manager"e tiklar
    //Vendor "Store Manager" sayfasini gorur
    //Vendor "Products" segmesinin uzerine gelir
    //Vendor products'un uzerindeyken gelen  "Add New" segenegine tiklar
    //Vendor acilan  sayfada en altina iner
    //Vendor "Shipping" secenegini tiklar
    //Vendor "Weight(kg)" kutusuna bir INTEGER deger girer
    //Vendor "Dimensions(cm)" ait "Length"kutucuguna bir INTEGER  deger girer
    //Vendor "Dimensions(cm)" ait "Width"kutucuguna bir INTEGER  deger girer
    //Vendor "Dimensions(cm)" ait "Height"kutucuguna bir INTEGER  deger girer
    //Vendor "Shipping class" ait kutucukta default olarak secilen "No shipping class" secenegini gorur
    //Vendor "Processing Time" dropdownundan herhangi bir secenegi secer

    @Test
    public void testTC_03_3() {
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
        shippingPage.LenghtCMKutusu.sendKeys("50");
        shippingPage.WeightKGKutusu.sendKeys("50");
        shippingPage.HeightCMKutusu.sendKeys("50");
        ReusableMethods.scrollDownActions();
        assert shippingPage.ShippingClassDriopdown.isDisplayed();
        Select select = new Select(shippingPage.ProcessingTimeDropdown);
        select.selectByVisibleText("2-3 weeks");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }
}
