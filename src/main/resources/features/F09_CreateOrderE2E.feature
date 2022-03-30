@smoke12
Feature: F12_CreateOrderE2E | Create successful Order


  Scenario: User Can Create Successful Order
    Given User Go to Shopping cart
    When user is entered Data to create order
    Then assert user created order successful

