package team_16.utilities;

import java.io.FileInputStream;
import java.util.Properties;
public class ConfigReader {
    //Bu sinif   configuration.properties file'i okumak icin kullanilir
    //propert file'i okumak icin properti objesi kullanilir
    private static Properties properties;
    //static block :ilk calisir
    static {
        //data cekmek istedigim dosyanin path'i
        String path="configuration.properties";
        try {
            // configuration.properties dosyasini acar
            FileInputStream fileInputStream = new FileInputStream(path);
            //properties onjesini instantiate ediyoruz
            properties = new Properties();
            //configuration.properties'indaki datalari alir
            properties.load(fileInputStream);

            fileInputStream.close();//okuma islemini kapattik
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){ //bu method ise yukaridaki static blocktaki degerleri kullanarak
        // istedigimiz datayi almaya yarar yani hazir bir methodtur
        // (datalari tek tek alabilmek icin)
        String value=properties.getProperty(key);
        return value;
    }
    //    ConfigReader.getProperty("browser"); -> chrome
    //    ConfigReader.getProperty("amazon_url"); -> https://www.amazon.com
    //    ConfigReader.getProperty("username"); -> ali
}
