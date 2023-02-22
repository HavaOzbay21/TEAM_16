package team_16.tests.us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.hacer.SpendinggoodAddProductPage;
import team_16.pages.hacer.SpendinggoodStoreManagerPage;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_01 {
    SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage=new SpendinggoodStoreManagerPage();
    SpendinggoodAddProductPage SpendinggoodAddProductPage=new SpendinggoodAddProductPage();
    @Test
    public void TC01() {
        ReusableMethods.LoginVendor();
        ReusableMethods. waitFor(5);
        ReusableMethods.goToProduct();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SpendinggoodStoreManagerPage.simpleProduct.click();
        Select simpleDropdown=new Select(SpendinggoodStoreManagerPage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(SpendinggoodAddProductPage.url.isDisplayed());
        Driver.closeDriver();
    }

}
