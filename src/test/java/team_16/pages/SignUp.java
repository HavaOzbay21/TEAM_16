package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class SignUp {
    public SignUp() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (linkText = "Become a Vendor")
    public WebElement becomeAVendor;


}
