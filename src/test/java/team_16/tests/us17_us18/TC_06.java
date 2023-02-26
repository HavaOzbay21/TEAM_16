package team_16.tests.us17_us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.hacer.*;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_06 {

    @Test

    public void TC04() throws IOException {
        SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage=new SpendinggoodStoreManagerPage();
        SpendinggoodAddProductPage SpendinggoodAddProductPage=new SpendinggoodAddProductPage();
        SpendinggoodMyAccountPage SpendinggoodMyAccountPage=new SpendinggoodMyAccountPage();
        SpendinggoodHomePage SpendinggoodHomePage=new SpendinggoodHomePage();
        imagePage imagePage=new imagePage();



        ReusableMethods.LoginVendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
       // SpendinggoodStoreManagerPage.simpleProduct.click();
        ReusableMethods.clickByJS( SpendinggoodStoreManagerPage.simpleProduct);
        ReusableMethods.waitFor(5);
        Select simpleDropdown = new Select(SpendinggoodStoreManagerPage.simpleProduct);
        ReusableMethods.waitFor(3);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        SpendinggoodAddProductPage.ProductTitle.sendKeys("kolye", Keys.ENTER);
        SpendinggoodAddProductPage.url.sendKeys("gittigitti.com/", Keys.ENTER);
        SpendinggoodAddProductPage.price.sendKeys("150", Keys.ENTER);
        SpendinggoodAddProductPage.buttonText.sendKeys("nice", Keys.ENTER);
        SpendinggoodAddProductPage.salePrice.sendKeys("200", Keys.ENTER);
        ReusableMethods.waitFor(3);

        actions.moveToElement(SpendinggoodAddProductPage.kucukFoto).perform();
        SpendinggoodAddProductPage.kucukFoto.click();
        ReusableMethods.waitFor(5);
        actions.moveToElement(SpendinggoodAddProductPage.MediaLibrary).perform();
        SpendinggoodAddProductPage.MediaLibrary.click();
        ReusableMethods.waitFor(5);
        actions.moveToElement(SpendinggoodAddProductPage.KckResimKolye).perform();
        SpendinggoodAddProductPage.KckResimKolye.click();
        ReusableMethods.waitFor(5);
        actions.moveToElement(SpendinggoodAddProductPage.addToGallery).perform();
        SpendinggoodAddProductPage.addToGallery.click();
        ReusableMethods.waitFor(5);
        actions.moveToElement(SpendinggoodAddProductPage.buyukFoto).perform();
        SpendinggoodAddProductPage.buyukFoto.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(imagePage.uploadFiles);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(imagePage.selectFiles);
        String uploadFilePath="C:\\Users\\Hacer\\Desktop\\kolye.jpg";
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS( SpendinggoodAddProductPage.selectButton);
        ReusableMethods.waitFor(5);
        actions.moveToElement(SpendinggoodAddProductPage.categories).perform();
        SpendinggoodAddProductPage.categories.click();
        ReusableMethods.waitFor(5);
        actions.moveToElement(SpendinggoodAddProductPage.accessoriesButton).perform();
        SpendinggoodAddProductPage.accessoriesButton.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.submitButton);
        Assert.assertTrue(SpendinggoodAddProductPage.succesMessage2.isDisplayed());
        ReusableMethods.waitFor(5);
        Driver.closeDriver();
    }

}

