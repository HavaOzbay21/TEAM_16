package team_16.pages.hacer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class SpendinggoodStoreManagerPage {

     public SpendinggoodStoreManagerPage(){
         PageFactory.initElements(Driver.getDriver(), this);
     }

      @FindBy(xpath="(//span[@class='text'])[4]")
//      @FindBy(xpath = "//a[@href='https://spendinggood.com/store-manager/product/']")
    public WebElement product;

//    @FindBy(xpath = "//a[@id='add_new_product_dashboard']")
//    public WebElement addNew;

    @FindBy(partialLinkText = "Add New")
    public WebElement addNew;


    @FindBy(xpath = "//select[@id='product_type']")
    public  WebElement  simpleProduct;



    @FindBy(xpath = "(//*[@class='wcfm_menu_item '])[3]")
    public WebElement productsButton;

    @FindBy(id ="add_new_product_dashboard")
    public WebElement addNewButton;

    @FindBy(id="is_virtual")
    public WebElement virtuelBox;

    @FindBy(id="is_downloadable")
    public  WebElement downloadAbleBox;

    @FindBy(id="regular_price")
    public WebElement priceBox;

    @FindBy(id="sale_price")
    public WebElement salePriceBox;

    @FindBy(xpath="//select[@id='product_type']")
    public WebElement productDropdown;

    @FindBy(id="pro_title")
    public  WebElement productTitleBox;

    @FindBy(id="featured_img_display")
    public  WebElement bigPictureUpLoad;

    @FindBy(id="gallery_img_gimage_0_display")
    public  WebElement smallPictureUpLoad;

    @FindBy(xpath = "(//*[@type='checkbox'])[26]")
    public  WebElement electronicsBox;

    @FindBy(xpath="//button[@class='browser button button-hero']")
    public WebElement selectFilesBox;

    @FindBy(xpath = "(//button[@class='browser button button-hero'])[2]")
    public WebElement selectFilesBoxSmall;

    @FindBy(xpath = "//button[.='Select']")
    public WebElement selectBoxEnd;

    @FindBy(xpath = "(//button[.='Add to Gallery'])[2]")
    public WebElement addToGalleryEnd;

    @FindBy(id="wcfm_products_simple_submit_button")
    public WebElement submitButton;

    @FindBy(xpath = "(//button[.='Upload files'])[2]")
    public WebElement uploadFilesBox;
    @FindBy(xpath = "(//li[@class='attachment save-ready'])[2]")
    public WebElement mediaLibrarayPicture;

    @FindBy(xpath = "//*[.='Edit Product']")
    public WebElement editProduct;

    @FindBy(xpath = "(//td[.='Apple iPad'])[1]")
    public WebElement eklenenUrunLocate;

    @FindBy(xpath = "//*[@class='wcfm_menu_item active']")
    public WebElement productButtonEnd;

    @FindBy(id="wcfm_products_manage_form_yoast_head")
    public WebElement seoLocated;

    @FindBy(id="wcfm_products_manage_form_inventory_head")
    public WebElement inventoryLocated;

    @FindBy(id="wcfm_products_manage_form_attribute_head")
    public WebElement attributeLocate;

    @FindBy(xpath = "(//*[.='Attributes'])[2]")
    public WebElement attributeLocate2;

    @FindBy(id="wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head")
    public WebElement toptanUrunGostermeAyarlariLocate;

    @FindBy(id="wcfm_products_manage_form_advanced_head")
    public WebElement advencedLocate;

    @FindBy(xpath = "//*[@id='sku']")
    public WebElement inventorySkuLocated;

    @FindBy(id="attributes_is_active_1")
    public WebElement colorBox;

    @FindBy(id = "attributes_value_1")
    public WebElement chooseBox;

    @FindBy(xpath = "//*[@title='Black']")
    public WebElement blackLocated;

    @FindBy(id="yoast_wpseo_focuskw_text_input")
    public WebElement enterAFocusKeyword;

    @FindBy(id="piecetype")
    public WebElement pieceTypeDropDown;

    @FindBy(xpath = "//input[@id='enable_reviews']")
    public WebElement enableReviewsBox;

    @FindBy(xpath = "//*[@value='variable']")
    public WebElement variableLocated;

    @FindBy(xpath="(//*[.='Active?'])[5]")
    public WebElement aktiveLocated;

    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement variableProductTitle;

    @FindBy(xpath = "//span[@class='wcfm-wp-fields-uploader wcfm_gallery_upload multi_input_block_element wcfm_img_uploader']")
    public WebElement addNewBlockLocate;

    @FindBy(id = "menu-item-browse")
    public WebElement mediaLibraryLocate;

    @FindBy(xpath = "(//div[@class='wcfm_product_manager_gallery_fields']//span//img)[1]")
    public WebElement bigImageLocate;

    @FindBy(xpath = "(//*[.='Select'])[4]")
    public WebElement selectLocate;

    @FindBy(xpath = "(//li[@data-id='23009'])[2]")
    public WebElement resim;

    @FindBy(xpath = "//input[@data-super_parent='401']")
    public WebElement categoriesClothes;

    @FindBy(xpath = "(//button[.='Add New'])[1]")
    public WebElement colorAddNewButton;

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement productsSon;

    @FindBy(id="attributes_is_active_2")
    public WebElement sizeBox;


    @FindBy(xpath = "(//*[.='Add New'])[4]")
    public WebElement sizeAddNewButton;

    @FindBy(xpath = "(//*[.='Add'])[3]")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id='wcfm_products_simple_submit_button']")
    public WebElement attributesSubmit;

    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_variations_head']")
    public WebElement variationsButtonLocated;

    @FindBy(xpath = "//*[@name='default_attributes[attribute_pa_color]']")
    public WebElement anyColorLocated;

    @FindBy(xpath = "//*[@name='default_attributes[attribute_pa_size]']")
    public WebElement anySizeLocated;

    @FindBy(id="variations_options")
    public WebElement chooseOption;

    @FindBy(id="variations_attribute_pa_size_0")
    public WebElement AnySizeSon;

    @FindBy(id="//span[@class='fields_collapser variations_collapser wcfmfa fa-arrow-circle-down']")
    public WebElement okSekmesi;

    @FindBy(xpath="//*[@id='wcfm_products_simple_submit_button']")
    public WebElement variationsSubmit;

    @FindBy(xpath = "//*[.='Published']")
    public WebElement variationsPublished;








}
