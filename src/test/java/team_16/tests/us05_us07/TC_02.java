package team_16.tests.us05_us07;



import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.SignIn;
import team_16.pages.ozlem.AccountDetallesPage;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_02 {


    @Test
    public void testName() throws IOException {



    HomePage homePage = new HomePage();
        SignIn signIn= new SignIn();
        MyAccount myAccount= new MyAccount();
        AccountDetallesPage details= new AccountDetallesPage();


        Driver.getDriver().get(ConfigReader.getProperty("site_url"));

        ReusableMethods.waitFor(5);
        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("email_ozlem"));
        signIn.password.sendKeys(ConfigReader.getProperty("password_ozlem"));
        signIn.signInButton.click();


        ReusableMethods.waitFor(3);
        homePage.myAccountSecenegi.click();

        ReusableMethods.waitFor(3);

        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitFor(3);

        details.AccountDetails.click();

        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();
        details.firstnameozlem.clear();
        details.firstnameozlem.sendKeys("Saniye", Keys.TAB, "Sezici", Keys.TAB, "Saniye", Keys.TAB, "lzmra2021@gmail.com");

        ReusableMethods.waitFor(5);


        ReusableMethods.clickByJS(details.Savechanges);

        ReusableMethods.waitFor(2);

        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();
        //new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();
        // Assert.assertTrue(details.mensajesdechanges.isDisplayed());

        Assert.assertEquals(details.mensajesdechanges.getText(), "Account details changed successfully.");

        ReusableMethods.scrollIntoViewJS(details.mensajesdechanges);
        ReusableMethods.getScreenshot("EkranGoruntusu");
        Driver.closeDriver();

    }




}
