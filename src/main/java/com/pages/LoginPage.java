package com.pages;

import com.tools.constants.EnvironmentConstants;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".btn.btn-sm.btn-link ")
    WebElementFacade loginLink;
    @FindBy(css = "input[id='login']")
    WebElementFacade loginButton;
    @FindBy(css = "button[id='login-submit']")
    WebElementFacade submitButton;

    public void login(){
      clickOn(loginLink);
      typeInInputWithId("user", EnvironmentConstants.USERNAME);
      clickOn(loginButton);
      waitABit(2000);
      typeInInputWithId("password", EnvironmentConstants.PASSWORD);
      clickOn(submitButton);
    }
}
