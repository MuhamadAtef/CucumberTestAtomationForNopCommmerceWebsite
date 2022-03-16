@smoke
Feature: F01_Login | users could use login functionality to open their accounts

  Scenario: user could login with valid email and password
    Given user go to login page
    When user login with "mohammedatef660@gmail.com" and "test@123"
    Then user login to the system successfully
    And user should navigate to homePage
