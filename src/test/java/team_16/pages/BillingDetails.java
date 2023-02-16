package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class BillingDetails {

    public BillingDetails() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@name=\"billing_first_name\"]")
    public WebElement firstName;

    @FindBy(id = "billing_country")
    public WebElement countryRegion;

    @FindBy(xpath = "//*[@name=\"billing_address_1\"]")
    public WebElement streetAddress;

    @FindBy(xpath = "//th[.='Total']")
    public WebElement totalGorunurluk;

    @FindBy(xpath ="//*[@for=\"payment_method_bacs\"]")
    public WebElement wiseEFTTransfer;

    @FindBy(xpath = "//*[@for=\"payment_method_cod\"]")
    public WebElement payDoor;

    @FindBy(xpath = "(//*[@class=\"input-radio\"])[2]")
    public WebElement radioButtonGorunuluruk;

    @FindBy(xpath = "//*[@id=\"place_order\"]")
    public WebElement placeOrder;

    @FindBy(xpath = "//*[.='Enter your code']")
    public WebElement enterYourCode;

    @FindBy(xpath = "//*[@id=\"coupon_code\"]")
    public WebElement codeBoslugu;

    @FindBy (xpath = "//*[.='Coupon: indirim']")
    public WebElement kuponIndirimiGorunurlugu;






}
