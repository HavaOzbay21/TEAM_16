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


}
