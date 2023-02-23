package team_16.tests.us09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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
        WebElement vendorRegistrationYazısı = Driver.getDriver().findElement(By.xpath("//h2[.='Vendor Registration']"));
        Assert.assertTrue(vendorRegistrationYazısı.isDisplayed());
    }

    @Test(priority = 2)
    public void test02() throws InterruptedException {
        //*****US09*****
        //*****TC02*****
        //1-)Vendor Registration sayfasına ulaşır
        Driver.getDriver().get("https://spendinggood.com/vendor-register/");
        WebElement vendorRegistrationYazısı = Driver.getDriver().findElement(By.xpath("//h2[.='Vendor Registration']"));
        Assert.assertTrue(vendorRegistrationYazısı.isDisplayed());
        //2-)Kullanıcı Registration sayfasında yer alan E-mail kutusunu görüntülemeli

        WebElement registrationEmailKutusu = Driver.getDriver().findElement(By.xpath("//input[@name='user_email']"));
        Assert.assertTrue(registrationEmailKutusu.isDisplayed());

        //3-)Kullanıcı Mail adresini doğru şekilde girer
        Driver.getDriver().get("https://www.fakemail.net/");
        Thread.sleep(3000);
        String emailcopyelde=Driver.getDriver().findElement(By.xpath("//span[@id='email']")).getText();
        System.out.println("giriş yaptığımız email : "+emailcopyelde);

        WebElement copyfakemail = Driver.getDriver().findElement(By.xpath("//div[@style='text-align:center;padding:9px;font-size:20px;color:white;background:#ff99cc;']"));
        copyfakemail.click();


        Thread.sleep(3000);
        Driver.getDriver().navigate().back();//register sayfasına geri geldik
        // Driver.getDriver().get("https://spendinggood.com/vendor-register/");
        Thread.sleep(3000);
        registrationEmailKutusu.click();
        Thread.sleep(3000);
        registrationEmailKutusu.sendKeys(Keys.CONTROL+"v");//yapıştır

        Thread.sleep(3000);
        Driver.getDriver().navigate().forward();
        Thread.sleep(10000);
        Driver.getDriver().findElement(By.xpath("//tr[@class='hidden-xs hidden-sm klikaciRadek newMail']")).click();
        Thread.sleep(3000);
        WebElement fakecode = Driver.getDriver().findElement(By.id("predmet"));
        Thread.sleep(3000);
        System.out.println(fakecode.getText());
        String fakecodetext = fakecode.getText();
        String code =fakecodetext.split(" ")[6];
        System.out.println("giriş yaptığımız code : "+code);
        Driver.getDriver().navigate().back();
        Driver.getDriver().findElement(By.xpath("//input[@name='wcfm_email_verified_input']")).sendKeys(code);


        vendorRegistration.password.sendKeys("asdf1234");
        vendorRegistration.Confirm_Password.sendKeys("asdf1234");
        Thread.sleep(3000);
        ReusableMethods.clickByJS(vendorRegistration.Register_Button);
        Thread.sleep(5000);
        Driver.getDriver().navigate().back();
        assert vendorRegistration.Completed_Yazısı.isDisplayed();
        Thread.sleep(5000);
        Driver.getDriver().navigate().refresh();


        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
        WebElement signout= Driver.getDriver().findElement(By.xpath("(//i[@class='w-icon-account'])[1]"));
        ReusableMethods.clickByJS(signout);
        Thread.sleep(3000);
        WebElement logout= Driver.getDriver().findElement(By.xpath("//span[@class='icon-box-icon icon-logout']"));
        ReusableMethods.clickByJS(logout);
        Thread.sleep(3000);
        Driver.getDriver().get("https://spendinggood.com/vendor-register/");
        Thread.sleep(5000);
        WebElement asd = Driver.getDriver().findElement(By.xpath("//input[@name='user_email']"));
        Thread.sleep(3000);
        asd.sendKeys(Keys.CONTROL+"v");//yapıştır
        Driver.getDriver().findElement(By.xpath("//input[@name='wcfm_email_verified_input']")).sendKeys(code);
        vendorRegistration.password.sendKeys("asdf1234");
        vendorRegistration.Confirm_Password.sendKeys("asdf1234");
        Thread.sleep(3000);
        ReusableMethods.clickByJS(vendorRegistration.Register_Button);
        WebElement existsyazısı=Driver.getDriver().findElement(By.xpath("//div[@class='wcfm-message wcfm-error']"));
        assert existsyazısı.isDisplayed();


    }
}
