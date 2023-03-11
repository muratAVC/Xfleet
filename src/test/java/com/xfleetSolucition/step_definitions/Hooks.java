package com.xfleetSolucition.step_definitions;

import com.xfleetSolucition.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before(order = 1)
    public void setupScenario(){
        //System.out.println("before of method");
    }
    @Before(order = 0)
    public void setupScenarioForLogin(){
        //Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        //System.out.println("before of scenario for Login");
    }
    @Before(value = "@db",order = 2)
    public void setupForDatabaseScenario(){
        //System.out.println("sadece @db tag ından önce çalışır");
    }

    @After
    public void teardownScenario(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        Driver.closeDriver();

    }

    @BeforeStep
    public void setupStep(){
        //System.out.println("before of step");
    }

    @AfterStep
    public void afterStep(){
        //System.out.println("After of Step");
    }
}
