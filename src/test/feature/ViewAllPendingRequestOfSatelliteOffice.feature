Feature: Accommodation Admin Satellite office Page Verification

  Scenario Outline: upcoming satellite office booking

    Given Open Website
    When user enters the username <username>
    And user enters the password <password>
    And user clicks on login button
    Then user should be login successfully <login success text>
    Then user should find satellite offices option <Satellite Offices text>
    When user will select Satellite Offices option
    And user will click on next icon
    Then user will reach to upcoming satellite Office booking page <Satellite Offices success text>
    Then user will logout from website
    Examples:
      | username | password        | login success text | Satellite Offices text | Satellite Offices success text      |
      | 130144   | 130144@mckinsey | Select an option   | Satellite Offices      | Upcoming Satellite Offices Bookings |
