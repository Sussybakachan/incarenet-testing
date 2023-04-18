package com.semdatex.steps;

import com.semdatex.pages.SearchResultsPage;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class SearchResultsSteps {

    @Autowired
    private SearchResultsPage searchResultsPage;

    @Then("^results are displayed$")
    public void resultsAreDisplayed() {
        searchResultsPage.assertResultsArePresent();
    }
}
