package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class Urunler {

    public Urunler() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@src=\"https://spendinggood.com/wp-content/uploads/2023/02/Screenshot_15-300x300.png\"])[1]")
    public WebElement urun900;

    @FindBy(xpath = "//*[@name=\"add-to-cart\"]")
    public WebElement addToCard;

}
