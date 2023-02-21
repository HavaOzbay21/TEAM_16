package team_16.tests.us07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.SignIn;
import team_16.pages.ozlem.AccountDetallesPage;
import team_16.pages.ozlem.ComparePage;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.util.List;

public class TC_02 {
    HomePage homePage = new HomePage();
    SignIn signIn = new SignIn();
    MyAccount myAccount = new MyAccount();
    AccountDetallesPage details = new AccountDetallesPage();
    ComparePage compare = new ComparePage();
    static List<WebElement> urunler;

    @Test
    public void TC01() {
        Driver.getDriver().get(ConfigReader.getProperty("site_url"));


        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("email_ozlem"));
        signIn.password.sendKeys(ConfigReader.getProperty("password_ozlem"));
        signIn.signInButton.click();

        ComparePage compare1 = new ComparePage();
        ReusableMethods.waitFor(3);
        homePage.myAccountSecenegi.click();

        ReusableMethods.clickByJS(compare.compareButonu);


        ReusableMethods.clickByJS(compare.GoShopButonu);

        compare.searchButonuOzlem.sendKeys("bag", Keys.ENTER);
        ReusableMethods.waitFor(3);
        urunler = Driver.getDriver().findElements(By.xpath("//a[@class='compare btn-product-icon']"));
        for (int i = 0; i <= 3; i++) {
            urunler = Driver.getDriver().findElements(By.xpath("//a[@class='compare btn-product-icon']"));
            ReusableMethods.clickByJS(urunler.get(i));

            ReusableMethods.waitFor(5);
        }
        ReusableMethods.waitFor(5);

        ReusableMethods.clickByJS(compare.startcompare);
        ReusableMethods.waitFor(5);
        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        ReusableMethods.clickByJS(compare.silmeiconu);
        ReusableMethods.waitFor(5);

        WebElement silineneleman1 = compare.urunsilinebilmesi;
        ReusableMethods.verifyElementNotDisplayed(silineneleman1);
        compare.searchButonuOzlem.sendKeys("bag", Keys.ENTER);
        ReusableMethods.waitFor(5);
        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(compare.CompareIconu5);
        ReusableMethods.waitFor(10);

        WebElement ekleneneleman = compare.uruneklemecompareurunu;
        ReusableMethods.verifyElementDisplayed(ekleneneleman);
        ReusableMethods.waitFor(10);


    }
}