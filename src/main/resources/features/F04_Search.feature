@TestNow
Feature: F02_Search | Search for existing products by names


  Scenario: user could search for existing products by names
    Given user is clicked on search field
    When user is entered existing product name
    And user is clicked on search button
    Then user could find relative results
