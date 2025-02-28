Feature: login

#  Scenario: Verify login page
#    Given User enter login page
#    Then User sees the login page

  Scenario Outline: login with valid credentials
    Given User enter login page
    When User fills in the username field with "<username>" and the password field with "<password>"
    And User clicks on the login button
    Then User connect msg is "<msg>"

    Examples:
      | username | password | msg              |
      | ilan2703 | 123      | Welcome ilan2703 |

  Scenario Outline: login with non valid password
    Given User enter login page
    When User fills in the username field with "<username>" and the password field with "<password>"
    And User clicks on the login button
    Then Show error is "<msg>"

    Examples:
      | username | password | msg             |
      | ilan2703 | 12345    | Wrong password. |

  Scenario Outline: login with non valid user
    Given User enter login page
    When User fills in the username field with "<username>" and the password field with "<password>"
    And User clicks on the login button
    Then Show error is "<msg>"

    Examples:
      | username       | password | msg                  |
      | ilan2703413245 | 123      | User does not exist. |
