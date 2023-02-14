package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class SEOPage {
    public SEOPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }









































    //HAVA
    @FindBy(xpath = "//input[@id='yoast_wpseo_focuskw_text_input']") public WebElement EnterAFocusKeywordKutucugu;
    @FindBy(xpath = "//*[@id='yoast_wpseo_metadesc']") public WebElement MetaDescriptionKutucugu;

}
