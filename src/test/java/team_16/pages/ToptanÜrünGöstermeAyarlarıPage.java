package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class ToptanÜrünGöstermeAyarlarıPage {
    public ToptanÜrünGöstermeAyarlarıPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }









































    //Hava
    @FindBy(xpath = "//select[@id='piecetype']") public WebElement PieceTypeDropdown;
    @FindBy(xpath = "//input[@id='unitpercart']") public WebElement UnitsPerPieceKutucugu;
    @FindBy(xpath = "//input[@id='minorderqtytr']") public WebElement MinOrderQuantityKutucugu;

}
