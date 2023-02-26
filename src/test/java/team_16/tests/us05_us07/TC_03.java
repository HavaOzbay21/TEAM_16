package team_16.tests.us05_us07;

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

public class TC_03 {





    @Test
    public void TCO1() throws IOException {


        HomePage homePage = new HomePage();
        SignIn signIn = new SignIn();
        MyAccount myAccount = new MyAccount();
        AccountDetallesPage details = new AccountDetallesPage();
        ComparePage compare1 =new ComparePage();
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
        ReusableMethods.waitFor(3);

       Driver.getDriver().switchTo().frame(0);
        ReusableMethods.waitFor(3);
        details.biography.clear();
        details.biography.sendKeys("Merhaba ben Ozlem....");
        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().defaultContent();
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(details.Savechanges);
        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();
        Driver.getDriver().switchTo().frame(0);

        ReusableMethods.waitFor(5);
Assert.assertEquals(details.biography.getText(),"Merhaba ben Ozlem....");
        ReusableMethods.waitFor(5);
 Driver.closeDriver();

    }


}




