package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class VendorRegistration {
    public VendorRegistration() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="passoword")
    public WebElement password;

    @FindBy(id="password_strength")
    public WebElement passwordStrength;
}
