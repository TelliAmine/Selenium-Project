@tag
Feature: login with in orangeHm

  @tag2
  Scenario Outline: Authentiffication cas non passant
    Given Access to driver
    Given Access to url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When I input the username  for the "<username>"
    When I input the password  for the "<password>"
    When I click the loginbutton
    Then I verify the  "<message>"

    Examples: 
      | username | password | message             |
      | telli    |     1235 | Invalid credentials |
      | hello    | welcome  | Invalid credentials |
