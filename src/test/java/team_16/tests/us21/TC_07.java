package team_16.tests.us21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_07 {
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
        ReusableMethods.waitFor(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).build().perform();
        ReusableMethods.waitFor(3);
        urunler.addToCard.click();

        homePage.cart.click();
        ReusableMethods.waitFor(2);
        shoppingCard.viewCartButton.click();
        ReusableMethods.waitFor(2);


        shoppingCard.checkout.click();


        billingDetails.firstName.sendKeys(ConfigReader.getProperty("first_name"),Keys.TAB,ConfigReader.getProperty("last_name"),
                Keys.TAB,Keys.TAB);


        ReusableMethods.waitFor(3);
        Select options=new Select(billingDetails.countryRegion);
        options.selectByVisibleText("Germany");

        billingDetails.streetAddress.sendKeys(ConfigReader.getProperty("street_adresss"),Keys.TAB,
                Keys.TAB,ConfigReader.getProperty("post_code"),Keys.TAB,ConfigReader.getProperty("cityy"),
                Keys.TAB,Keys.TAB,ConfigReader.getProperty("phonee"));
        ReusableMethods.waitFor(2);

        //1.Kullanici "ENTER YOUR CODE" butonunu tiklar
        billingDetails.enterYourCode.click();
        ReusableMethods.waitFor(3);

        //2-Kupon Codu girer
        //3-"APPLY  COUPON"butonunu tiklar
        billingDetails.couponCode.sendKeys(ConfigReader.getProperty("cupon_cod"), Keys.ENTER);
        ReusableMethods.waitFor(4);

        //4-Kullanici "Coupon code applied successfully." popup mesajini gorur
        Assert.assertEquals(billingDetails.codeSonucYazi.getText(),"Coupon code applied successfully.");
        Driver.closeDriver();


    }
}
