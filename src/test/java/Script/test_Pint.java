package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.KupernetesPage;
import reusable.Actions;
import reusable.Reusable;

public class test_Pint {
    private WebDriver driver;
    Reusable RES;
    Actions ACT;
    KupernetesPage KBT;

    @BeforeClass
    public void launchApp() {


        try {
            KBT = new KupernetesPage();
            RES = new Reusable();
            driver = RES.getDriver();
            ACT = new Actions(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        //@Test
        //public void Print_email_address(){
           // String text = driver.findElement(By.xpath("//input[@placeholder='email address']")).getAttribute("placeholder");
            //System.out.println("Text is visible as ==>"+text);
    //}

    @Test
    public void initial_pop_is_Visisble(){

        try {
            Thread.sleep(30000);

        String popupHeader = driver.findElement(By.xpath("//div[text()='Find Your Ideal Training Program']")).getText();
        System.out.println("Header on the pop up is Visible "+popupHeader);

        String popupsubheader = driver.findElement(By.xpath("//div[text()='Talk To Our Advisor']")).getText();
        System.out.println("Header on the pop up is Visible "+popupsubheader);
        









        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
    @AfterClass
    public void closeApp(){


        driver.quit();
    }
    }

