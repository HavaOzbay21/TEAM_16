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
    @FindBy(xpath = "//*[@class='wcfmfa fa-link']") public WebElement LinkedSecenegi;
    @FindBy(xpath = "//*[@class='wcfma fa-globe']") public WebElement SEOSecenegi;
    @FindBy(xpath = "//div[text()='Toptan Ürün Gösterme Ayarları']") public WebElement ToptanUrunGostermeAyarlarıSecenegi;
    @FindBy(xpath = "//div[text()='Advanced']") public WebElement AdvancedSecenegi;
    @FindBy(xpath = "//h2[text()='Add Product']") public WebElement AddProductYazisi;
    @FindBy(xpath = "//select[@id='product_type']") public WebElement SimpleProductSecili;
    @FindBy(xpath = "//input[@id='is_virtual']") public WebElement VirtualKutucugu;
    @FindBy(xpath = "//input[@id='is_downloadable']")public WebElement DownloadableKutucugu;
    @FindBy(xpath = "//input[@id='pro_title']")public WebElement ProductTitle;
    @FindBy(xpath = "//input[@id='regular_price']")public WebElement Price;
    @FindBy(xpath = "//input[@id='sale_price']")public WebElement SalePrice;
    @FindBy(xpath = "//iframe[@id='excerpt_ifr']")public WebElement ShortDescription;
    @FindBy(xpath = "//iframe[@id='description_ifr']")public WebElement Description;






}
