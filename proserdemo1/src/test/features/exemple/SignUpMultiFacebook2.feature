@tag
Feature: Sign Up Facebook
  I want to use this template for my feature file

  @tag2
  Scenario Outline: SignUp Facebook with multiple users
    Given Access driver
    And Access browser ""
    When I click signup button
    And I input firstname "<firstname>"
    And I input name  "<name>"
    And I input email  "<email>"
    And I input email verified 
    And I input password "<password>"
    And I select day "<day>"
    And I select month "<month>"
    And I select year "<year>"
    And I select sex "<sex>"
    And click signup button
    Then verify account  Facebook  created 

    Examples: 
      | firstname | name   | email              | password  | day | month | year | sex   |
      | amine     | telli  | medamine@gmail.com | 123amine! |  19 |     6 | 1993 | homme |
      | rania     | dannou | rania@gmail.com    | 123rania! |  19 |     6 | 1997 | femme |
