package team_16.tests.us08_us09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class US08 {
    SignIn signIn = new SignIn();
    HomePage homePage = new HomePage();
    Urunler urunler = new Urunler();
    ShoppingCard shoppingCard = new ShoppingCard();
    BillingDetails billingDetails = new BillingDetails();
    MyAccount myAccount = new MyAccount();

    @Test(priority = 1)
    public void test01() throws InterruptedException {

        //*****US08*****
        //*****TC01*****
        //1-)Kullanici https://spendinggood.com/ url'sine gider
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        //2-)Kullanici Sign In butonu tiklar
        homePage.signIn.click();
        //3-)Kullanici username alanina username bilgisini girer
        //4-)Kullanici password alanina sifresini girer
        //5-)Kullanici SIGN IN butonunu tiklar
        signIn.Username_or_email_address.sendKeys("hamit", Keys.TAB, "techpro", Keys.ENTER);
        //6-)Sayfaya giris yaptigini gorur
        assert homePage.signOut.isDisplayed();
        //7-)Search alanindan istegidi urunu aratir
        homePage.searchButonu.sendKeys("apple", Keys.ENTER);
        //8-)aradigi urunu gorur
        //9-)Kullanıcı aradığı ürüne tıklayarak ürün sayfasına ulaşır
        // arama sonucunda karsimiza cikan urunu (apple) tikladik
        ReusableMethods.clickByJS(urunler.apple);
        //10)- Ürün sayfasında ürünün Wisch List'e eklenmesini sağlayan butonu görür ve tıklar.
        ReusableMethods.clickByJS(urunler.add_to_wishlist);
    }

    @Test(priority = 2)
    public void test02() throws InterruptedException {
        //*****US08*****
        //*****TC02*****
        //   1- Kullanıcı ekranın sağ üst köşesinde yer alan Wishlist butonunu görür ve tıklar
        //   2-Wishlist sayfası görüntülenir
        Assert.assertTrue(homePage.Wishlist.isDisplayed());
        ReusableMethods.clickByJS(homePage.Wishlist);
        //   3-Kullanıcı wishlist sayfasındaWishliste eklediği ürünleri görür
        Assert.assertTrue(urunler.wishlistsayfası.isDisplayed());
    }

    @Test(priority = 3)
    public void test03() throws InterruptedException {
        //*****US08*****
        //*****TC03*****
        //1- Kullanıcı Wishlist sayfasında eklediği ürünlerin listesini görür
        Assert.assertTrue(urunler.wishlistsayfası.isDisplayed());
        //2-Wishlistteki ürünlerin her birine ait QUICK VIEW butonunu görür ve tıklar
        Assert.assertTrue(urunler.quickview.isDisplayed());
        urunler.quickview.click();
        //3-Kullanıcı QUICK VIEW butonuna tıklar ve ürüne ait özellikleri görüntüler
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage.test3);
    }

    @Test(priority = 4)
    public void test04() throws InterruptedException {
        //*****US08*****
        //*****TC04*****
        // 1- Kullanıcı Wishlist sayfasında eklediği ürünlerin listesini görür
        Assert.assertTrue(urunler.wishlistsayfası.isDisplayed());
        // 2-Wishlistteki ürünlerin her birine ait "Add to Cart" butonunu görür ve tıklar
        //Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-dark btn-rounded btn-sm add_to_cart alt']")).click();
        ReusableMethods.clickByJS(homePage.addToCart);
        // 3-Kullanıcı sırasıyla sayfanın sağ üst köşesinde yer alan "Cart" butonuna ve ardından
        // görüntülenen "View Cart" butonuna tıklar.
        homePage.cart.click();
        ReusableMethods.waitFor(3);
        shoppingCard.viewcart.click();
        // 4- Kullanıcı Cart butonuna tıklayarak alışveriş sepetini görüntüler.
        // 5- Kullanıcı alışveriş sepetinde daha önce alışveriş sepetine eklemiş olduğu ürünlerin listesini görür.
        // 6-Kullanıcı alışveriş sepeti sayfasında "Proceed to Check Out" butonuna tıklar.
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(shoppingCard.proceed_to_checkout);
        // 7-Kullanıcı Billing Details sayfasını görüntüler ve istenen bilgileri eksiksiz şekilde girer.
        ReusableMethods.clickByJS(billingDetails.firstName);
        billingDetails.firstName.clear();
        billingDetails.firstName.sendKeys("hamit", Keys.TAB,
                ("sever"), Keys.TAB, "anka aş", Keys.TAB);
        Select options = new Select(billingDetails.countryRegion);
        options.selectByValue("GB");
        billingDetails.streetAddress.clear();
        billingDetails.streetAddress.sendKeys(ConfigReader.getProperty("street"), Keys.TAB, ConfigReader.getProperty("unit"),
                Keys.TAB, "london", Keys.TAB, ("city"),
                Keys.TAB, "CT1 2FY", Keys.TAB, ConfigReader.getProperty("phone"), Keys.TAB, ConfigReader.getProperty("email"));

        // 8-Kullanıcı sayfanın sağ tarafında yer alan sipariş bilgilerini görür ve "Place Order" butonuna tıklar.
        // 9-Kullanıcı Order Complete sayfasını ve sayfada yer alan
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage.buttonalt);
        //Driver.getDriver().findElement(By.xpath("//button[@class='button alt']")).click();
        // "Thank you. Your order has been received" yazısını görüntüler.
        ReusableMethods.waitFor(10);
        // 10- Kullanıcı Order Complete sayfasında siparişine ilişkin sipariş numarasını görüntüler.
        ReusableMethods.waitFor(3);
        assert homePage.us8ass1.isDisplayed();
        assert homePage.us8ass2.isDisplayed();
        Driver.closeDriver();

    }
}

