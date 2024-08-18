package Script;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.KupernetesPage;
import reusable.Actions;
import reusable.Reusable;


public class Kubernetes_PrintLinks {


    private WebDriver driver;
    Reusable RES;
    Actions ACT;
    KupernetesPage KBT;




    @BeforeClass
    public void launchApp(){


        try {
            KBT = new KupernetesPage();
            RES = new Reusable();
            driver = RES.getDriver();
           ACT = new Actions(driver);
        }
        catch(Exception e){e.printStackTrace();}
    }


    @Test
    public void Print_All_Links(){

        //get total number if links present ..

        int links = driver.findElements(By.xpath("//a")).size();
        System.out.println("Total links count ==>"+links);

        for(int i=1;i<links;i++){
            String link = driver.findElement(By.xpath("(//a)["+i+"]")).getText();
            String color = ACT.getCSSValue("(//a)["+i+"]","color");
            color = Color.fromString(color).asHex(); //converted Into HexFormat
            System.out.println("the link with position==>"+i+" is==>"+links+" color==>"+color);
        }

    }


    @AfterClass
    public void closeApp(){


        driver.quit();
    }


}
