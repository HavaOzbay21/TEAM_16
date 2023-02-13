package team_16.pages.hacer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class SpendinggoodHomePage {
    public SpendinggoodHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='username']")
    public WebElement mailKutusu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement signIn;

    @FindBy(xpath="//button[.='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath="(//*[text()='My Account'])[1]")
    public WebElement myAccount;

}
