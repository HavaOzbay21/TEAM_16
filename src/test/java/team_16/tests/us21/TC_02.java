package team_16.tests.us21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.SignIn;
import team_16.pages.Urunler;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_02 {

    //Aradığı ürünü sepete ekleyebilmeli (ADD TO CART)

    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        HomePage homePage=new HomePage();
        SignIn signIn=new SignIn();
        Urunler urunler=new Urunler();

        ReusableMethods.waitFor(2);
        homePage.signIn.click();

        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("username"));
        signIn.password.sendKeys(ConfigReader.getProperty("password"));
        signIn.sigInTus.click();
        ReusableMethods.waitFor(2);

        homePage.searchButonu.sendKeys(ConfigReader.getProperty("urun"), Keys.ENTER);
        ReusableMethods.waitFor(3);
        //Kullanici aradigi urunu tiklar
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).build().perform();
        ReusableMethods.waitFor(3);
        urunler.apple1.click();
        ReusableMethods.waitFor(2);

        //ADD TO CART butonunu tiklar
        urunler.addToCard.click();

        //Kullanici cart butonu alaninda ekledigi urun sayisini gorur
        Assert.assertTrue(homePage.cartCount.isDisplayed());
        Driver.closeDriver();

    }
}