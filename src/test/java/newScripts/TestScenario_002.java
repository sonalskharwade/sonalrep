package newScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestScenario_002 {
    @BeforeClass
    public void beforeClass_002(){
        System.out.println("this is Before class under test scenario002");
    }


    @Test(groups = {"smoke"})
    public void  TC001_Scenario002(){
        System.out.println("This is TC 001 under sScenario002");
    }
    @Test(groups = {"regression"})
    public void  TC002_Scenario002(){
        System.out.println("This is TC 002 under Scenario002");
    }
    @Test(groups = {"dev"})
    public void  TC003_Scenario002(){
        System.out.println("This is TC 003 under Scenario002");
    }
    @Test(groups = {"e2e"})
    public void  TC004_Scenario002(){
        System.out.println("This is TC 004 under Scenario002");
    }
    @Test(groups = {"prod"})
    public void  TC005_Scenario002(){
        System.out.println("This is TC 005 under Scenario002");
    }
    @Test(groups = {"smoke","regression"})
    public void  TC006_Scenario002(){
        System.out.println("This is TC 006 under Scenario002");
    }
    @Test(groups = {"smoke","e2e"})
    public void  TC007_Scenario002(){
        System.out.println("This is TC 007 under Scenario002");
    }
    @Test(groups = {"smoke","dev"})
    public void  TC008_Scenario002(){
        System.out.println("This is TC 008 under Scenario002");
    }
    @Test(groups = {"smoke","prod"})
    public void  TC009_Scenario002(){
        System.out.println("This is TC 009 under Scenario002");
    }
    @Test(groups = {"prod","regression"})
    public void  TC0010_Scenario002(){
        System.out.println("This is TC 0010 under Scenario002");
    }
    @AfterClass
    public void AfterClass_002(){
        System.out.println("This is after class for Scenario002");
    }
}
