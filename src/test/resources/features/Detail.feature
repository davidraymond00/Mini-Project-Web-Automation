@Detail
Feature: Detail
  As a user
  I want to see information
  So i can see detail information

  Scenario: Click detail PS 5 star 5
    Given I on the dashboard page
    When I click detail product PS 5 star 5
    Then I go to detail information

  Scenario: Click detail PS 5 star 3
    Given I on the dashboard page
    When I click detail product PS 5 star 3
    Then I go to detail information

  Scenario: Click detail PS 5 no star
    Given I on the dashboard page
    When I click detail product PS 5 no star
    Then I go to detail information

  Scenario: Click detail Samsung PS 5 star 5
    Given I on the dashboard page
    When I click detail product Samsung PS 5 star 5
    Then I go to detail information
