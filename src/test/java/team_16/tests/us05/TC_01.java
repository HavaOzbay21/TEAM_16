package team_16.tests.us05;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.SignIn;
import team_16.pages.ozlem.AccountDetallesPage;
import team_16.pages.ozlem.ComparePage;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_01 {


    @Test
    public void testName() {


        HomePage homePage = new HomePage();
        SignIn signIn = new SignIn();


        AccountDetallesPage details = new AccountDetallesPage();
        Driver.getDriver().get(ConfigReader.getProperty("site_url"));

        ReusableMethods.waitFor(5);
        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("email_ozlem"));
        signIn.password.sendKeys(ConfigReader.getProperty("password_ozlem"));
    ReusableMethods.waitFor(2);
        signIn.signInButton.click();


        ReusableMethods.waitFor(3);
        homePage.myAccountSecenegi.click();

        ReusableMethods.waitFor(3);


        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitFor(3);

        details.AccountDetails.click();

        ReusableMethods.waitFor(3);

        Assert.assertTrue(details.detailsSayfasi.isDisplayed());

        Driver.closeDriver();

    }
}