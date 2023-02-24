package team_16.tests.us06;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.ShoppingCard;
import team_16.pages.SignIn;
import team_16.pages.Urunler;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;



public class TC_04 {

    //Sepete eklediği ürünlerin miktarını artırabilmeli ve azaltabilmeli
    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        HomePage homePage=new HomePage();
        SignIn signIn=new SignIn();
        Urunler urunler=new Urunler();
        ShoppingCard shoppingCard=new ShoppingCard();

        ReusableMethods.waitFor(2);
        homePage.signIn.click();

        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("username"));
        signIn.password.sendKeys(ConfigReader.getProperty("password"));
        signIn.sigInTus.click();
        ReusableMethods.waitFor(2);
        homePage.searchButonu.sendKeys(ConfigReader.getProperty("urun"), Keys.ENTER);
        ReusableMethods.waitFor(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).build().perform();
        ReusableMethods.waitFor(3);
        urunler.apple1.click();
        ReusableMethods.waitFor(2);
        urunler.addToCard.click();

        homePage.cart.click();
        ReusableMethods.waitFor(2);
        shoppingCard.viewCartButton.click();

        //1-Kullanici sepetindeki urunun Quantity alanindaki atirma azaltma butonunu gorur
        Assert.assertTrue(shoppingCard.quantityAlan.isDisplayed());

        //2-Kullanici "+" sembolunu tiklar
        shoppingCard.plusButton.click();
        ReusableMethods.waitFor(3);

        //3-Kullanici UPDATE butonunu tiklar
        shoppingCard.updateCartButton.click();
        ReusableMethods.waitFor(4);

        //4-Ekledigi urunun miktarinin arttigini gorur
        Assert.assertTrue(shoppingCard.quantityAlan.isDisplayed());
        ReusableMethods.waitFor(3);

        //5-Kullanici "-" sembolunu tiklar
        shoppingCard.minusButton.click();
        ReusableMethods.waitFor(3);

        //6-Kullanici UPDATE butonunu tiklar
        shoppingCard.updateCartButton.click();
        ReusableMethods.waitFor(4);

        //7-Ekledigi urunun miktarinin azaldigini gorur
        Assert.assertTrue(shoppingCard.quantityAlan.isDisplayed());
        Driver.closeDriver();










    }
}
