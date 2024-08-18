package JDBC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.signInPage;
import reusable.Actions;
import reusable.Reusable;

public class W3_School {

    private WebDriver driver;
    Reusable RES;
    Actions ACT;
     @BeforeSuite
    @Parameters({"url"})
    public void launch_Test_Application(String url) {
        RES = new Reusable();
        System.out.println("this is Before Suite");
        driver = new ChromeDriver();

//this is initialization of chrome driver
        //driver.get(url);
        driver.get(RES.getGlobalData("URL"));
// this is launch teh docker url in chrome browser
        driver.manage().window().maximize();
}

@Test
    public void ABCD_test(){
    System.out.println("I am adding this line for Demo branch");

}
}
