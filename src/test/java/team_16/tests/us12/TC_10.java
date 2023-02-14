package team_16.tests.us12;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_10 {
    HomePage homePage = new HomePage();
    SignIn signIn= new SignIn();
    MyAccount myAccount= new MyAccount();

    Adresses adresses= new Adresses();

    BillingAddress billingAddress= new BillingAddress();


    @Test
    public void TC_09() throws IOException {

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
        ReusableMethods.waitFor(3);

        try {
            adresses.addBillingAddress.click();

        } catch (Exception e) {
            adresses.editBillingAddress.click();
        }
        ReusableMethods.waitFor(3);


        billingAddress.firstName.clear();
        billingAddress.firstName.sendKeys(ConfigReader.getProperty("sehri_firstname"));
        billingAddress.lastName.clear();
        billingAddress.lastName.sendKeys(ConfigReader.getProperty("sehri_lastname"));

        Select options=new Select(billingAddress.countryRegion);
        options.selectByVisibleText(ConfigReader.getProperty("sehri_country"));

        billingAddress.streetAddress.clear();
        billingAddress.streetAddress.sendKeys(ConfigReader.getProperty("sehri_street"));
        billingAddress.postcodeZip.clear();
        billingAddress.postcodeZip.sendKeys(ConfigReader.getProperty("sehri_postcode"));
        billingAddress.townCity.clear();
        billingAddress.townCity.sendKeys(ConfigReader.getProperty("sehri_town"));

        billingAddress.stateCountry.clear();
        billingAddress.stateCountry.sendKeys(ConfigReader.getProperty("sehri_state"));
        billingAddress.phone.clear();

        billingAddress.saveAddressButton.click();
        ReusableMethods.waitFor(2);

        ReusableMethods.verifyElementDisplayed(billingAddress.alertPhone);

        ReusableMethods.scrollIntoViewJS(billingAddress.alertPhone);
        ReusableMethods.getScreenshot("EkranGoruntusu");

        Driver.closeDriver();
    }
}
