Feature: Reports Functionality

  Scenario Outline: Reports to an excel format

    Given Open Website
    When user enters the username <username>
    And user enters the password <password>
    And user clicks on login button
    Then user should be login successfully <login success text>
    Then user should find room option <rooms text>
    When user will select rooms option
    And user will click on next icon
    And user will click on icon of Admin Dashboard
    Then user should see the menu at the side with reports functionality <Reports functionality>
    When user will click on reports
    Then user will verify the reports page <reports>
    Then user will logout from website
    Examples:
      |username|password|login success text|rooms text|Reports functionality|reports|
      |130144   |130144@mckinsey   |Select an option|Rooms|Reports|Reports|