Feature: Searches in Home Page

  Scenario: User can do a search from the home page
    Given a user who is on the home page
    When the user types in a search query and presses the search button
    Then results are displayed