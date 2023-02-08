package team_16.pages.hacer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class SpendinggoodAddProductPage{


     public SpendinggoodAddProductPage(){
         PageFactory.initElements(Driver.getDriver(),this);
     }
    @FindBy(xpath = "//*[@id='product_url']")
    public WebElement url;


    @FindBy(xpath = "//*[@id='button_text']")
    public WebElement buttonText;

    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement price;

    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement salePrice;

    @FindBy(id = "featured_img_display")
    public WebElement buyukFoto;

    @FindBy(id = "gallery_img_gimage_0_display")
    public WebElement kucukFoto;



}
