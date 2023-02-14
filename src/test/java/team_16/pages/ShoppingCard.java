package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class ShoppingCard {

    public ShoppingCard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class=\"button checkout wc-forward\"]") public WebElement checkoutButton;










































































































































































































































    @FindBy(xpath="//*[@class='button wc-forward']")
    public WebElement viewCartButton;
    @FindBy(xpath="//*[@class='cart-title']")
    public WebElement shoppingCartYazisi;
    @FindBy(xpath="(//*[@class='product-name'])[2]")
    public WebElement appleName;
    @FindBy(xpath="(//*[@class='quantity'])[2]")
    public WebElement quantityAlan;
    @FindBy(xpath="//*[@title='Plus']")
    public WebElement plusButton;
    @FindBy(xpath="//*[@name='update_cart']")
    public WebElement updateCartButton;
    @FindBy(xpath="//*[@title='Minus']")
    public WebElement minusButton;
    @FindBy(xpath="(//*[@href='https://spendinggood.com/checkout-2/'])[2]")
    public WebElement checkout;


}
