@TestNow
Feature: F10_AddWishListCart | Logged user could add products to Wishlist


  Scenario:
    Given user have to login
    When user add First products to Wishlist cart
    And user add Second products to Wishlist cart
    Then assert Wishlist cart have two product

