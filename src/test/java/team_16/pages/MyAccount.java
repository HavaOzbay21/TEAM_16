package team_16.pages;

import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class MyAccount {

    public  MyAccount () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
