@TestNow
Feature: F06_Select_Categories |  Logged user could select any Categories


  Scenario: user could select different Categories
    Given  Logged user in home page
    When User  has Selected Categories and Hover to Sub_Categories
    Then Click on sub categories successfully
