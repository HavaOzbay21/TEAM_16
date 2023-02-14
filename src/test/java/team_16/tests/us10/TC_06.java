package team_16.tests.us10;

import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.SignUp;
import team_16.pages.VendorRegistration;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_06 {
    HomePage homePage;
    SignUp signUp;
    VendorRegistration vendorRegistration;
    @Test
    public void TC_01() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        homePage= new HomePage();
        signUp= new SignUp();
        vendorRegistration= new VendorRegistration();

        homePage.registerButton.click();
        signUp.becomeAVendor.click();
        vendorRegistration.password.sendKeys("[]-_=,./");

        String actualResult= vendorRegistration.passwordStrength.getText();
        String expectedResult= "Strong";
        Assert.assertEquals(actualResult,expectedResult);
        ReusableMethods.getScreenshot("EkranGoruntusu");
        ReusableMethods.waitFor(3);

        Driver.closeDriver();
    }
}
