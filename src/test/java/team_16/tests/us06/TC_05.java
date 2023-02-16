package team_16.tests.us06;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;




public class TC_05 {

    //Ürünleri satınalabilmek için fartura adresini görebilmeli
    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        HomePage homePage=new HomePage();
        SignIn signIn=new SignIn();
        Urunler urunler=new Urunler();
        ShoppingCard shoppingCard=new ShoppingCard();
        BillingDetails billingDetails=new BillingDetails();


        homePage.signIn.click();

        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("username"));
        signIn.password.sendKeys(ConfigReader.getProperty("password"));
        signIn.sigInTus.click();
        ReusableMethods.waitFor(2);
        homePage.searchButonu.sendKeys(ConfigReader.getProperty("urun"), Keys.ENTER);
        urunler.apple1.click();
        ReusableMethods.waitFor(1);
        urunler.addToCard.click();

        homePage.cart.click();
        ReusableMethods.waitFor(1);
        shoppingCard.viewCartButton.click();
        ReusableMethods.waitFor(1);

        //1-Kullanici PROCEED CHECKOUT butonunu tiklar
        shoppingCard.checkout.click();

        //2-Kullanici BILLING DETAILS sayfasinda oldugunu gorur
        Assert.assertTrue(billingDetails.billingDetailsYazi.isDisplayed());

        //3-Kullanici First name alanina valid bir deger girer
        billingDetails.firstName.sendKeys(ConfigReader.getProperty("first_name"),Keys.TAB,ConfigReader.getProperty("last_name"),
                Keys.TAB,Keys.TAB);


        ReusableMethods.waitFor(1);
        Select options=new Select(billingDetails.countryRegion);
        options.selectByVisibleText("Germany");

        billingDetails.streetAddress.sendKeys(ConfigReader.getProperty("street_adresss"),Keys.TAB,
                Keys.TAB,ConfigReader.getProperty("post_code"),Keys.TAB,ConfigReader.getProperty("cityy"),
                Keys.TAB,Keys.TAB,ConfigReader.getProperty("phonee"));




    }
}

