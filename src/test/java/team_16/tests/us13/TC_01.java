package team_16.tests.us13;

import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.SignIn;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_01 {

    HomePage homePage = new HomePage();

    SignIn signIn= new SignIn();


    @Test

    public void TC01() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        ReusableMethods.waitFor(10);
        ReusableMethods.waitForPageToLoad(50);

        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("halit_email"));
        signIn.password.sendKeys(ConfigReader.getProperty("halit_sifre"));
        signIn.signInButton.click();

        ReusableMethods.waitFor(5);
        homePage.myAccountSecenegi.click();
        ReusableMethods.waitFor(3);



    }





}
