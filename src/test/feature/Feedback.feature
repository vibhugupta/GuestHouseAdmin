Feature: Feedback Functionality

  Scenario Outline: feedback of guesthouses

    Given Open Website
    When user enters the username <username>
    And user enters the password <password>
    And user clicks on login button
    Then user should be login successfully <login success text>
    Then user should find room option <rooms text>
    When user will select rooms option
    And user will click on next icon
    And user will click on icon of Admin Dashboard
    Then user should see the menu at the side with feedback functionality <Feedback functionality>
    When user will click on feedback
    Then user will verify the feedback page <feedback>
    Then user will logout from website

    Examples:
      |username|password|login success text|rooms text|Feedback functionality|feedback|
      |130144   |130144@mckinsey  |Select an option|Rooms|Feedback|Feedback |