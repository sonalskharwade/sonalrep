package reusable;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import reusable.Reusable;

public class Reusable {
    public String getGlobalData(String key){
        String data = null;
        try{
            Properties prop = new Properties();
            prop.load(new FileInputStream(System.getProperty("user.dir")+"\\global.properties"));
            data = prop.getProperty(key);


        }
        catch (Exception e){e.printStackTrace();}
        return data;


    }
    public WebDriver getDriver(){
        WebDriver driver = null;
        try{
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(getGlobalData("url"));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        }
        catch(Exception e){e.printStackTrace();}
        return driver;
    }

}
