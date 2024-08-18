package newScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestScenario_003 {
    @BeforeClass
    public void beforeClass_003(){
        System.out.println("this is Before class under test Scenario003");
    }


    @Test(groups = {"smoke","e2e"})
    public void  TC001_Scenario003(){
        System.out.println("This is TC 001 under Scenario003");
    }
    @Test(groups = {"smoke","regression"})
    public void  TC002_Scenario003(){
        System.out.println("This is TC 002 under Scenario003");
    }
    @Test(groups = {"smoke","prod"})
    public void  TC003_Scenario003(){
        System.out.println("This is TC 003 under Scenario003");
    }
    @Test(groups = {"smoke","dev"})
    public void  TC004_Scenario003(){
        System.out.println("This is TC 004 under Scenario003");
    }
    @Test(groups = {"e2e","prod"})
    public void  TC005_Scenario003(){
        System.out.println("This is TC 005 under Scenario003");
    }
    @Test(groups = {"regression","dev"})
    public void  TC006_Scenario003(){
        System.out.println("This is TC 006 under Scenario003");
    }
    @Test(groups = {"dev","smoke"})
    public void  TC007_Scenario003(){
        System.out.println("This is TC 007 under Scenario003");
    }
    @Test(groups = {"smoke","regression"})
    public void  TC008_Scenario003(){
        System.out.println("This is TC 008 under Scenario003");
    }
    @Test(groups = {"e2e","prod"})
    public void  TC009_Scenario003(){
        System.out.println("This is TC 009 under Scenario003");
    }
    @Test(groups = {"dev","smoke"})
    public void  TC0010_Scenario003(){
        System.out.println("This is TC 0010 under Scenario003");
    }

    @AfterClass
    public void AfterClass_003(){
        System.out.println("This is after class for Scenario003");
    }
}
