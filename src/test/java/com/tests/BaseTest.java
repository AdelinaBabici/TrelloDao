package com.tests;

import com.steps.BoardSteps;
import com.steps.LoginSteps;
import com.tools.constants.EnvironmentConstants;
import net.bytebuddy.utility.RandomString;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepEventBus;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    @Managed(uniqueSession = true)
    WebDriver webdriver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected BoardSteps boardSteps;

    @Before
    public void setup(){
        System.setProperty("env", "trello-env");
        webdriver.navigate().to(EnvironmentConstants.BASE_URL);
    }

//    @After
//    public void tearDown(){
//        StepEventBus.getEventBus().clearStepFailures();
//        webdriver.quit();
//    }
    public void navigateToWorkspace(){
       // System.setProperty("env", "trello-env");
        webdriver.navigate().to("https://trello.com/adelinasworkspace7/home");
    }

}
