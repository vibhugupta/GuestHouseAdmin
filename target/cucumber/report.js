$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Success Verification",
  "description": "",
  "id": "login-success-verification",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login With Valid Credentials",
  "description": "",
  "id": "login-success-verification;login-with-valid-credentials",
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
  "name": "user should be login successfully \u003csuccess text\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user will logout from website",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-success-verification;login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "success text"
      ],
      "line": 13,
      "id": "login-success-verification;login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "130144",
        "130144@mckinsey",
        "Select an option"
      ],
      "line": 14,
      "id": "login-success-verification;login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Login With Valid Credentials",
  "description": "",
  "id": "login-success-verification;login-with-valid-credentials;;2",
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
  "name": "user will logout from website",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.open_Website()"
});
formatter.result({
  "duration": 27135182949,
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
  "duration": 117604933,
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
  "duration": 129337295,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 107607607,
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
  "duration": 10215627163,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_will_logout_from_website()"
});
formatter.result({
  "duration": 2123997364,
  "status": "passed"
});
});