package team_16.tests.us17_us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.hacer.SpendinggoodAddProductPage;
import team_16.pages.hacer.SpendinggoodMyAccountPage;
import team_16.pages.hacer.SpendinggoodStoreManagerPage;
import team_16.pages.hacer.imagePage;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_07 {


    @Test
    public void TC05() throws IOException {
        SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage=new SpendinggoodStoreManagerPage();
        SpendinggoodAddProductPage SpendinggoodAddProductPage=new SpendinggoodAddProductPage();
        SpendinggoodMyAccountPage SpendinggoodMyAccountPage=new SpendinggoodMyAccountPage();
        imagePage imagePage=new imagePage();

        ReusableMethods.LoginVendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        ReusableMethods.waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(7);
        SpendinggoodStoreManagerPage.simpleProduct.click();
        Select simpleDropdown = new Select(SpendinggoodStoreManagerPage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        SpendinggoodAddProductPage.ProductTitle.sendKeys("kolye", Keys.ENTER);
        SpendinggoodAddProductPage.url.sendKeys("gittigitti.com/", Keys.ENTER);
        SpendinggoodAddProductPage.price.sendKeys("150", Keys.ENTER);
        SpendinggoodAddProductPage.buttonText.sendKeys("nice", Keys.ENTER);
        SpendinggoodAddProductPage.salePrice.sendKeys("200", Keys.ENTER);

        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS( SpendinggoodAddProductPage.kucukFoto);
        ReusableMethods.waitFor(5);
        SpendinggoodAddProductPage.MediaLibrary.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.KckResimKolye);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.addToGallery);

        SpendinggoodAddProductPage.buyukFoto.click();
        ReusableMethods.waitFor(7);


        ReusableMethods.clickByJS(imagePage.uploadFiles);
        ReusableMethods.waitFor(7);

        ReusableMethods.clickByJS(imagePage.selectFiles);

       ReusableMethods.waitFor(5);
       ReusableMethods.uploadFilePath("C:\\Users\\Hacer\\Desktop\\kolye.jpg");
                ReusableMethods.waitFor(5);
                ReusableMethods.clickByJS(SpendinggoodAddProductPage.selectButton);

                ReusableMethods.clickByJS( SpendinggoodAddProductPage.BykResimKolye);
        ReusableMethods.waitFor(5);
        SpendinggoodAddProductPage.selectButton.click();
        ReusableMethods.waitFor(5);

        ReusableMethods.clickByJS(SpendinggoodAddProductPage.categories);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.accessoriesButton);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.submitButton);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(SpendinggoodAddProductPage.succesMessage2.isDisplayed());
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.product);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(SpendinggoodAddProductPage.kolyeOnProduct.isDisplayed());
        ReusableMethods.waitFor(3);
        Driver.closeDriver();



    }



        }



















