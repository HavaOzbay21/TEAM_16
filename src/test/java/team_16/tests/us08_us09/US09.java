package team_16.tests.us08_us09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class US09 {
    VendorRegistration vendorRegistration = new VendorRegistration();

    SignIn signIn = new SignIn();
    SignUp signUp = new SignUp();
    HomePage homePage = new HomePage();
    Urunler urunler = new Urunler();
    ShoppingCard shoppingCard = new ShoppingCard();
    BillingDetails billingDetails = new BillingDetails();
    MyAccount myAccount = new MyAccount();
    Actions actions = new Actions(Driver.getDriver());

    @Test(priority = 1)
    public void test01() {
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
        assert vendorRegistration.vendorRegistrationYazısı.isDisplayed();
    }

    @Test(priority = 2)
    public void test02() throws InterruptedException {
        //*****US09*****
        //*****TC02*****
        //1-)Vendor Registration sayfasına ulaşır
        Driver.getDriver().get("https://spendinggood.com/vendor-register/");
        //2-)Kullanıcı Registration sayfasında yer alan E-mail kutusunu görüntülemeli
        assert vendorRegistration.registrationEmailKutusu.isDisplayed();
        //3-)Kullanıcı Mail adresini doğru şekilde girer
        Driver.getDriver().get("https://www.fakemail.net/");
        ReusableMethods.waitFor(3);
        String emailcopyelde = Driver.getDriver().findElement(By.xpath("//span[@id='email']")).getText();
        System.out.println("giriş yaptığımız email : " + emailcopyelde);

        WebElement copyfakemail = Driver.getDriver().findElement(By.xpath("//div[@style='text-align:center;padding:9px;font-size:20px;color:white;background:#ff99cc;']"));
        copyfakemail.click();

        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().back();//register sayfasına geri geldik
        // Driver.getDriver().get("https://spendinggood.com/vendor-register/");
        ReusableMethods.waitFor(3);
        //registrationEmailKutusu.click();
        ReusableMethods.clickByJS(vendorRegistration.registrationEmailKutusu);
        ReusableMethods.waitFor(3);
        //registrationEmailKutusu.sendKeys(Keys.CONTROL+"v");//yapıştır
        vendorRegistration.registrationEmailKutusu.sendKeys(Keys.CONTROL + "v");//yapıştır

        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().forward();
        ReusableMethods.waitFor(11);
        Driver.getDriver().findElement(By.xpath("//tr[@class='hidden-xs hidden-sm klikaciRadek newMail']")).click();
        ReusableMethods.waitFor(3);
        WebElement fakecode = Driver.getDriver().findElement(By.id("predmet"));
        ReusableMethods.waitFor(3);
        System.out.println(fakecode.getText());
        String fakecodetext = fakecode.getText();
        String code = fakecodetext.split(" ")[6];
        System.out.println("giriş yaptığımız code : " + code);
        Driver.getDriver().navigate().back();
        Driver.getDriver().findElement(By.xpath("//input[@name='wcfm_email_verified_input']")).sendKeys(code);


        vendorRegistration.password.sendKeys("asdf1234");
        vendorRegistration.Confirm_Password.sendKeys("asdf1234");
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(vendorRegistration.Register_Button);
        ReusableMethods.waitFor(5);
        Driver.getDriver().navigate().back();
        assert vendorRegistration.Completed_Yazısı.isDisplayed();
        ReusableMethods.waitFor(5);
        Driver.getDriver().navigate().refresh();

        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
        WebElement signout = Driver.getDriver().findElement(By.xpath("(//i[@class='w-icon-account'])[1]"));
        ReusableMethods.clickByJS(signout);
        ReusableMethods.waitFor(3);
        WebElement logout = Driver.getDriver().findElement(By.xpath("//span[@class='icon-box-icon icon-logout']"));
        ReusableMethods.clickByJS(logout);
        ReusableMethods.waitFor(3);
        Driver.getDriver().get("https://spendinggood.com/vendor-register/");
        ReusableMethods.waitFor(5);
        vendorRegistration.useremailus9.sendKeys(Keys.CONTROL + "v");//yapıştır
        vendorRegistration.codeus9.sendKeys(code);
        vendorRegistration.password.sendKeys("asdf1234");
        vendorRegistration.Confirm_Password.sendKeys("asdf1234");
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(vendorRegistration.Register_Button);
        assert vendorRegistration.existsyazısı.isDisplayed();
        Driver.closeDriver();


    }
}
