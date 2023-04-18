package com.semdatex.pages;

import com.semdatex.helper.VisibilityHelper;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchResultsPage implements BasePage {

    private static final String RESULTS_LOCATOR = "#links [data-testid='result']";

    @Autowired
    private VisibilityHelper visibilityHelper;


    public void assertResultsArePresent(){
        visibilityHelper.waitForPresenceOf(By.cssSelector(RESULTS_LOCATOR));
    }
}