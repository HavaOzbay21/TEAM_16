package team_16.tests.us17;

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

public class TC_02 {
    SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage = new SpendinggoodStoreManagerPage();
    SpendinggoodAddProductPage SpendinggoodAddProductPage = new SpendinggoodAddProductPage();
    SpendinggoodMyAccountPage SpendinggoodMyAccountPage = new SpendinggoodMyAccountPage();

    @Test
    public void TC02() throws IOException {

        //us 14 teki zorunlu alanlar doldurulmali
        ReusableMethods.LoginVendor();
        ReusableMethods. waitFor(3);
        ReusableMethods.goToProduct();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select simpleDropdown=new Select(SpendinggoodStoreManagerPage.simpleProduct);

        simpleDropdown.selectByVisibleText("Variable Product");
        ReusableMethods.waitFor(3);
        //Assert.assertTrue(SpendinggoodAddProductPage.ProductTitle.isDisplayed());

        actions.moveToElement(SpendinggoodAddProductPage.kucukFoto).perform();
        SpendinggoodAddProductPage.kucukFoto.click();
        ReusableMethods.waitFor(5);

        actions.moveToElement(SpendinggoodAddProductPage.KckResimKolye).perform();
        ReusableMethods.waitFor(5);
        SpendinggoodAddProductPage.KckResimKolye.click();

        actions.moveToElement(SpendinggoodAddProductPage.addToGallery).perform();
        ReusableMethods.waitFor(5);
        SpendinggoodAddProductPage.addToGallery.click();

        actions.moveToElement(SpendinggoodAddProductPage.buyukFoto).perform();
        ReusableMethods.waitFor(5);
        SpendinggoodAddProductPage.buyukFoto.click();

//        actions.moveToElement(SpendinggoodAddProductPage.MediaLibrary).perform();
//        SpendinggoodAddProductPage.MediaLibrary.click();

        actions.moveToElement(SpendinggoodAddProductPage.BykResimKolye).perform();
        ReusableMethods.waitFor(5);
        SpendinggoodAddProductPage.BykResimKolye.click();

        actions.moveToElement(SpendinggoodAddProductPage.selectButton).perform();
        SpendinggoodAddProductPage.selectButton.click();



        actions.moveToElement(SpendinggoodAddProductPage.categories).perform();
        SpendinggoodAddProductPage.categories.click();

        actions.moveToElement(SpendinggoodAddProductPage.accessoriesButton).perform();
        SpendinggoodAddProductPage.accessoriesButton.click();

        ReusableMethods.clickByJS(SpendinggoodAddProductPage.submitButton);
        Assert.assertTrue(SpendinggoodAddProductPage.succesMessage2.isDisplayed());
        Driver.closeDriver();
    }
}