Feature: Login Feature
  This feature deals with the login functionality of the application

  Scenario: Login with correct name and password
    Given I am logged to the application with user name "Admin" and password "admin"
    Then I should see the home page