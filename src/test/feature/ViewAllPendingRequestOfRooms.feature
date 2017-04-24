Feature: Accommodation Admin Page Verification

  Scenario Outline: upcoming guesthouse booking

    Given Open Website
    When user enters the username <username>
    And user enters the password <password>
    And user clicks on login button
    Then user should be login successfully <login success text>
    Then user should find room option <rooms text>
    When user will select rooms option
    And user will click on next icon
    Then user will reach to upcoming guesthouse booking page <room success text>
    Then user will logout from website
    Examples:
      | username | password        | login success text | rooms text | room success text       |
      | 130144   | 130144@mckinsey | Select an option   | Rooms      | Upcoming Hotel Bookings |
