package team_16.tests.us17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team_16.pages.hacer.SpendinggoodAddProductPage;
import team_16.pages.hacer.SpendinggoodStoreManagerPage;
import team_16.pages.hacer.imagePage;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

public class TC_05 {
    SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage;
    SpendinggoodAddProductPage SpendinggoodAddProductPage;

    @Test
    public void TC05() {
        SpendinggoodStoreManagerPage = new SpendinggoodStoreManagerPage();
        SpendinggoodAddProductPage = new SpendinggoodAddProductPage();


        //yeni color ve size eklenebilmeli
        //variantsa tiklanarak eklenen attributes gorulmeli
        //eklenen attributes e gore urun bilgileri secilip urun oezllikleri doldurulabilmeli
        ReusableMethods.LoginVendor();
        ReusableMethods. waitFor(3);
        ReusableMethods.goToProduct();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select simpleDropdown=new Select(SpendinggoodStoreManagerPage.simpleProduct);
        simpleDropdown.selectByVisibleText("Variable Product");
        ReusableMethods.waitFor(3);

//        ReusableMethods.clickByJS( SpendinggoodAddProductPage.kucukFoto);
//        ReusableMethods.waitFor(3);
//        ReusableMethods.clickByJS(SpendinggoodAddProductPage.MediaLibrary);
//        ReusableMethods.waitFor(3);
//        ReusableMethods.clickByJS( SpendinggoodAddProductPage.blueTshirt);
//        ReusableMethods.waitFor(3);
//        ReusableMethods.clickByJS(SpendinggoodAddProductPage.addToGallery);
//        ReusableMethods.waitFor(3);
//        ReusableMethods.clickByJS(SpendinggoodAddProductPage .buyukFoto);
//        ReusableMethods.waitFor(3);
//        ReusableMethods.clickByJS(SpendinggoodAddProductPage.greenTshirt);
//        ReusableMethods.waitFor(3);
//        ReusableMethods.clickByJS(SpendinggoodAddProductPage.selectButton);
//        ReusableMethods.waitFor(3);


//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        ReusableMethods.waitFor(2);
//        actions.moveToElement(SpendinggoodAddProductPage.attributes).perform();
//        SpendinggoodAddProductPage.attributes.click();

        ReusableMethods.clickByJS(SpendinggoodAddProductPage.attributes);


        ReusableMethods.clickByJS( SpendinggoodAddProductPage.color);
        ReusableMethods.waitFor(2);

        ReusableMethods.clickByJS(SpendinggoodAddProductPage.colorButton);

        SpendinggoodAddProductPage.colorButton.sendKeys("red", Keys.ENTER);


        ReusableMethods.clickByJS(SpendinggoodAddProductPage.size);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.sizeButton);
        SpendinggoodAddProductPage.sizeButton.sendKeys("Large", Keys.ENTER);


//        actions.moveToElement(SpendinggoodAddProductPage.colorAddNewButton).perform();
//        SpendinggoodAddProductPage.colorAddNewButton.click();
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.colorAddNewButton);
        Driver.getDriver().switchTo().alert().sendKeys("lilak");
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(3);

//        actions.moveToElement(SpendinggoodAddProductPage.sizeAddNewButton).perform();
//        SpendinggoodAddProductPage.sizeAddNewButton.click();
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.sizeAddNewButton);
        Driver.getDriver().switchTo().alert().sendKeys("mini");
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(SpendinggoodAddProductPage.variations);
        ReusableMethods.waitFor(2);

        Select anyColor=new Select(SpendinggoodAddProductPage.anyColorSelect);
        anyColor.selectByVisibleText("Red");
        ReusableMethods.waitFor(3);

        Select anySize=new Select(SpendinggoodAddProductPage.anySizeSelect);
        anyColor.selectByVisibleText("Large");
        ReusableMethods.waitFor(3);

        Select anySize1=new Select(SpendinggoodAddProductPage.anySizeSelect1);
        anyColor.selectByVisibleText("mini");
        ReusableMethods.waitFor(3);

        Select anyColor1=new Select(SpendinggoodAddProductPage.anyColorSelect1);
        anyColor.selectByVisibleText("lilak");
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(SpendinggoodAddProductPage.regularPrice2);
        SpendinggoodAddProductPage.regularPrice2.sendKeys("150", Keys.ENTER);

        ReusableMethods.clickByJS(SpendinggoodAddProductPage.salePrise2);
        SpendinggoodAddProductPage.salePrise2.sendKeys("200", Keys.ENTER);
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS( SpendinggoodAddProductPage.ProductTitle);
        SpendinggoodAddProductPage.ProductTitle.sendKeys("T-shirt", Keys.ENTER);

        ReusableMethods.clickByJS(SpendinggoodAddProductPage.clothing);

        ReusableMethods.clickByJS(SpendinggoodAddProductPage.submitButton);

        Assert.assertTrue(SpendinggoodAddProductPage.succesMessage2.isDisplayed());

        Driver.closeDriver();


    }
}