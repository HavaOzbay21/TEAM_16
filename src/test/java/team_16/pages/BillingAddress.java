package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class BillingAddress {
    public BillingAddress() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="billing_first_name")
    public WebElement firstName;

    @FindBy (id="billing_last_name")
    public WebElement lastName;

    @FindBy (id="billing_country")
    public WebElement countryRegion;

    @FindBy (id="billing_address_1")
    public WebElement streetAddress;

    @FindBy (id="billing_postcode")
    public WebElement postcodeZip;

    @FindBy (id="billing_city")
    public WebElement townCity;

    @FindBy (id="billing_phone")
    public WebElement phone;

    @FindBy (id="billing_email")
    public WebElement emailAddress;

    @FindBy (xpath="//*[@name='save_address']")
    public WebElement saveAddressButton;

    @FindBy (id="billing_state")
    public WebElement stateCountry;

    @FindBy (id="select2-billing_state-container")
    public WebElement stateCountry2;
    @FindBy (xpath = "//*[@data-id='billing_first_name']")
    public WebElement alertFirstName;

    @FindBy (xpath = "//*[@data-id='billing_last_name']")
    public WebElement alertLastName;

    @FindBy (xpath = "//*[@data-id='billing_address_1']")
    public WebElement alertAdress;

    @FindBy (xpath = "//*[@data-id='billing_city']")
    public WebElement alertCity;

    @FindBy (xpath = "//*[@data-id='billing_postcode']")
    public WebElement alertPostcode;

    @FindBy (xpath = "//*[@data-id='billing_phone']")
    public WebElement alertPhone;

    @FindBy (xpath = "//*[@data-id='billing_state']")
    public WebElement alertState;

    @FindBy (xpath = "//*[@data-id='billing_country']")
    public WebElement alertCountry;

}
