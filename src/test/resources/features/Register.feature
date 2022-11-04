@Register
Feature: Register
  As a new user
  I want to regis
  So i can register here

  Scenario: Register with null nama null email and null password
    Given I am on the register page
    When I am input null nama
    And I am input null email
    And I am input null password
    And I am click register button
    Then I will get email is required

  Scenario: Register with valid nama null email and null password
    Given I am on the register page
    When I am input valid nama
    And I am input null email
    And I input null password
    And I am click register button
    Then I will get email is required

  Scenario: Register with null nama valid email and null password
    Given I am on the register page
    When I am input null nama
    And I am input valid email
    And I input null password
    And I am click register button
    Then I will get email is required

  Scenario: Register with null nama null email and valid password
    Given I am on the register page
    When I am input null nama
    And I am input null email
    And I am input valid password
    And I am click register button
    Then I will get email is required

  Scenario: Register with valid nama valid email and null password
    Given I am on the register page
    When I am input valid nama
    And I am input valid email
    And I am input null password
    And I am click register button
    Then I will get email is required

  Scenario: Register with valid nama null email and valid password
    Given I am on the register page
    When I am input valid nama
    And I am input null email
    And I input valid password
    And I am click register button
    Then I will get email is required

  Scenario: Register with null nama valid email and valid password
    Given I am on the register page
    When I am input null nama
    And I am input valid email
    And I am input valid password
    And I am click register button
    Then I will get email is required

  Scenario: Register with null nama ready email and null password
    Given I am on the register page
    When I am input null nama
    And I am input ready email
    And I am input null password
    And I am click register button
    Then I will get email is required

  Scenario: Register with valid nama ready email and null password
    Given I am on the register page
    When I am input valid nama
    And I am input ready email
    And I am input null password
    And I am click register button
    Then I will get email is required

  Scenario: Register with valid nama ready email and valid password
    Given I am on the register page
    When I am input valid nama
    And I am input ready email
    And I am input valid password
    And I am click register button
    Then I will get email is required

  Scenario: Register with valid nama ready email and ready password
    Given I am on the register page
    When I am input valid nama
    And I am input ready email
    And I am input ready password
    And I am click register button
    Then I will get email is required

  Scenario: Register with valid nama valid email and valid password
    Given I am on the register page
    When I am input valid nama
    And I am input validd email
    And I am input valid password
    And I am click register button
    Then i will go to login page
