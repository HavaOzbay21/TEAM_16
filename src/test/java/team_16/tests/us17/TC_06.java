package team_16.tests.us17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team_16.pages.hacer.SpendinggoodAddProductPage;
import team_16.pages.hacer.SpendinggoodHomePage;
import team_16.pages.hacer.SpendinggoodMyAccountPage;
import team_16.pages.hacer.SpendinggoodStoreManagerPage;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_06 {

    SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage = new SpendinggoodStoreManagerPage();
    SpendinggoodAddProductPage SpendinggoodAddProductPage = new SpendinggoodAddProductPage();
    SpendinggoodMyAccountPage SpendinggoodMyAccountPage=new SpendinggoodMyAccountPage();
    SpendinggoodHomePage SpendinggoodHomePage=new SpendinggoodHomePage();
    @Test
    public void TC06() {

        //urunun eklendigini product kisminda gorebilmeli

        ReusableMethods.LoginVendor();
        ReusableMethods.waitFor(3);
        SpendinggoodHomePage.myAccount.click();
        ReusableMethods.waitFor(3);
        SpendinggoodMyAccountPage.storeManager.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        SpendinggoodStoreManagerPage.product.click();
        Actions actions1 = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Driver.closeDriver();





    }
}