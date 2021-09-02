package com.steps;

import com.pages.BasePage;
import com.tools.injector.AppInjector;
import net.thucydides.core.steps.ScenarioSteps;

public class AbstractSteps extends ScenarioSteps {
    public BasePage basePage;

    public AbstractSteps(){
        AppInjector.getInjector().injectMembers(this);
    }
}
