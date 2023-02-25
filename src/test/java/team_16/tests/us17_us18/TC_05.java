package team_16.tests.us17_us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team_16.pages.hacer.SpendinggoodAddProductPage;
import team_16.pages.hacer.SpendinggoodStoreManagerPage;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_05 {


    @Test
    public void TC04() throws IOException {
        SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage = new SpendinggoodStoreManagerPage();
        SpendinggoodAddProductPage SpendinggoodAddProductPage = new SpendinggoodAddProductPage();



        ReusableMethods.LoginVendor();
        ReusableMethods. waitFor(3);
        ReusableMethods.goToProduct();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select simpleDropdown=new Select(SpendinggoodStoreManagerPage.simpleProduct);

        simpleDropdown.selectByVisibleText("Variable Product");
        ReusableMethods.waitFor(3);

        ReusableMethods.waitFor(2);
        ReusableMethods.scrollIntoViewJS(SpendinggoodStoreManagerPage.attributeLocate2);

        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.attributeLocate2);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.colorBox);
        Select select2 =new Select(SpendinggoodStoreManagerPage.chooseBox);
        ReusableMethods.waitFor(3);
        select2.selectByVisibleText("Green");
        ReusableMethods.waitFor(4);

        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.aktiveLocated);
        ReusableMethods.getScreenshot("kutular tikli");
        SpendinggoodStoreManagerPage.variableProductTitle.sendKeys("Tablet");
        ReusableMethods.waitFor(3);
        Actions actions1 = new Actions(Driver.getDriver());
        actions.click( SpendinggoodStoreManagerPage.addNewBlockLocate).perform();
        ReusableMethods.waitFor(3);
        actions.click(SpendinggoodStoreManagerPage.mediaLibraryLocate).perform();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.mediaLibrarayPicture);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.addToGalleryEnd);
        ReusableMethods.waitFor(4);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.bigImageLocate);

        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.resim);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.selectLocate);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.categoriesClothes);
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.colorAddNewButton);
        ReusableMethods.waitFor(3);

        Driver.getDriver().switchTo().alert().sendKeys("lacivert");
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(5);
        try {
            Driver.getDriver().switchTo().alert().accept();
        }catch (Exception e){

        }
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.sizeBox);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.sizeAddNewButton);
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().alert().sendKeys("10''");
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(7);
        try {
            Driver.getDriver().switchTo().alert().accept();
        }catch (Exception e){

        }
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.addButton);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.attributesSubmit);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.variationsButtonLocated);
        ReusableMethods.waitFor(3);
        Select select4 =new Select(SpendinggoodStoreManagerPage.anyColorLocated);
        select4.selectByVisibleText("Green");
        ReusableMethods.waitFor(3);
        ReusableMethods.waitFor(3);
        Select select6 = new Select(SpendinggoodStoreManagerPage.chooseOption);
        select6.selectByVisibleText("Regular prices");
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().alert().sendKeys("400");
        ReusableMethods.waitFor(7);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(7);
        select6.selectByVisibleText("Sale prices");
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().alert().sendKeys("500");
        ReusableMethods.waitFor(7);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(7);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.variationsSubmit);
        ReusableMethods.waitFor(5);
        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.variationsPublished);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.productsSon);
        ReusableMethods.waitFor(3);
        Driver.closeDriver();


    }

}





