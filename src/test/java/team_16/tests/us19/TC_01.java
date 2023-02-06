package team_16.tests.us19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.SignIn;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.sql.DriverManager;

public class TC_01 {


    @Test
    public void tc01() throws InterruptedException {
        HomePage homePage = new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        SignIn signIn = new SignIn();

        MyAccount myAccount = new MyAccount();

        homePage.signIn.click();

        signIn.Username_or_email_address.click();

        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("email"), Keys.TAB, ConfigReader.getProperty("sifre"), Keys.ENTER);
        Thread.sleep(2000);
       homePage.myAccountSecenegi.click();

        Assert.assertTrue(myAccount.myAccountSayfasi.isDisplayed());


    }






}