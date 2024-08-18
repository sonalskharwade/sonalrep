package newScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestScenario_001 {

    @BeforeClass
    public void beforeClass_001(){
        System.out.println("this is Before class under test scenario001");
    }


    @Test(groups = {"smoke"})
    public void  TC001_Scenario001(){
        System.out.println("This is TC 001 under scenario001");
    }
    @Test(groups = {"smoke","regression"})
    public void  TC002_Scenario001(){
        System.out.println("This is TC 002 under scenario001");
    }
    @Test(groups = {"e2e"})
    public void  TC003_Scenario001(){
        System.out.println("This is TC 003 under scenario001");
    }
    @Test(groups = {"smoke","e2e"})
    public void  TC004_Scenario001(){
        System.out.println("This is TC 004 under scenario001");
    }
    @Test(groups = {"e2e","regression"})
    public void  TC005_Scenario001(){
        System.out.println("This is TC 005 under scenario001");
    }
    @Test(groups = {"e2e","smoke"})
    public void  TC006_Scenario001(){
        System.out.println("This is TC 006 under scenario001");
    }
    @Test(groups = {"regression"})
    public void  TC007_Scenario001(){
        System.out.println("This is TC 007 under scenario001");
    }
    @Test(groups = {"prod"})
    public void  TC008_Scenario001(){
        System.out.println("This is TC 008 under scenario001");
    }
    @Test(groups = {"dev"})
    public void  TC009_Scenario001(){
        System.out.println("This is TC 009 under scenario001");
    }
    @Test(groups = {"dev","prod"})
    public void  TC0010_Scenario001(){
        System.out.println("This is TC 0010 under scenario001");
    }
    @AfterClass
    public void AfterClass_001(){
        System.out.println("This is after class for Scenario001");
    }
}
