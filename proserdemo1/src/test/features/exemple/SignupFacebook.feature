
@tag
Feature: Signup Facebook
  I want to use this template for my feature file

  @tag1
  Scenario: Sign up Facebook 
    Given Access driver
    And Access browser 
    When I click signup button  
    And I input firstname "mohamed"
    And I input name  "telli"
    And I input email  "mohamed@gmail.com"
    And I input email verified "mohamed@gmail.com"
    And I input password "amine123!"
    And I select day "19"
    And I select month "6"
    And I select year "1993"
    And I select sex "Homme"
    And click signup button 
    Then Facebook Acount created 
  

 