
Feature: Login
  Scenario: Login page should be visible
    Given I launch the mobile application
    When I am on the Welcome Screen
    And I click the Login button
    Then Login Page should be visible

  Scenario: Navigate to Register Page on Signup Click
    Given I launch the mobile application
    When I am on the Welcome Screen
    And I click the Register button
    Then Register Page should be visible


  Scenario: Successfully able to login with Google
    Given I launch the mobile application
    When I am on the Welcome Screen
    And I click on the "Connect with Google" icon
    Then the user should be successfully logged in

  Scenario: Instagram Login Page should be appear
    Given I launch the mobile application
    When I am on the Welcome Screen
    And I click on the "Connect with Instagram" icon
    Then user should be able to see the instagram login page

  Scenario: Navigate to Register Page on Register_Now link click
    Given I launch the mobile application
    When I am on the Welcome Screen
    And I click the Register Now link
    Then Register Page should be visible

  @task
  Scenario: Successfully able to login with valid details
    Given I launch the mobile application
    When I am on the Welcome Screen
    And I click the Register button
    Then Register Page should be visible
    When I enter your name field
    And I enter a valid email address
    And I click the selectCountry Dropdown
    Then Search Country page should be visible
    When I search a country name
    Then The searched country should be listed
    When I click searched country
    Then Expected country code should visible
    When I enter a valid password
    And I check Term and Conditions
    And I click on Register button
    Then User should proceed to otp screen


