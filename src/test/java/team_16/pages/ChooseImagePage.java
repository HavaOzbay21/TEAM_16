package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class ChooseImagePage {

    public ChooseImagePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }







































    //Hava
    @FindBy(xpath = "//button[@id='__wp-uploader-id-1']") public WebElement SELECTFILES;
    @FindBy(xpath = "//button[@id='menu-item-browse']")public WebElement MediaLibrary;
    @FindBy(xpath = "(//li[@data-id='21920'])[2]") public WebElement MaviFotoyuSec;
    @FindBy(xpath = "(//div[@class='thumbnail'])[2]") public WebElement TuruncuFotoyuSec;
    @FindBy(xpath = "(//div[@class='media-toolbar-primary search-form'])[2]") public WebElement SELECTseciliFotoIcin;
    @FindBy(xpath = "(//button[text()='Add to Gallery'])[2]") public WebElement ADDTOGALLERY;

}
