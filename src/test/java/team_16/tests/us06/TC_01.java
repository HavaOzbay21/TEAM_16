package team_16.tests.us06;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.SignIn;
import team_16.pages.Urunler;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_01 {


    //Kullanıcı search box tan istediği bir ürünü arayabilmeli

    @Test
    public void test1() {


        //1-Kullanici https://spendinggood.com/ url'sine gider
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        HomePage homePage=new HomePage();
        SignIn signIn=new SignIn();
        Urunler urunler=new Urunler();

        //2-Kullanici Sign In butonu tiklar
        homePage.signIn.click();

        //3-Kullanici username alanina username bilgisini girer
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("username"));

        //4-Kullanici password alanina sifresini girer
        signIn.password.sendKeys(ConfigReader.getProperty("password"));

        //5-Kullanici SIGN IN butonunu tiklar
        signIn.sigInTus.click();
        ReusableMethods.waitFor(2);

        //6-Sayfaya giris yaptigini gorur
        Assert.assertTrue(homePage.signOutButton.isDisplayed());

        //7-Search alanindan istegidi urunu aratir
        homePage.searchButonu.sendKeys(ConfigReader.getProperty("urun"), Keys.ENTER);
        ReusableMethods.waitFor(3);

        //8-aradigi urunu gorur
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).build().perform();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(urunler.apple1.isDisplayed());
        Driver.closeDriver();



    }
}