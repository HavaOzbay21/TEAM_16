package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Sign In ']")
    public WebElement signIn;

    @FindBy(xpath = "(//a[.='My Account'])[1]")
    public WebElement myAccountSecenegi;

    @FindBy(xpath = "(//*[@type=\"search\"])[1]")
    public WebElement searchButonu;

    @FindBy(xpath = "(//*[.='7'])[1]")
    public WebElement cartKontrol; // Bu kod assertion icin kisiseldir.

    @FindBy(xpath = "(//*[@class=\"w-icon-cart\"])[1]")
    public WebElement cart;

    @FindBy (xpath = "//span[text()='Register']")
    public WebElement registerButton;



























































































































































































































    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOutButton;
    @FindBy(xpath="(//*[@class='cart-count'])[1]")
    public WebElement cartCount;







































    @FindBy (xpath = "//span[.='Wishlist']")
    public WebElement Wishlist;

    @FindBy (xpath = "//a[.='Sign Up']")
    public WebElement SignUp;

    @FindBy (xpath = "//input[@id='reg_username']")
    public WebElement SignUp_UserName;











}
