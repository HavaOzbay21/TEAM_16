package team_16.pages.ozlem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class AccountDetallesPage {


    public AccountDetallesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
    public WebElement sigInButton;

    @FindBy(xpath = "(//input[@name=\"username\"])[1]")
    public WebElement Username_or_email_address;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "(//*[.='My Account'])[3]")
    public WebElement myAccountSayfasi;
    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account']")
    public WebElement AccountDetails;
    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement biography;
    @FindBy(xpath = "//*[@name='account_first_name']")
    public WebElement firstnameozlem;
    @FindBy(xpath = "(//*[@name='account_last_name'])[2]")
    public WebElement lastnameozlem;
    @FindBy(xpath = "//*[@id='account_email']")
    public WebElement emailozlem;
    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-content col-md-9 pt-2']")
    public WebElement detailsSayfasi;
    @FindBy(xpath = " //*[@id='password_current']")
    public WebElement currentpassworddetails;

    @FindBy(xpath = "//*[@name='password_1']")
    public WebElement newpassworddetails;
    @FindBy(xpath = "//*[@id='password_2']")
    public WebElement confirmpassword;
    @FindBy(xpath = "//*[@name='save_account_details']")
    public WebElement Savechanges;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement mensajesdechanges;

    //div[@class='woocommerce-notices-wrapper']onceki mensajeslocati
//*[@class='login logout inline-type']
    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement logoutozlem;
}




