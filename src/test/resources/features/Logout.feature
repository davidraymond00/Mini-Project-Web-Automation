@Logout
Feature: Logout
  As a user
  I want to lo logout
  So i back to login page

  Scenario: I click logout button
    Given I am on the login page
    When I input valid email
    And I input valid password
    And I click login button
    And I go to dashboardd
    And I click human button
    And I click logout button
    Then I am on the login page