package com.semdatex.steps;

import com.semdatex.pages.ResultsPage;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class ResultsSteps {

    @Autowired
    private ResultsPage resultsPage;

    @Then("^results are displayed$")
    public void resultsAreDisplayed() {
        resultsPage.assertResultsArePresent();
    }
}
