package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class YourOrder {

    public YourOrder() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"order_review_heading\"]")
    public WebElement yourOrderYazisi;

    @FindBy(xpath = "(//*[.='View'])[1]")
    public WebElement wievButonu;

    @FindBy(xpath = "//*[.='Order details']")
    public  WebElement orderDetailsButonu;



}
