package team_16.pages.ozlem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_16.utilities.Driver;

public class ComparePage{

    public ComparePage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@class='w-icon-compare']")
    public WebElement compareButonu;
    @FindBy(xpath = "//*[@class='woocommerce-Button button']")
    public WebElement GoShopButonu;
    @FindBy(xpath = "(//*[@type=\"search\"])[1]")
    public WebElement searchButonuOzlem;
    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[1]")
    public WebElement CompareIconu3;
//@FindBy(xpath = "(//*[@class='product-wrap'])[1]")
//public WebElement bagOzlem;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[2]")
    public WebElement CompareIconu4;
    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[3]")
    public WebElement CompareIconu5;
    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[4]")
    public WebElement CompareIconu6;

    @FindBy(xpath = "//*[@class='products  row cols-lg-3 cols-md-3 cols-sm-2 cols-2']")
    public WebElement urunsayfasi;

    @FindBy(xpath = "//*[@title='Compare']")
    public WebElement compareurunlerOzlem;
    @FindBy(xpath="//*[@class='compare-clean']")
    public WebElement compareclean;
    @FindBy(xpath="//*[@class='btn btn-dark btn-rounded']")
    public WebElement startcompare;
}












