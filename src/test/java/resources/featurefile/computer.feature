@smoke
Feature: Computer Test

  Scenario: User should navigate to login page suceessfully
    Given  I am on homepage
    When  I click on computer link
    Then  I should be see "Computers" text

  Scenario: User should navigate To DesktopsPage Successfully
    Given I am on homepage
    When I click on computer link
    And I click on desktop link
    Then I should see "Desktops"desktops text

  Scenario Outline:  verify that user should build you own computer and add them to cart successfully
    Given I am on homePage
    When I click on Computer tab
    And I click Desktops link
    And I click on product name "Build your own computer"
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on "ADD TO CART" Button
    Then I should see the message "The product has been added to your shopping cart"
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |


