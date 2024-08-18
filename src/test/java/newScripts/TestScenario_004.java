package newScripts;

import org.testng.annotations.Test;

public class TestScenario_004 {
    @Test(priority = 1)
    public void  TC001_Scenario003(){
        System.out.println("This is TC 001 under Scenario003");
    }
    @Test()
    public void  TC002_Scenario003(){
        System.out.println("This is TC 002 under Scenario003");
    }
    @Test(priority = -1)
    public void  TC003_Scenario003(){
        System.out.println("This is TC 003 under Scenario003");
    }
    @Test(priority = 2)
    public void  TC004_Scenario003(){
        System.out.println("This is TC 004 under Scenario003");
    }
    @Test(priority = 3)
    public void  TC005_Scenario003(){
        System.out.println("This is TC 005 under Scenario003");
    }

}
