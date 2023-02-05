package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class MyAccount {

    public MyAccount() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//*[.='My Account'])[3]")
    public WebElement myAccountSayfasi;

    @FindBy(xpath = "(//*[@href=\"https://spendinggood.com/my-account-2/orders/\"])[1]")
    public WebElement ordersButton;


}
