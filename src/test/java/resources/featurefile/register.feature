@smoke
Feature: Register Test
  As a User I should able to Register successfully

  Scenario: User should able to Navigate To RegisterPage Successfully
    Given I am on homepage
    When I click on RegisterLink
    Then I should see "REGISTER" text

  Scenario: verify that FirstName LastName Email Password And Confirm Password Fields are Mandatory
    Given I am on homepage
    When I click on RegisterLink
    And I click on Register button
    And I should see error message "First name is required." in firstName field
    And I should see  error message"Last name is required." in lastName field
    And I should see error message"Email is required." in email field
    And I should see error message"Password is required." in password field
    And I should see error message"Password is required." in confirm password field


  Scenario: User should able to Register successfully
    Given I am on homepage
    When I click on RegisterLink
    And I click on female button
    And I enter FirstName "Pooja"
    And I enter LastName"Patel"
    And I select"10" from Day
    And I select"6" from Month
    And I select"1984" from Year
    And I enter email"Prime45678@gmail.com"
    And I enter password"Prime45678"
    And I enter confirmpassword"Prime45678"
    And I click on Register button
    Then I should see the message Your registration completed

