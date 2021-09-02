package com.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends PageObject {
    public BasePage(final WebDriver driver) {
        super();
    }
    public void typeInInputWithId(String inputId, String value){
        typeInto(getDriver().findElement(By.cssSelector("input[id='" + inputId + "']")), value);
    }

    public void typeInInputWithPlaceholder(String inputPlaceholder, String value){
        typeInto(getDriver().findElement(By.cssSelector("input[placeholder='" + inputPlaceholder + "']")), value);
    }






}
