package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class OrdersPage {


    public OrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h4[.='Orders']")
    public WebElement orderSayfasiYazisi;

    @FindBy(xpath = "//*[@class=\"woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success\"]")
    public  WebElement orderComplete;

}
