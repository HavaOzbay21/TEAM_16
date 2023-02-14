package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class MyAccount {

    public MyAccount() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//*[.='My Account'])[3]")
    public WebElement myAccountSayfasi;

    @FindBy(xpath = "(//*[@href=\"https://spendinggood.com/my-account-2/orders/\"])[1]")
    public WebElement ordersButton;



    @FindBy (xpath ="(//div[@class='icon-box text-center'])[1]")
    public WebElement orders;

    @FindBy (xpath ="(//div[@class='icon-box text-center'])[2]")
    public WebElement downloads;

    @FindBy (xpath ="(//div[@class='icon-box text-center'])[3]")
    public WebElement adresses;

    @FindBy (xpath ="(//div[@class='icon-box text-center'])[4]")
    public WebElement accountDetails;

    @FindBy (xpath ="(//div[@class='icon-box text-center'])[5]")
    public WebElement wishList;

    @FindBy (xpath ="(//div[@class='icon-box text-center'])[6]")
    public WebElement logOut;


    //DASHBOARD altindaki linkler

    @FindBy (xpath ="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--dashboard is-active']")
    public WebElement dashBoard;

    @FindBy (xpath ="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public WebElement storeManager;

    @FindBy (xpath ="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']")
    public WebElement orders2;

    @FindBy (xpath ="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--downloads']")
    public WebElement downloads2;

    @FindBy (xpath ="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public WebElement adresses2;

    @FindBy (xpath ="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account']")
    public WebElement accountDetails2;

    @FindBy (xpath ="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wishlist']")
    public WebElement wishList2;

    @FindBy (xpath ="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--support-tickets']")
    public WebElement supportTickets;

    @FindBy (xpath ="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--followings']")
    public WebElement followings;

    @FindBy (xpath ="//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']")
    public WebElement logOut2;


















































































































































































    @FindBy(xpath="//*[@class='icon-box-title text-normal']")
    public WebElement ordersYazisi;

}
