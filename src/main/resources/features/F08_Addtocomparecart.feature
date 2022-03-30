@smoke12
Feature: F11_AddToCompareCart | Logged user could add products to compare list


  Scenario: could add any products to compare list
    Given user must be login
    When user add First products to compare cart
    And user add second products to compare cart
    Then assert compare cart have two product

