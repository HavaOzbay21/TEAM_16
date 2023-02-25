package team_16.tests.us17_us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.hacer.SpendinggoodAddProductPage;
import team_16.pages.hacer.SpendinggoodStoreManagerPage;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_02 {

    @Test
    public void TC001() {
        SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage=new SpendinggoodStoreManagerPage();
        SpendinggoodAddProductPage SpendinggoodAddProductPage=new SpendinggoodAddProductPage();

        //variable product secilebilmeli
        ReusableMethods.LoginVendor();
        ReusableMethods. waitFor(3);
        ReusableMethods.goToProduct();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select simpleDropdown=new Select(SpendinggoodStoreManagerPage.simpleProduct);

        simpleDropdown.selectByVisibleText("Variable Product");
        ReusableMethods.waitFor(3);
        Assert.assertTrue(SpendinggoodAddProductPage.ProductTitle.isDisplayed());
        Driver.closeDriver();
    }
}
