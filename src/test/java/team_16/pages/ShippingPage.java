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









































 //HAVA
    @FindBy(xpath = "//input[@id='weight']") public WebElement WeightKGKutusu;
    @FindBy(xpath = "//input[@id='length']") public WebElement LenghtCMKutusu;
    @FindBy(xpath = "//input[@id='width']") public WebElement WidthCMKutusu;
    @FindBy(xpath = "//input[@id='height']") public WebElement HeightCMKutusu;
    @FindBy(xpath = "//select[@id='shipping_class']") public WebElement ShippingClassDriopdown;
    @FindBy(xpath = "//select[@id='_wcfmmp_processing_time']") public WebElement ProcessingTimeDropdown;






}
