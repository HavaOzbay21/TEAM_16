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
    public WebElement product;

    @FindBy(xpath="(//*[text()='Add New'])[1]")
    public WebElement addNew;

    @FindBy(xpath = "//select[@id='product_type']")
    public  WebElement  simpleProduct;










}
