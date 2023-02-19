package team_16.tests.us19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_07 {





    @Test
    public void tc04() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        SignIn signIn = new SignIn();
        HomePage homePage = new HomePage();
        Urunler urunler = new Urunler();
        ShoppingCard shoppingCard = new ShoppingCard();
        BillingDetails billingDetails = new BillingDetails();
        OrdersPage ordersPage = new OrdersPage();
        YourOrder yourOrder = new YourOrder();

        MyAccount myAccount = new MyAccount();
        Thread.sleep(2000);
        homePage.signIn.click();

        signIn.Username_or_email_address.click();

        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("email"), Keys.TAB, ConfigReader.getProperty("sifre"), Keys.ENTER);
        Thread.sleep(2000);
        homePage.myAccountSecenegi.click();


        ReusableMethods.clickByJS(myAccount.ordersButton);

        Thread.sleep(2000);

        homePage.searchButonu.click();
        Thread.sleep(2000);
        homePage.searchButonu.sendKeys(ConfigReader.getProperty("ilkUrun"), Keys.ENTER);

        ReusableMethods.clickByJS(urunler.urun900);

        ReusableMethods.clickByJS(urunler.addToCard);

        homePage.searchButonu.sendKeys(ConfigReader.getProperty("ikinciUrun"), Keys.ENTER);

        ReusableMethods.clickByJS(urunler.addToCard);

        Thread.sleep(2000);
        ReusableMethods.clickByJS(homePage.cart);

        ReusableMethods.clickByJS(shoppingCard.checkoutButton);

        ReusableMethods.clickByJS(billingDetails.firstName);
        billingDetails.firstName.clear();
        billingDetails.firstName.sendKeys(ConfigReader.getProperty("firstname"), Keys.TAB,
                ConfigReader.getProperty("surname"), Keys.TAB, ConfigReader.getProperty("companyname"));


        Select options = new Select(billingDetails.countryRegion);
        options.selectByValue("GB");
        // new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).build().perform();

        billingDetails.streetAddress.clear();
        billingDetails.streetAddress.sendKeys(ConfigReader.getProperty("street"), Keys.TAB, ConfigReader.getProperty("unit"),
                Keys.TAB, ConfigReader.getProperty("postcode"), Keys.TAB, ConfigReader.getProperty("city"),
                Keys.TAB, Keys.TAB, ConfigReader.getProperty("phone"), Keys.TAB, ConfigReader.getProperty("email"));

        Assert.assertTrue(billingDetails.totalGorunurluk.isDisplayed());

        ReusableMethods.clickByJS(billingDetails.wiseEFTTransfer);


        ReusableMethods.clickByJS(billingDetails.payDoor);

        ReusableMethods.clickByJS(billingDetails.placeOrder);

        Assert.assertTrue(ordersPage.orderComplete.isDisplayed());

        myAccount.myaccountButonu.click();

        Thread.sleep(2000);

        ReusableMethods.clickByJS(myAccount.ordersButtonu1);

      ReusableMethods.clickByJS(yourOrder.wievButonu);

      Assert.assertTrue(yourOrder.orderDetailsButonu.isDisplayed());

      










    }

}
