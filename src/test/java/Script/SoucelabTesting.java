package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reusable.Reusable;
import pageObject.signInPage;
import pageObject.welcomePage;

import java.time.Duration;

public class SoucelabTesting {

    WebDriver driver;
    Reusable RES;
    signInPage SignIn_Page;

    @BeforeSuite
    @Parameters({"url"})
    public void launch_Test_Application(String url) {
         RES = new Reusable();
         System.out.println("this is Before Suite");
        driver = new ChromeDriver();
        SignIn_Page = new signInPage();
//this is initialization of chrome driver
        //driver.get(url);
        driver.get(RES.getGlobalData("url"));
// this is launch teh docker url in chrome browser
        driver.manage().window().maximize();



    }


    @Test
    public void ValidateHeader() {
        WebElement headerElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
//div[text()='Swag Labs']
        Boolean display = headerElement.isDisplayed();
        if (headerElement.isDisplayed()) {
            System.out.println("header validated");
        } else {
            System.out.println("header not validated");
        }
    }

    @Test
    @Parameters({"Username","Password"})
    public void Login(String Username, String Password)
    {

        WebElement UN = driver.findElement(By.xpath(SignIn_Page.UserName()));
//div[text()='Swag Labs']
        UN.sendKeys(Username);
        WebElement PW = driver.findElement(By.xpath(SignIn_Page.Password()));
//div[text()='Swag Labs']
        PW.sendKeys(Password);
//login-button
        WebElement Lb = driver.findElement(By.xpath(SignIn_Page.Submit()));
//div[text()='Swag Labs']
        Lb.click();
    }

    @AfterSuite
    public void QuitBrowser() {
        {
            System.out.println("this is After Suite");
            driver.quit();
        }
    }
}




