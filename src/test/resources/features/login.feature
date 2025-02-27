Feature: login

  Scenario Outline: login with valid credentials
    Given User enter login page
    When User fills in the username field with "<username>" and the password field with "<password>"
    And User clicks on the login button
    Then User connect msg is "<msg>"

    Examples:
      | username | password | msg            |
      | ilan2703 | 123      | Welcome ilan2703 |
