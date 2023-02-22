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










}
