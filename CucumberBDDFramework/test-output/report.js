$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User login to the website and logout",
  "description": "",
  "id": "free-crm-login-feature;user-login-to-the-website-and-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    },
    {
      "line": 3,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is present on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of page is Free CRM login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter \"naveenk\" and \"test@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User is on Home page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User logout",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_is_present_on_Login_page()"
});
formatter.result({
  "duration": 11952254000,
  "status": "passed"
});
formatter.match({
  "location": "Login.title_of_page_is_Free_CRM_login()"
});
formatter.result({
  "duration": 11230400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 12
    },
    {
      "val": "test@123",
      "offset": 26
    }
  ],
  "location": "Login.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 500580800,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_Submit_button()"
});
formatter.result({
  "duration": 10470008800,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_is_on_Home_page()"
});
formatter.result({
  "duration": 8808900,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_logout()"
});
formatter.result({
  "duration": 1305815700,
  "status": "passed"
});
});