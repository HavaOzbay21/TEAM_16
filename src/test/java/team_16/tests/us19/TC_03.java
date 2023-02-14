package team_16.tests.us19;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_03 {


    @Test
    public void tc03() throws InterruptedException {

        HomePage homePage = new HomePage();
        Urunler urunler = new Urunler();
        ShoppingCard shoppingCard = new ShoppingCard();
        YourOrder yourOrder = new YourOrder();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        SignIn signIn = new SignIn();

        MyAccount myAccount = new MyAccount();

        Thread.sleep(2000);
        homePage.signIn.click();

        Thread.sleep(2000);
        signIn.Username_or_email_address.click();

        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("email"), Keys.TAB, ConfigReader.getProperty("sifre"), Keys.ENTER);
        Thread.sleep(2000);
        homePage.myAccountSecenegi.click();


        ReusableMethods.clickByJS(myAccount.ordersButton);

        Thread.sleep(2000);

        homePage.searchButonu.click();
        homePage.searchButonu.sendKeys(ConfigReader.getProperty("ilkUrun"), Keys.ENTER);

        ReusableMethods.clickByJS(urunler.urun900);

        ReusableMethods.clickByJS(urunler.addToCard);

        homePage.searchButonu.sendKeys(ConfigReader.getProperty("ikinciUrun"), Keys.ENTER);

        ReusableMethods.clickByJS(urunler.addToCard);

        Thread.sleep(2000);
        ReusableMethods.clickByJS(homePage.cart);

        ReusableMethods.clickByJS(shoppingCard.checkoutButton);

        Assert.assertTrue(yourOrder.yourOrderYazisi.isDisplayed());

        Driver.closeDriver();


    }
}
