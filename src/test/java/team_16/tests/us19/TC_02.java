package team_16.tests.us19;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.SignIn;
import team_16.pages.Urunler;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_02 {


    @Test
    public void tc02() throws InterruptedException {

        HomePage homePage = new HomePage();
        Urunler urunler = new Urunler();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        //SignIn clasindaki locate leri kullanabilmek icin obje olusturduj
        SignIn signIn = new SignIn();

        // MyAccount clasindaki locateleri kullanabilmek icin obje olusturduk
        MyAccount myAccount = new MyAccount();

        // sayfaya giris yapmak icn signIn butonuna tikladik
        Thread.sleep(2000);
       homePage.signIn.click();

        // acilan sayfada username alanina giris yapabilmek icin imleci username alanina tasidik
        Thread.sleep(2000);
        signIn.Username_or_email_address.click();

        //username alanina mail adresini ve password bolumune sifre gonderdik
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("email"), Keys.TAB, ConfigReader.getProperty("sifre"), Keys.ENTER);
        Thread.sleep(2000);
        homePage.myAccountSecenegi.click();


        // reusable method kullanarak orders butona tikladik
        ReusableMethods.clickByJS(myAccount.ordersButton);

        Thread.sleep(2000);

        // search butonuna tiklayip ilk urunu (900) arattik
        homePage.searchButonu.click();
        homePage.searchButonu.sendKeys(ConfigReader.getProperty("ilkUrun"), Keys.ENTER);

        // arama sonucunda karsimiza cikan urunu (900) tikladik
        ReusableMethods.clickByJS(urunler.urun900);

        // urunu sepetimize ekledik
        ReusableMethods.clickByJS(urunler.addToCard);

        // search butonuna ikinci urunu (kitap) yazip arama yaptik
        homePage.searchButonu.sendKeys(ConfigReader.getProperty("ikinciUrun"), Keys.ENTER);

        // aradigimiz urunu sepete ekledik
        ReusableMethods.clickByJS(urunler.addToCard);

        // urunlerin eklendigini yani urun sayisinin 0 olmadigini dogruladik
        Assert.assertNotEquals(homePage.cartKontrol, "0");


    }

}
