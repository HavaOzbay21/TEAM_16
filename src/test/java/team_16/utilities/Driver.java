package team_16.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import java.time.Duration;
public class Driver {
    //    Driver.getDriver(); -> driver
    private static WebDriver driver;

    //    getDriver() is used to instantiate the driver object
    public static WebDriver getDriver() {
        if (driver == null) { //eger drivere deger atanmamissa yani "null" ise deger ata , eger deger atanmissa driveri ayni sayfada return et
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
            }
//            NOTE: sel 4.5
//            driver = WebDriverManager.chromedriver().create();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        try {
           // driver.manage().window().maximize();
        } catch (Exception e) {
//            System.out.println("Windows Maximize yapilamadi");
//            Reporter.log("Exception Yakalandi");
       }

            return driver;
        }
        //    closeDriver() is used to close the driver
        public static void closeDriver () {
//        if driver is already being used(pointing an object)
//        then quit the driver
            if (driver != null) {//eger drivere deger atanmamissa yani "null" ise deger ata , eger deger atanmissa driveri ayni sayfada return et
                driver.quit();
                driver = null;
            }
        }
    }






