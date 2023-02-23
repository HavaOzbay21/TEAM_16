package team_16.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class ShippingPage {

    public ShippingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//*[@id=\"shipping_first_name\"]")
    public WebElement namebutonu;


    @FindBy (xpath ="//span[@id='select2-shipping_country-container']")
    public WebElement Countrybutonu;

    @FindBy (xpath="(//*[@id=\"shipping_address_1\"])")
    public  WebElement Adresbutonu_1;

    @FindBy (xpath = "(//*[@id=\"select2-shipping_state-container\"])")
    public WebElement Country_Opt;

    @FindBy (xpath = "(//*[@class=\"btn btn-dark btn-rounded btn-sm\"])")
    public  WebElement Sonbuton;

    @FindBy (xpath = "(//*[@class=\"input-text \"])[3]")
    public WebElement CompanyName;

    @FindBy (xpath = "(//*[@class=\"btn btn-dark btn-rounded btn-sm\"])")
    public WebElement SaveAddress;





















































 //HAVA
    @FindBy(xpath = "//input[@id='weight']") public WebElement WeightKGKutusu;
    @FindBy(xpath = "//input[@id='length']") public WebElement LenghtCMKutusu;
    @FindBy(xpath = "//input[@id='width']") public WebElement WidthCMKutusu;
    @FindBy(xpath = "//input[@id='height']") public WebElement HeightCMKutusu;
    @FindBy(xpath = "//select[@id='shipping_class']") public WebElement ShippingClassDriopdown;
    @FindBy(xpath = "//select[@id='_wcfmmp_processing_time']") public WebElement ProcessingTimeDropdown;






}
