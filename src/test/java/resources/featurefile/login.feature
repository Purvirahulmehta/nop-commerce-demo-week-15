@smoke
Feature: Login Test
  As user I want to login into nop commerce website


  Scenario: User should navigate to login page suceessfully
    Given  I am on homepage
    When  I click on login link
    Then  I should see Message "Welcome, Please Sign In!"

  Scenario: Verrify the error message with invalid credentials
    Given  I am on homepage
    When  I click on login link
    And I enter email "1234"
    And I enter password "222"
    And I click on login button
    Then I should see error message

  Scenario:  Verrify that user Should LogIn SuccessFully With Valid Credentials.
    Given I am on homepage
    When I click on login link
    And  I enter email "prime4555@gmail.com"
    And  I enter password "Prime456"
    And  I click on login button
    Then I should see LogOut

  Scenario: Verrify that user should LogOut SucessFull
    Given I am on homepage
    When  I click on login link
    And I enter email "prime4555@gmail.com"
    And I enter password "Prime456"
    And I click on login button
    And  I click on logOut link
    Then I should see login






