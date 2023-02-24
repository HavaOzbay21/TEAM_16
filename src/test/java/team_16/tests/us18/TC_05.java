package team_16.tests.us18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class TC_05 {

   SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage=new SpendinggoodStoreManagerPage();
   SpendinggoodAddProductPage SpendinggoodAddProductPage=new SpendinggoodAddProductPage();
   SpendinggoodMyAccountPage SpendinggoodMyAccountPage=new SpendinggoodMyAccountPage();
   imagePage imagePage=new imagePage();
    @Test
    public void TC05() throws IOException {

        ReusableMethods.LoginVendor();
        ReusableMethods.waitFor(5);
        ReusableMethods.goToProduct();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SpendinggoodStoreManagerPage.simpleProduct.click();
        Select simpleDropdown = new Select(SpendinggoodStoreManagerPage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        SpendinggoodAddProductPage.ProductTitle.sendKeys("kolye", Keys.ENTER);
        SpendinggoodAddProductPage.url.sendKeys("gittigitti.com/", Keys.ENTER);
        SpendinggoodAddProductPage.price.sendKeys("150", Keys.ENTER);
        SpendinggoodAddProductPage.buttonText.sendKeys("nice", Keys.ENTER);
        SpendinggoodAddProductPage.salePrice.sendKeys("200", Keys.ENTER);

        ReusableMethods.clickByJS( SpendinggoodAddProductPage.kucukFoto);
        SpendinggoodAddProductPage.MediaLibrary.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.KckResimKolye);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.addToGallery);

        SpendinggoodAddProductPage.buyukFoto.click();
        ReusableMethods.waitFor(5);


        ReusableMethods.clickByJS(imagePage.uploadFiles);

        ReusableMethods.clickByJS(imagePage.selectFiles);
//        WebElement selectFiles = Driver.getDriver().findElement(By.xpath("(//button[@class='browser button button-hero'])[3]"));
//        selectFiles.click();
//        ReusableMethods.waitFor(3);
//        ReusableMethods.uploadFilePath("C:\\Users\\Hacer\\Desktop\\iskarpin.jpg");
//                ReusableMethods.waitFor(5);
//
//                ReusableMethods.clickByJS(SpendinggoodAddProductPage.selectButton);



//        ReusableMethods.clickByJS( SpendinggoodAddProductPage.BykResimKolye);
//        ReusableMethods.waitFor(5);
//        SpendinggoodAddProductPage.selectButton.click();
//        ReusableMethods.waitFor(5);
//
//        ReusableMethods.clickByJS(SpendinggoodAddProductPage.categories);
//        ReusableMethods.clickByJS(SpendinggoodAddProductPage.accessoriesButton);
//        ReusableMethods.clickByJS(SpendinggoodAddProductPage.submitButton);
//        Assert.assertTrue(SpendinggoodAddProductPage.succesMessage2.isDisplayed());
//        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.product);
//        Assert.assertTrue(SpendinggoodAddProductPage.kolyeOnProduct.isDisplayed());
//        Driver.closeDriver();



    }



        }



















