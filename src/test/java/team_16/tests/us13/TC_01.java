package team_16.tests.us13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team_16.pages.HomePage;
import team_16.pages.MyAccount;
import team_16.pages.ShippingPage;
import team_16.pages.SignIn;
import team_16.utilities.ConfigReader;
import team_16.utilities.Driver;
import team_16.utilities.ReusableMethods;

import java.io.IOException;



//Kullanici https://spendinggood.com/ siteye giris yapar 	https://spendinggood.com/+
//Anasayfada sag ust kosedeki Sign In linkine tiklar+
//Kullanici Sign-in sayfasina yonlendirilir+
//Kullanici Vendor olarak "Username or email address" alanina gecerli bir deger girer 	"//spendinggood_1234@outlook.com"+
//Password alanina gecerli bir deger girer	741852963.T+
//Sign In butonuna tiklar+
//Vendor "My Account" sayfasina yonlendirilir+
//"Addresses" e tiklar++
//"Billing Address" altindaki "ADD" yaziysina tiklar.++
//"First name" kutucuguna tiklar . "Para" yazar	Para++
//"Last name" kutucuguna tiklar . "Setemol" yazar	Setemol++
//"Country/Region" bölümüne tiklar. "Albania" yi secer	Albania
//"Street address" i tiklar . "takatuka 34" yazar	takatuka 34
//"Town/City" kutucugunu tiklar "Manhatten" yazar.	Manhatten
//"State" kutucuguna tiklar.  "New York" u secer.	New York
//"Zip Code" tiklar. "55555" girer	55555
//"Phone " tiklar. 123456789 girer	123456789
//"SAVE ADDRESS" butonuna tiklar


public class TC_01 {

    HomePage homePage = new HomePage();
    SignIn signIn= new SignIn();
    MyAccount myAccount= new MyAccount();
    ShippingPage shippingPage=new ShippingPage();

    @Test


    public void TC01() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        ReusableMethods.waitFor(10);
        ReusableMethods.waitForPageToLoad(50);
        homePage.signIn.click();
        signIn.Username_or_email_address.sendKeys(ConfigReader.getProperty("halit_email"));
        signIn.password.sendKeys(ConfigReader.getProperty("halit_sifre"));
        signIn.signInButton.click();
        ReusableMethods.waitFor(9);
        homePage.myAccountSecenegi.click();
        ReusableMethods.waitFor(3);


        ReusableMethods.clickByJS(myAccount.Addressbutonu);
        ReusableMethods.clickByJS(myAccount.Addbutonu);
        ReusableMethods.clickByJS(shippingPage.namebutonu);
        shippingPage.namebutonu.sendKeys(ConfigReader.getProperty("halit_firstname")
        ,Keys.TAB,ConfigReader.getProperty("halit_lastname"));

        shippingPage.CompanyName.sendKeys(Keys.TAB,Keys.SPACE,Keys.ENTER,Keys.TAB,
                ConfigReader.getProperty("halit_Streetadress"),
                Keys.TAB,Keys.TAB,ConfigReader.getProperty("halit_Towncity"),
                Keys.TAB,ConfigReader.getProperty("halit_Zipcode"),
                Keys.TAB,Keys.ENTER);


        ReusableMethods.clickByJS(shippingPage.SaveAddress);



















        //shippingPage.Countrybutonu.click();

        //shippingPage.Countrybutonu.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);






 

//        ReusableMethods.clickByJS(shippingPage.Adresbutonu_1);
//
//        shippingPage.Adresbutonu_1.sendKeys(ConfigReader.getProperty("halit_Streetadress"),Keys.TAB,Keys.TAB,
//                ConfigReader.getProperty("halit_Zipcode"),Keys.TAB,ConfigReader.getProperty("halit_Towncity"));
//
//
//        Select select1= new Select(shippingPage.Country_Opt);
//
//        select1.selectByVisibleText("Hamburg");
//
//        ReusableMethods.clickByJS(shippingPage.Sonbuton);






























    }
}
