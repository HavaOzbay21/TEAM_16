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
}
