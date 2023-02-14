package team_16.tests.us08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class US_09 {


    SignIn signIn = new SignIn();
    SignUp signUp = new SignUp();
    HomePage homePage = new HomePage();
    Urunler urunler = new Urunler();
    ShoppingCard shoppingCard = new ShoppingCard();
    BillingDetails billingDetails = new BillingDetails();
    MyAccount myAccount = new MyAccount();

    @Test (priority = 1)
    public  void test01() {
        //*****US09*****
        //*****TC01*****
        //1-)Kullanici https://spendinggood.com/ url'sine gider
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        //2-)Anasayfada sag ust kosedeki Sign In linkine tiklar
        homePage.signIn.click();
        //3-)Kullanici Sign-in sayfasina yonlendirilir
        //4-)Kullanici Sign in sayfasında yer alan Sign Up butonunu görüntüler ve tıklar
        ReusableMethods.clickByJS(homePage.SignUp);
        //5-)Açılan Sign Up sayfasının alt kısmında "Become a Vendor" linkine tıklar
        ReusableMethods.clickByJS(signUp.becomeAVendor);
        //6-)Vendor Registration sayfasına ulaşır
        WebElement vendorRegistrationYazısı = Driver.getDriver().findElement(By.xpath("//h2[.='Vendor Registration']"));
        Assert.assertTrue(vendorRegistrationYazısı.isDisplayed());
    }
    @Test (priority = 2)
    public  void test02() {
        //*****US09*****
        //*****TC02*****
        //1-)Vendor Registration sayfasına ulaşır
        Driver.getDriver().get("https://spendinggood.com/vendor-register/");
        WebElement vendorRegistrationYazısı = Driver.getDriver().findElement(By.xpath("//h2[.='Vendor Registration']"));
        Assert.assertTrue(vendorRegistrationYazısı.isDisplayed());
        //2-)Kullanıcı Registration sayfasında yer alan E-mail kutusunu görüntülemeli

        WebElement RegistrationEmailKutusu =Driver.getDriver().findElement(By.xpath("//input[@name='user_email']"));
        Assert.assertTrue(RegistrationEmailKutusu.isDisplayed());

        //3-)Kullanıcı Mail adresini doğru şekilde girer
        ReusableMethods.clickByJS(RegistrationEmailKutusu);
        RegistrationEmailKutusu.sendKeys("hamittechpro@gmail.com");







    }













}
