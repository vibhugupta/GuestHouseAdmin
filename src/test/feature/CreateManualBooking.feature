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
    Then user should see the menu at the side with create manual booking functionality <create manual booking functionality>
    When user will click on create manual bookings
    Then user will verify the result with create manual <create manual booking label>
    And user will enter charge code on create manual booking page <charge code>
    And user will enter FMNO on create manual booking page <FMNO>
   # And user will enter Check In Date on create manual booking page <Check In Month>, <Check In Date>
   # And user will enter Check Out Date on create manual booking page <Check Out Month>, <Check Out Date>
   # And user will enter Check In Time on create manual booking page <Check In Time>
    And user will select city on create manual booking page <city>
    And user will enter nearest location on create manual booking page <nearest location>
    And user will click on show available guest houses
    Then list of available guesthouses page should open <List Of Available Guest houses page>
    When user will click on book button
    Then user will logout from website
    Examples:
      | username | password        | login success text | rooms text | create manual booking functionality | create manual booking label | charge code | FMNO   | Check In Month | Check In Date | Check Out Month | Check Out Date | Check In Time | city      | nearest location        | List Of Available Guest houses page |
      | 130144   | 130144@mckinsey | Select an option   | Rooms      | Create Manual Booking               | Create Manual Bookings      | AB&123      | 130144 | March 2017     | 25            | March 2017      | 26             | 0245AM        | New Delhi | New Delhi, Delhi, India | List Of Available Guest houses      |