@Cart
Feature: Cart
  As a user
  I want to see item to buy
  So i can see list item to buy

  Scenario: I click cart with no item to buy
    Given I on the order page
    When I click cart button
    Then I see item to buy

#  Scenario: I click cart with item to buy
#    Given I on the order page with item
#    When I click cart button with item
#    Then I see list item to buy