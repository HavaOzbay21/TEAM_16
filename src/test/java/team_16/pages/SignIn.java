package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class SignIn {

    public  SignIn () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="(//*[@class='w-icon-account'])[1]")
    public WebElement sigInButton;

}
