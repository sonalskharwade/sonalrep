package Script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reusable.*;
import pageObject.*;
public class devLabs_alliance {
    private WebDriver driver;
    Reusable RES;
    Actions ACT;
    devLabs_alliance DevLabs;

    @BeforeClass
    public void launchApp(){


        try {
            DevLabs = new devLabs_alliance();
            RES = new Reusable();
            driver = RES.getDriver();
            ACT = new Actions(driver);
        }
        catch(Exception e){e.printStackTrace();}
    }

}
