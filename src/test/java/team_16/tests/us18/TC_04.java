package team_16.tests.us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.hacer.SpendinggoodAddProductPage;
import team_16.pages.hacer.SpendinggoodHomePage;
import team_16.pages.hacer.SpendinggoodMyAccountPage;
import team_16.pages.hacer.SpendinggoodStoreManagerPage;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_04 {
    SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage=new SpendinggoodStoreManagerPage();
    SpendinggoodAddProductPage SpendinggoodAddProductPage=new SpendinggoodAddProductPage();
    SpendinggoodMyAccountPage SpendinggoodMyAccountPage=new SpendinggoodMyAccountPage();
    SpendinggoodHomePage SpendinggoodHomePage=new SpendinggoodHomePage();
    @Test
    public void TC04() throws IOException {


        ReusableMethods.LoginVendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SpendinggoodStoreManagerPage.simpleProduct.click();
        Select simpleDropdown = new Select(SpendinggoodStoreManagerPage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        SpendinggoodAddProductPage.ProductTitle.sendKeys("kolye", Keys.ENTER);
        SpendinggoodAddProductPage.url.sendKeys("gittigitti.com/", Keys.ENTER);
        SpendinggoodAddProductPage.price.sendKeys("150", Keys.ENTER);
        SpendinggoodAddProductPage.buttonText.sendKeys("nice", Keys.ENTER);
        SpendinggoodAddProductPage.salePrice.sendKeys("200", Keys.ENTER);

        actions.moveToElement(SpendinggoodAddProductPage.kucukFoto).perform();
        SpendinggoodAddProductPage.kucukFoto.click();

        actions.moveToElement(SpendinggoodAddProductPage.MediaLibrary).perform();
        SpendinggoodAddProductPage.MediaLibrary.click();

        actions.moveToElement(SpendinggoodAddProductPage.KckResimKolye).perform();
        SpendinggoodAddProductPage.KckResimKolye.click();

        actions.moveToElement(SpendinggoodAddProductPage.addToGallery).perform();
        SpendinggoodAddProductPage.addToGallery.click();

        actions.moveToElement(SpendinggoodAddProductPage.buyukFoto).perform();
        SpendinggoodAddProductPage.buyukFoto.click();


        actions.moveToElement(SpendinggoodAddProductPage.iskarpin).perform();
        SpendinggoodAddProductPage.iskarpin.click();

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

