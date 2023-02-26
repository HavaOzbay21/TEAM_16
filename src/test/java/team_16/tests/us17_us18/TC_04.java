package team_16.tests.us17_us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team_16.pages.hacer.SpendinggoodAddProductPage;
import team_16.pages.hacer.SpendinggoodStoreManagerPage;
import team_16.pages.hacer.imagePage;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;

public class TC_04 {



    @Test
    public void TC05() throws IOException {
        SpendinggoodStoreManagerPage SpendinggoodStoreManagerPage  = new SpendinggoodStoreManagerPage();
        SpendinggoodAddProductPage SpendinggoodAddProductPage = new SpendinggoodAddProductPage();
        imagePage imagePage=new imagePage();

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

        //ReusableMethods.getScreenshot("Variable Product Görünümü");
        //ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.variableLocated);
        simpleDropdown.selectByVisibleText("Simple Product");
        SpendinggoodStoreManagerPage.productTitleBox.sendKeys("kolye");
        ReusableMethods.waitFor(5);

        actions.moveToElement(SpendinggoodAddProductPage.kucukFoto).perform();
        SpendinggoodAddProductPage.kucukFoto.click();
        ReusableMethods.waitFor(5);
        actions.moveToElement(SpendinggoodAddProductPage.MediaLibrary).perform();
        SpendinggoodAddProductPage.MediaLibrary.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.KckResimKolye);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.addToGallery);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.buyukFoto);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodAddProductPage.KckResimKolye);
//        ReusableMethods.clickByJS(imagePage.uploadFiles);
//        ReusableMethods.waitFor(5);
//        ReusableMethods.clickByJS(imagePage.selectFiles);
//        String uploadFilePath="C:\\Users\\Hacer\\Desktop\\kolye.jpg";
//        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.bigPictureUpLoad);
//       ReusableMethods.waitFor(6);
//        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.selectFilesBox);
//        ReusableMethods.waitFor(6);
//        ReusableMethods.uploadFilePath(uploadFilePath);
        ReusableMethods.waitFor(6);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.selectBoxEnd);
        ReusableMethods.waitFor(6);
//        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.smallPictureUpLoad);
//        ReusableMethods.waitFor(6);
//        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.mediaLibrarayPicture);
//        ReusableMethods.waitFor(6);
//        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.addToGalleryEnd);
//        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.electronicsBox);
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.submitButton);
        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.editProduct);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.productButtonEnd);
        ReusableMethods.scrollDownActions();
        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.eklenenUrunLocate);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.addNewButton);


        Select select1 =new Select(SpendinggoodStoreManagerPage.productDropdown);
        select1.selectByVisibleText("External/Affiliate Product");
        ReusableMethods.scrollIntoViewJS(SpendinggoodStoreManagerPage.toptanUrunGostermeAyarlariLocate);
        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.toptanUrunGostermeAyarlariLocate);
        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.inventoryLocated);
        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.seoLocated);
        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.attributeLocate);
        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.advencedLocate);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.inventoryLocated);
        SpendinggoodStoreManagerPage.inventorySkuLocated.sendKeys("123456");
        ReusableMethods.getScreenshot("Sku ya valid deger girildi");
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.attributeLocate);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.colorBox);
        Select select2 =new Select(SpendinggoodStoreManagerPage.chooseBox);
        ReusableMethods.waitFor(3);
        select2.selectByVisibleText("Black");
        ReusableMethods.waitFor(4);
        ReusableMethods.verifyElementDisplayed(SpendinggoodStoreManagerPage.blackLocated);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.seoLocated);
        SpendinggoodStoreManagerPage.enterAFocusKeyword.sendKeys("phone");
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.toptanUrunGostermeAyarlariLocate);
        ReusableMethods.waitFor(2);
        Select select3=new Select(SpendinggoodStoreManagerPage.pieceTypeDropDown);
        select3.selectByVisibleText("Piece");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.advencedLocate);
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.enableReviewsBox);
        ReusableMethods.getScreenshot("Kullanici Enable reviews secili olmadigini dogrular.");
        ReusableMethods.clickByJS(SpendinggoodStoreManagerPage.addNewButton);
        ReusableMethods.waitFor(2);
        Driver.closeDriver();



    }
}



