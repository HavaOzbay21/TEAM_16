package team_16.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class InventoryPage {
    public InventoryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }







































    //HAVA
    @FindBy(xpath = "//input[@id='sku']") public WebElement SKUkutucugu;
    @FindBy(xpath = "//input[@id='manage_stock']") public WebElement ManagerStockKutusu;
    @FindBy(xpath = "//select[@id='stock_status']") public WebElement StockStatusDropdown;
    @FindBy(xpath = "//input[@id='stock_qty']") public WebElement StockQtyKutusu;
    @FindBy(xpath = "//input[@id='sold_individually']") public WebElement SoldIndividuallyKutucugu;
    @FindBy(xpath = "(//option[text()='Do not Allow'])[1]") public WebElement AllowBackordersDropdown;


}
