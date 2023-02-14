package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class Adresses {
    public Adresses() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (partialLinkText = "EDIT")
    public WebElement addBillingAddress;

    @FindBy (partialLinkText = "ADD")
    public WebElement editBillingAddress;

    @FindBy (xpath ="//*[@role='alert']")
    public WebElement alertMessage;

//    @FindBy (xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
//    public WebElement editBillingAddress;



}
