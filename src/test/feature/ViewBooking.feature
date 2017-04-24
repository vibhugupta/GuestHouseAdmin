Feature: View Bookings Functionality

  Scenario Outline: View Bookings by ID

    Given Open Website
    When user enters the username <username>
    And user enters the password <password>
    And user clicks on login button
    Then user should be login successfully <login success text>
    Then user should find room option <rooms text>
    When user will select rooms option
    And user will click on next icon
    And user will click on icon of Admin Dashboard
    Then user should see the menu at the side with view bookings functionality <view booking functionality>
    When user will click on view bookings
    Then user will verify the result with ID <ID>
    Then user will logout from website
    Examples:
      | username | password        | login success text | rooms text | view booking functionality | ID |
      | 130144   | 130144@mckinsey | Select an option   | Rooms      | View Bookings              | ID |

  Scenario Outline: View Bookings by location

    Given Open Website
    When user enters the username <username>
    And user enters the password <password>
    And user clicks on login button
    Then user should be login successfully <login success text>
    Then user should find room option <rooms text>
    When user will select rooms option
    And user will click on next icon
    And user will click on icon of Admin Dashboard
    Then user should see the menu at the side with view bookings functionality <view booking functionality>
    When user will click on view bookings
    And user will click on location
    Then user will verify the result with location <loc>
    Then user will logout from website
    Examples:
      | username | password        | login success text | rooms text | view booking functionality | loc      |
      | 130144   | 130144@mckinsey | Select an option   | Rooms      | View Bookings              | LOCATION |