Feature: fearute to test goolge search functionnality

  Scenario: Validate goole search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
