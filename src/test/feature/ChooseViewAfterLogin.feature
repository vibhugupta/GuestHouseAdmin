Feature: separate views for rooms and satellite offices

  Scenario Outline: Rooms and Satellite offices option Verifications

    Given Open Website
    When user enters the username <username>
    And user enters the password <password>
    And user clicks on login button
    Then user should be login successfully <success text>
    Then user should find room option <rooms text>
    Then user should find satellite offices option <satellite text>
    Then user will logout from website
    Examples:
      |username|password|success text|rooms text|satellite text|
      |130144   |130144@mckinsey   |Select an option|Rooms|Satellite Offices|
