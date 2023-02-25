package team_16.tests.us10_11_12;

import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.SignUp;
import team_16.pages.VendorRegistration;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class US_10_TC_04 {

    @Test
    public void TC_01() throws IOException {
        HomePage homePage;
        SignUp signUp;
        VendorRegistration vendorRegistration;
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        homePage= new HomePage();
        signUp= new SignUp();
        vendorRegistration= new VendorRegistration();

        homePage.registerButton.click();
        signUp.becomeAVendor.click();
        vendorRegistration.password.sendKeys("Sehri1.");
        String actualResult= vendorRegistration.passwordStrength.getText();
        String expectedResult= "Strong";
        Assert.assertEquals(actualResult,expectedResult);
        ReusableMethods.getScreenshot("EkranGoruntusu");
        ReusableMethods.waitFor(3);

        Driver.closeDriver();
    }
}
