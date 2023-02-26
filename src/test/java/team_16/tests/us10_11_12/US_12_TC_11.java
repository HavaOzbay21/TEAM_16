package team_16.tests.us10_11_12;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class US_12_TC_11 {

    @Test
    public void TC_11() throws IOException {
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
        ReusableMethods.waitFor(3);

        try {
            adresses.addBillingAddress.click();

        } catch (Exception e) {
            adresses.editBillingAddress.click();
        }
        ReusableMethods.waitFor(3);


        billingAddress.firstName.clear();

        billingAddress.lastName.clear();
        billingAddress.lastName.sendKeys("");

        Select options=new Select(billingAddress.countryRegion);
        options.selectByVisibleText("Select a country / region…");

        billingAddress.streetAddress.clear();

        billingAddress.postcodeZip.clear();

        billingAddress.townCity.clear();


        billingAddress.stateCountry.clear();

        billingAddress.phone.clear();

        billingAddress.saveAddressButton.click();
        ReusableMethods.waitFor(2);

        ReusableMethods.verifyElementDisplayed(billingAddress.alertFirstName);
        ReusableMethods.verifyElementDisplayed(billingAddress.alertLastName);
        ReusableMethods.verifyElementDisplayed(billingAddress.alertCountry);
        ReusableMethods.verifyElementDisplayed(billingAddress.alertAdress);
        ReusableMethods.verifyElementDisplayed(billingAddress.alertCity);
        ReusableMethods.verifyElementDisplayed(billingAddress.alertState);
        ReusableMethods.verifyElementDisplayed(billingAddress.alertPostcode);
        ReusableMethods.verifyElementDisplayed(billingAddress.alertPhone);

        ReusableMethods.scrollIntoViewJS(billingAddress.alertFirstName);
        ReusableMethods.getScreenshot("EkranGoruntusu");

        Driver.closeDriver();
    }
}
