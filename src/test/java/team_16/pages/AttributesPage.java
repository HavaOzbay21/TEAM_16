package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class AttributesPage {
    public AttributesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }








































    //Hava
    @FindBy(id = "attributes_is_active_1") public WebElement ColorSecenegi;
    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_select_all_attributes'])[1]")public WebElement SelectAllSecenegi;
    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_select_no_attributes'])[1]")public WebElement SelectNoneSecenegi;
    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[1]")public WebElement AddNewSecenegi;
    @FindBy(xpath = "//input[@id='attributes_is_active_2']") public WebElement SizeSecenegi;
    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_select_all_attributes'])[2]")public WebElement SelectAllSizeSecenegi;
    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_select_no_attributes'])[2]")public WebElement SelectNoneSizeSecenegi;
    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[1]")public WebElement AddNewSizeSecenegi;

}
