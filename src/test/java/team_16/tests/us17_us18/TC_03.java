package team_16.tests.us17_us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.hacer.SpendinggoodAddProductPage;
import team_16.pages.hacer.SpendinggoodMyAccountPage;
import team_16.pages.hacer.SpendinggoodStoreManagerPage;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_03 {
    SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage=new SpendinggoodStoreManagerPage();
    SpendinggoodAddProductPage SpendinggoodAddProductPage=new SpendinggoodAddProductPage();
    SpendinggoodMyAccountPage SpendinggoodMyAccountPage=new SpendinggoodMyAccountPage();
    @Test
    public void TC02() throws IOException {
        ReusableMethods.LoginVendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SpendinggoodStoreManagerPage.simpleProduct.click();
        Select simpleDropdown = new Select(SpendinggoodStoreManagerPage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        SpendinggoodAddProductPage.url.sendKeys("gittigitti.com/", Keys.ENTER);
        Assert.assertTrue(SpendinggoodAddProductPage.url.isEnabled());
        ReusableMethods.getScreenshot("ekran goruntusu1");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SpendinggoodAddProductPage.price.sendKeys("150",Keys.ENTER);
        ReusableMethods.getScreenshot("ekran goruntusu2");

        actions.moveToElement(SpendinggoodAddProductPage.buttonText).perform();
        SpendinggoodAddProductPage.buttonText.sendKeys("nice",Keys.ENTER);
        ReusableMethods.getScreenshot("ekran goruntusu3");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SpendinggoodAddProductPage.salePrice.sendKeys("200",Keys.ENTER);
        ReusableMethods.getScreenshot("ekran goruntusu4");

        Driver.closeDriver();



    }
}
