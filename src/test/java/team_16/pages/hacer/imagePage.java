package team_16.pages.hacer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class imagePage {

    public imagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //@FindBy(xpath = "(//button[@class='browser button button-hero'])[3]")
//    @FindBy(partialLinkText = "Select Files")
    @FindBy(xpath = "//button[@id='__wp-uploader-id-4']")
    public WebElement selectFiles;
    @FindBy(xpath = "(//button[@id='menu-item-upload'])[2]")

    public WebElement uploadFiles;
}
