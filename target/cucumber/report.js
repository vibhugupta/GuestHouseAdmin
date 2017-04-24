$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/feature/AddARoomOrGuestHouse.feature");
formatter.feature({
  "line": 1,
  "name": "Add a room or Guest House Functionality",
  "description": "",
  "id": "add-a-room-or-guest-house-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Adding a room or Guest House",
  "description": "",
  "id": "add-a-room-or-guest-house-functionality;adding-a-room-or-guest-house",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters the username \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters the password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be login successfully \u003clogin success text\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should find room option \u003crooms text\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user will select rooms option",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user will click on next icon",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user will click on icon of Admin Dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should see the menu at the side with add room functionality \u003cadd room functionality\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user will click on Add Rooms",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Add GuestHouse page should open \u003cAdd GuestHouse Text\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user will upload image \u003cimage path\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user will enters guest house name in primary details \u003cguest house name\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user will enters contact number in primary details \u003ccontact number\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user will enter rooms count \u003croom count\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user will enters city name \u003ccity name\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user will enters address in primary details \u003caddress\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user will enters sublocality in primary details \u003csublocality\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user will select Amenity",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user will enters caretaker name in caretaker details \u003ccaretaker name\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user will enters contact number in caretaker details \u003ccaretaker number\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user will add display picture \u003cimage path\u003e",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "#And user will clck on save button"
    },
    {
      "line": 29,
      "value": "# Then user should get success message \u003csuccess message\u003e"
    }
  ],
  "line": 30,
  "name": "user will logout from website",
  "keyword": "Then "
});
formatter.examples({
  "line": 32,
  "name": "",
  "description": "",
  "id": "add-a-room-or-guest-house-functionality;adding-a-room-or-guest-house;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "login success text",
        "rooms text",
        "add room functionality",
        "Add GuestHouse Text",
        "image path",
        "guest house name",
        "contact number",
        "room count",
        "city name",
        "sublocality",
        "address",
        "caretaker name",
        "caretaker number",
        "success message"
      ],
      "line": 33,
      "id": "add-a-room-or-guest-house-functionality;adding-a-room-or-guest-house;;1"
    },
    {
      "cells": [
        "130144",
        "130144@mckinsey",
        "Select an option",
        "Rooms",
        "Add GuestHouse",
        "Add GuestHouse",
        "C:\\Users\\xeadmin\\Desktop\\DOF Testing Data\\GH1.png",
        "DelhiGuestHoffice",
        "966565656565",
        "2",
        "Delhi,",
        "Dilshad Garden",
        "Dilshad Garden Metro",
        "Mr. Amit",
        "9632586666",
        "Guest house added successfully"
      ],
      "line": 34,
      "id": "add-a-room-or-guest-house-functionality;adding-a-room-or-guest-house;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 34,
  "name": "Adding a room or Guest House",
  "description": "",
  "id": "add-a-room-or-guest-house-functionality;adding-a-room-or-guest-house;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters the username 130144",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters the password 130144@mckinsey",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be login successfully Select an option",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should find room option Rooms",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user will select rooms option",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user will click on next icon",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user will click on icon of Admin Dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should see the menu at the side with add room functionality Add GuestHouse",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user will click on Add Rooms",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Add GuestHouse page should open Add GuestHouse",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user will upload image C:\\Users\\xeadmin\\Desktop\\DOF Testing Data\\GH1.png",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user will enters guest house name in primary details DelhiGuestHoffice",
  "matchedColumns": [
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user will enters contact number in primary details 966565656565",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user will enter rooms count 2",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user will enters city name Delhi,",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user will enters address in primary details Dilshad Garden Metro",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user will enters sublocality in primary details Dilshad Garden",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user will select Amenity",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user will enters caretaker name in caretaker details Mr. Amit",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user will enters contact number in caretaker details 9632586666",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user will add display picture C:\\Users\\xeadmin\\Desktop\\DOF Testing Data\\GH1.png",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "#And user will clck on save button"
    },
    {
      "line": 29,
      "value": "# Then user should get success message \u003csuccess message\u003e"
    }
  ],
  "line": 30,
  "name": "user will logout from website",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.open_Website()"
});
formatter.result({
  "duration": 28675181959,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "130144",
      "offset": 25
    }
  ],
  "location": "Login.user_enters_the_username(String)"
});
formatter.result({
  "duration": 108896899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "130144@mckinsey",
      "offset": 25
    }
  ],
  "location": "Login.user_enters_the_password_gupta(String)"
});
formatter.result({
  "duration": 117844045,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 93753280,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Select an option",
      "offset": 34
    }
  ],
  "location": "Login.user_should_be_login_successfully(String)"
});
formatter.result({
  "duration": 10051091755,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rooms",
      "offset": 29
    }
  ],
  "location": "Roomselection.user_should_find_room_option_Rooms(String)"
});
formatter.result({
  "duration": 10047514855,
  "status": "passed"
});
formatter.match({
  "location": "AccommodationAdmin.user_will_select_rooms_option()"
});
formatter.result({
  "duration": 77657470,
  "status": "passed"
});
formatter.match({
  "location": "AdminDashboardMenu.user_will_click_on_next_icon_of_choose_option()"
});
formatter.result({
  "duration": 206330648,
  "status": "passed"
});
formatter.match({
  "location": "AdminDashboardMenu.user_will_click_on_icon_of_Admin_Dashboard()"
});
formatter.result({
  "duration": 5186836155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add GuestHouse",
      "offset": 65
    }
  ],
  "location": "AddRoomGuestHouse.user_should_see_the_menu_at_the_side_with_add_room_functionality_Add_Rooms(String)"
});
formatter.result({
  "duration": 10073160105,
  "status": "passed"
});
formatter.match({
  "location": "AddRoomGuestHouse.user_will_click_on_Add_Rooms()"
});
formatter.result({
  "duration": 183765910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add GuestHouse",
      "offset": 32
    }
  ],
  "location": "AddRoomGuestHouse.add_GuestHouse_page_should_openAdd_GuestHouse(String)"
});
formatter.result({
  "duration": 10059254659,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Users\\xeadmin\\Desktop\\DOF Testing Data\\GH1.png",
      "offset": 23
    }
  ],
  "location": "AddRoomGuestHouse.user_will_upload_image(String)"
});
formatter.result({
  "duration": 1172163733,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DelhiGuestHoffice",
      "offset": 53
    }
  ],
  "location": "AddRoomGuestHouse.user_will_enters_guest_house_name_in_primary_details_guest_house_name(String)"
});
formatter.result({
  "duration": 299117276,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "966565656565",
      "offset": 51
    }
  ],
  "location": "AddRoomGuestHouse.user_will_enters_contact_number_in_primary_details_contact_number(String)"
});
formatter.result({
  "duration": 243957364,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 28
    }
  ],
  "location": "AddRoomGuestHouse.user_will_enter_rooms_count(String)"
});
formatter.result({
  "duration": 86972708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Delhi,",
      "offset": 27
    }
  ],
  "location": "AddRoomGuestHouse.user_will_enters_city_name(String)"
});
formatter.result({
  "duration": 4367530885,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dilshad Garden Metro",
      "offset": 44
    }
  ],
  "location": "AddRoomGuestHouse.user_will_enters_address_in_primary_details_address(String)"
});
formatter.result({
  "duration": 329345732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dilshad Garden",
      "offset": 48
    }
  ],
  "location": "AddRoomGuestHouse.user_will_enters_sublocality_in_primary_details(String)"
});
formatter.result({
  "duration": 253854369,
  "status": "passed"
});
formatter.match({
  "location": "AddRoomGuestHouse.user_will_select_Amenity()"
});
formatter.result({
  "duration": 108327265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr. Amit",
      "offset": 53
    }
  ],
  "location": "AddRoomGuestHouse.user_will_enters_caretaker_name_in_caretaker_details_caretaker_name(String)"
});
formatter.result({
  "duration": 175441117,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9632586666",
      "offset": 53
    }
  ],
  "location": "AddRoomGuestHouse.user_will_enters_contact_number_in_caretaker_details_caretaker_number(String)"
});
formatter.result({
  "duration": 198338027,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Users\\xeadmin\\Desktop\\DOF Testing Data\\GH1.png",
      "offset": 30
    }
  ],
  "location": "AddRoomGuestHouse.user_will_add_display_picture(String)"
});
formatter.result({
  "duration": 1100748457,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_will_logout_from_website()"
});
formatter.result({
  "duration": 989419061,
  "status": "passed"
});
});