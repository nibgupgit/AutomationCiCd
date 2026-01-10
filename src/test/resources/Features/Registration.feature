# This feature covers new user registration scenarios for ParaBank

Feature: Verify user registration flow

  Background:
    Given Parabank Application is Launched
    And Login Page is displayed to the user

  Scenario: Complete registration of a new user
    Given I navigate to the registration page
    When I provide valid registration details
      | firstName       | John          |
      | lastName        | Doe           |
      | address         | 123 Main St   |
      | city            | Anytown       |
      | state           | NY            |
      | zipCode         | 12345         |
      | phone           | 555-1234      |
      | ssn             | 123-45-6789   |
      | username        | johndoe123    |
      | password        | P@ssw0rd      |
      | confirmPassword | P@ssw0rd      |
    And I submit the registration form
    Then I should see a registration confirmation message
    And I should be able to login with the new credentials

  # Additional scenarios (optional) can be added below, e.g.:
  # Scenario: Registration with missing required fields
  # Scenario: Registration with already taken username

