Feature: Add a room or Guest House Functionality

  Scenario Outline: Adding a room or Guest House

    Given Open Website
    When user enters the username <username>
    And user enters the password <password>
    And user clicks on login button
    Then user should be login successfully <login success text>
    Then user should find room option <rooms text>
    When user will select rooms option
    And user will click on next icon
    And user will click on icon of Admin Dashboard
    Then user should see the menu at the side with add room functionality <add room functionality>
    When user will click on Add Rooms
    Then Add GuestHouse page should open <Add GuestHouse Text>
    And user will upload image <image path>
    When user will enters guest house name in primary details <guest house name>
    And user will enters contact number in primary details <contact number>
    And user will enter rooms count <room count>
    And user will enters city name <city name>
    And user will enters address in primary details <address>
    And user will enters sublocality in primary details <sublocality>
    And user will select Amenity
    And user will enters caretaker name in caretaker details <caretaker name>
    And user will enters contact number in caretaker details <caretaker number>
    And user will add display picture <image path>
    #And user will clck on save button
   # Then user should get success message <success message>
    Then user will logout from website

    Examples:
      | username | password        | login success text | rooms text | add room functionality | Add GuestHouse Text | image path                                        | guest house name  | contact number | room count | city name | sublocality    | address              | caretaker name | caretaker number | success message                |
      | 130144   | 130144@mckinsey | Select an option   | Rooms      | Add GuestHouse         | Add GuestHouse      | C:\Users\xeadmin\Desktop\DOF Testing Data\GH1.png | DelhiGuestHoffice | 966565656565   | 2          | Delhi,    | Dilshad Garden | Dilshad Garden Metro | Mr. Amit       | 9632586666       | Guest house added successfully |
