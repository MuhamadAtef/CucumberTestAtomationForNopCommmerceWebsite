@TestNow
Feature: F01 | User Registration
  I want to check that the user can register in our e-commerce website.

  Scenario: user could register with valid data
    Given user is redirected to register page
    When user is registered with valid firstname and lastname and email and password and confirmPassword
    And user press on register button
    Then user register to the system successfully
    And user logout to login page

