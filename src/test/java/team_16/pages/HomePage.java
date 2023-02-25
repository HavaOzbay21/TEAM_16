package team_16.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import team_16.utilities.Driver;



public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Sign In ']")
    public WebElement signIn;

    @FindBy(xpath = "//li[@id='menu-item-1074']")
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





























        @FindBy(xpath = "//*[.='Sign Out']")
        public WebElement signOut;
        @FindBy(xpath = "//button[@class='mfp-close']")
        public WebElement test3;
        @FindBy(xpath = "//a[@class='btn btn-dark btn-rounded btn-sm add_to_cart alt']")
        public WebElement addToCart;
        @FindBy(xpath = "//button[@class='button alt']")
        public WebElement buttonalt;

        @FindBy(xpath = "//i[@class='fas fa-check']")
        public WebElement us8ass1;

        @FindBy(xpath = "//span[.='Order number']")
        public WebElement us8ass2;














    @FindBy (xpath = "//span[.='Wishlist']")
    public WebElement Wishlist;

    @FindBy (xpath = "//a[.='Sign Up']")
    public WebElement SignUp;

    @FindBy (xpath = "//input[@id='reg_username']")
    public WebElement SignUp_UserName;












}
