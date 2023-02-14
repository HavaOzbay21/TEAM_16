package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class AdvancedPage {
    public AdvancedPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }









































    //HAVA
    @FindBy(xpath = "//input[@id='menu_order']")public WebElement MenuOrderKutucugu;
    @FindBy(xpath = "//*[@id='purchase_note']") public WebElement PurchaseNoteKutucugu;
}
