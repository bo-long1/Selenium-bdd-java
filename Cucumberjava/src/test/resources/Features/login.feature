#Author
#Date
#Description
@SmokeFeature
Feature: feature to test login functionality
	@smoketest
  Scenario: Check login is successfully with valid credentials
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then user is navigated to the home page
