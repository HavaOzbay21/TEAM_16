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

     @FindBy(xpath = "//input[@id='pro_title']")
     public WebElement ProductTitle;


    @FindBy(xpath = "//*[@id='button_text']")
    public WebElement buttonText;

    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement price;

    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement salePrice;

    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement buyukFoto;

    @FindBy(id = "gallery_img_gimage_0_display")
    public WebElement kucukFoto;

    @FindBy(xpath = "//button[@id='menu-item-browse']")
    public WebElement MediaLibrary;

    @FindBy(xpath = "(//li[@data-id='19763'])[2]")
    public WebElement resim;

    @FindBy(xpath = "//button[.='Select']")
    public WebElement selectButton;

    @FindBy(xpath = "(//button[text()='Add to Gallery'])[2]")
    public WebElement addToGallery;

    @FindBy(id= "wcfm_products_simple_submit_button")
    public WebElement submitButton;

    @FindBy(xpath= "//body[@data-rsssl='1']")
    public WebElement succesMessage2;


    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/div[3]/p[1]")
    public WebElement categories;

    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/input[1]")
    public WebElement accessoriesButton;

    @FindBy(xpath = "//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]")
    public WebElement BykResimKolye;



    @FindBy(xpath = "//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]")
    public WebElement KckResimKolye;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/a[1]/img[1]")
    public WebElement kolyeOnProduct;

    @FindBy(xpath = "//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[1]")
    public WebElement iskarpin;

    @FindBy(xpath = "//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[12]/div[1]/div[1]")
    public WebElement greenTshirt;

    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[5]/input[1]")
    public WebElement clothing;
    @FindBy(xpath = "//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[14]/div[1]/div[1]")
    public WebElement redTshirt;

    @FindBy(xpath = "//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[13]/div[1]/div[1]")
    public WebElement blueTshirt;
    @FindBy(xpath = "//input[@id='attributes_is_active_1']")
    public WebElement color;

    @FindBy(xpath = "//input[@id='attributes_is_active_2']")
    public WebElement size;

    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[1]/div[16]/div[1]")
    public WebElement variations;

    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[1]/div[13]/div[1]")
    public WebElement attributes;




    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[2]")
    public WebElement colorButton;

    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[3]")
    public WebElement sizeButton;

    @FindBy(xpath ="(//button[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[1]")
    public WebElement colorAddNewButton;

    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[2]")
    public WebElement sizeAddNewButton;

    @FindBy(xpath = "//select[@name='default_attributes[attribute_pa_color]']")
    public WebElement anyColorSelect;

    @FindBy(xpath = "//select[@name='default_attributes[attribute_pa_size]']")
    public WebElement anySizeSelect;

    @FindBy(xpath = "//select[@name='variations[0][attribute_pa_size]']")
    public WebElement anySizeSelect1;

    @FindBy(xpath = "//select[@name='variations[0][attribute_pa_color]']")
    public WebElement anyColorSelect1;

    @FindBy(xpath = "//input[@id='variations_sale_price_0']")
    public WebElement salePrise2;

    @FindBy(xpath = "//input[@id='variations_regular_price_0']")
    public WebElement regularPrice2;






}
