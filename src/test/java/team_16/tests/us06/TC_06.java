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

public class TC_06 {

    //Ödme seçeneklerini görebilmeli ve seçebilmeli
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
        urunler.apple.click();
        ReusableMethods.waitFor(1);
        urunler.addToCard.click();

        homePage.cart.click();
        ReusableMethods.waitFor(1);
        shoppingCard.viewCartButton.click();
        ReusableMethods.waitFor(1);
        shoppingCard.checkout.click();

        billingDetails.firstName.sendKeys(ConfigReader.getProperty("first_name"),Keys.TAB,ConfigReader.getProperty("last_name"),
                Keys.TAB,Keys.TAB);
        ReusableMethods.waitFor(1);
        Select options=new Select(billingDetails.countryRegion);
        options.selectByVisibleText("Germany");

        billingDetails.streetAddress.sendKeys(ConfigReader.getProperty("street_adresss"),Keys.TAB,
                Keys.TAB,ConfigReader.getProperty("post_code"),Keys.TAB,ConfigReader.getProperty("cityy"),
                Keys.TAB,Keys.TAB,ConfigReader.getProperty("phonee"));

        //1-Kullanici Payment Methods alanini gorur
        Assert.assertTrue(billingDetails.paymentMethod.isDisplayed());

        //2-Kullanici Wire transfer/EFT secenegini gorur
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Assert.assertTrue(billingDetails.eftButton.isDisplayed());
        ReusableMethods.waitFor(1);

        //3-Kullanici Pay at the door secenegini gorur

        Assert.assertTrue(billingDetails.payDoorButton.isDisplayed());
        ReusableMethods.waitFor(2);


        //4-Kullanici Wire transfer/EFT secenegini secer
        billingDetails.eftButton.click();




    }
}
