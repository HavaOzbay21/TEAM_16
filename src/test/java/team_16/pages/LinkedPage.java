package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class LinkedPage {
    public LinkedPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }









































    //Hava
    @FindBy(xpath = "//p[@class='upsell_ids wcfm_title']") public WebElement Up_sellsKutucugu;
    @FindBy(xpath = "//p[@class='crosssell_ids wcfm_title']") public WebElement Cross_sellsKutucugu;












}
