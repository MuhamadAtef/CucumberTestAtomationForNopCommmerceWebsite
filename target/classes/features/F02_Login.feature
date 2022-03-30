@TestNow
Feature: F01_Login | users could use login functionality to open their accounts

  Scenario: user could login with valid email and password
    Given user go to login page
    When user login with Email "eng.muhamadatef@gmail.com" and password "P@ssw0rd" and click on login
    Then user login to the system successfully


 Scenario Outline: user login with invalid credentials
    Given user go to login page
    When user login with Email "<Email>" and password "<password>" and click on login
    Then user couldn't login and Error msg is appeared

   Examples:
   |           Email             |  password |
   |  eng.muhamadatef@gmail.com  |  wrong    |
   |      wrong@gmail.com        | P@ssw0rd  |
   |      wrong@gmail.com        |   wrong   |
