Feature: Login Success Verification

  Scenario Outline: Login With Valid Credentials

    Given Open Website
    When user enters the username <username>
    And user enters the password <password>
    And user clicks on login button
    Then user should be login successfully <success text>
    Then user will logout from website

 Examples:
    |username|password|success text|
    |130144   |130144@mckinsey   |Select an option|
