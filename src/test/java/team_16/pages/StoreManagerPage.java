package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class StoreManagerPage {

    public StoreManagerPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }






































    //HAVA
    @FindBy(xpath = "//h2[text()='Store Manager']") public WebElement StoreManagerSayfaGorunumu;
    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_inventory_head']")public WebElement InventorySecenegi;
    @FindBy(xpath = "//*[text()='Shipping']") public WebElement ShippingSecenegi;
    @FindBy(xpath = "//div[text()='Attributes']")public WebElement AttributesSecenegi;
    @FindBy(xpath = "//*[@class='wcfma fa-globe']") public WebElement LinkedSecenegi;
    @FindBy(xpath = "//*[@class='wcfma fa-globe']") public WebElement SEOSecenegi;
    @FindBy(xpath = "//*[@CLASS='wcfmfa fa-certificate']") public WebElement ToptanÜrünGöstermeAyarlarıSecenegi;
    @FindBy(xpath = "//*[@class='wcfmfa fa-th-large']") public WebElement AdvancedSecenegi;






}
