package team_16.tests.us15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.*;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;


public class TC_02 {

    @Test
    public void testTC_02() throws IOException {
        HomePage homePage = new HomePage();
        SignIn signIn = new SignIn();
        MyAccount myAccount = new MyAccount();
        StoreManagerPage storeManagerPage = new StoreManagerPage();
        InventoryPage inventoryPage = new InventoryPage();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("emailhava"));
        signIn.passwordH.sendKeys(ConfigReader.getProperty("passwordhava")+ Keys.ENTER);
        ReusableMethods.waitFor(2);
        homePage.myAccountSecenegi.click();
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        ReusableMethods.verifyElementDisplayed(myAccount.myAccountSayfasi);
        ReusableMethods.clickByJS(myAccount.StoreManagerSecenegi);
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        ReusableMethods.verifyElementDisplayed(storeManagerPage.StoreManagerSayfaGorunumu);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.ProductSecenegi);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(myAccount.AddNewSecenegi);
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        inventoryPage.SKUkutucugu.sendKeys(ConfigReader.getProperty("SKU"));
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(inventoryPage.ManagerStockKutusu);
        ReusableMethods.waitFor(2);
        inventoryPage.StockQtyKutusu.sendKeys(ConfigReader.getProperty("StockQty"));
        ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshotH("Ekran goruntusu");
        ReusableMethods.verifyElementDisplayed(inventoryPage.AllowBackordersDropdown);
        ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(inventoryPage.SoldIndividuallyKutucugu);
        Driver.closeDriver();




    }
}
