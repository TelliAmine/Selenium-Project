@tag
Feature: Search of nation using google
  I want to search nation using google

  @tag1
  Scenario: search nation
    Given access driver
    And access browser "https://www.google.com/"
    When input name of nation "tunisia"
    And click button enter
    Then I check that the result contains the word  "tunisia"
