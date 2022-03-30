@TestNow
Feature: F03_RestPassword | users could use Reset password functionality

  Scenario: Reset password with valid email
    Given user go to Reset page
    When user reset with valid email as "eng.muhamadatef@gmail.com"
    And user press on Recover button
    Then user rest password successfully
