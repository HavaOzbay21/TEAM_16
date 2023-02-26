package team_16.tests.us10_11_12;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;
import java.io.IOException;

public class US_12_TC_01 {
    @Test
    public void TC_01() throws IOException {

        HomePage homePage = new HomePage();
        SignIn signIn= new SignIn();
        MyAccount myAccount= new MyAccount();
        Adresses adresses= new Adresses();

        BillingAddress billingAddress= new BillingAddress();
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        ReusableMethods.waitFor(10);
        ReusableMethods.waitForPageToLoad(50);

        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("sehri_email"));
        signIn.password.sendKeys(ConfigReader.getProperty("sehri_password"));
        signIn.signInButton.click();

        ReusableMethods.waitFor(5);
        homePage.myAccountSecenegi.click();
        ReusableMethods.waitFor(3);

        myAccount.adresses2.click();
        ReusableMethods.waitForPageToLoad(50);
        ReusableMethods.waitFor(5);


        try {
            adresses.addBillingAddress.click();

        }catch (Exception e) {
            adresses.editBillingAddress.click();
        }
        ReusableMethods.waitFor(3);

        Assert.assertEquals(billingAddress.emailAddress.getAttribute("value"), ConfigReader.getProperty("sehri_email"));

        ReusableMethods.scrollIntoViewJS(billingAddress.emailAddress);
        ReusableMethods.getScreenshot("EkranGoruntusu");
        Driver.closeDriver();

    }

}
