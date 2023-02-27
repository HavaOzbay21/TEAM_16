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
    @FindBy(xpath = "//button[@id='__wp-uploader-id-4']") public WebElement SELECTFILESBuyukFoto;
    @FindBy(xpath = "//button[@id='__wp-uploader-id-7']") public WebElement SELECTFILESKucukFoto;
    @FindBy(xpath = "//button[@id='menu-item-browse']")public WebElement MediaLibrary;
    @FindBy(xpath = "(//button[@id='menu-item-upload'])[2]") public WebElement UploadFiles;
    @FindBy(xpath = "(//div[@class='thumbnail'])[1]") public WebElement MaviFotoyuSec;
    @FindBy(xpath = "(//div[@class='thumbnail'])[2]") public WebElement TuruncuFotoyuSec;
    @FindBy(xpath = "//button[text()='Select']") public WebElement SELECTseciliFotoIcin;
    @FindBy(xpath = "(//button[text()='Add to Gallery'])[2]") public WebElement ADDTOGALLERY;


    @FindBy(xpath = "//div[@class='thumbnail']") public WebElement ayakkabifoto;
    @FindBy(xpath = "(//*[@class=\"thumbnail\"])") public WebElement ayakkabifoto2;

}
