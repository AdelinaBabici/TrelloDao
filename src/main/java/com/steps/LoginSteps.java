package com.steps;

import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps extends AbstractSteps{
    private LoginPage loginPage;

    @Step
    public void login(){
        loginPage.login();
    }

}
