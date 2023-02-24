package team_16.tests.us17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.hacer.SpendinggoodAddProductPage;
import team_16.pages.hacer.SpendinggoodStoreManagerPage;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_04 {

    SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage = new SpendinggoodStoreManagerPage();
    SpendinggoodAddProductPage SpendinggoodAddProductPage = new SpendinggoodAddProductPage();

    @Test
    public void TC04() {

        //urune gore Attributes color ve size secilebilmeli
        ReusableMethods.LoginVendor();
        ReusableMethods. waitFor(3);
        ReusableMethods.goToProduct();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select simpleDropdown=new Select(SpendinggoodStoreManagerPage.simpleProduct);

        simpleDropdown.selectByVisibleText("Variable Product");
        ReusableMethods.waitFor(3);


//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        SpendinggoodAddProductPage.attributes.click();

        ReusableMethods.clickByJS(SpendinggoodAddProductPage.attributes);
        ReusableMethods.waitFor(2);
//        actions.moveToElement(SpendinggoodAddProductPage.color).perform();
//        SpendinggoodAddProductPage.color.click();


        ReusableMethods.clickByJS(SpendinggoodAddProductPage.color);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.colorButton);
//        actions.moveToElement(SpendinggoodAddProductPage.colorButton).perform();
//        SpendinggoodAddProductPage.colorButton.click();
        SpendinggoodAddProductPage.colorButton.sendKeys("red", Keys.ENTER);
//        actions.moveToElement(SpendinggoodAddProductPage.size).perform();
//        SpendinggoodAddProductPage.size.click();
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.size);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.sizeButton);
        SpendinggoodAddProductPage.sizeButton.sendKeys("Large", Keys.ENTER);
        Driver.closeDriver();


    }
}