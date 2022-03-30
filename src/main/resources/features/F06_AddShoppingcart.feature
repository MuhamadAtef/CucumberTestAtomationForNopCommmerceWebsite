@TestNow
Feature: F09_AddShoppingCart |  Logged user could add different products to Shopping cart

  Scenario:
    Given  user should login
    When user add First products to Shopping cart
    And assert shopping cart is contained First product
    Then user add second products to Shopping cart
    And assert shopping cart is contained second product

