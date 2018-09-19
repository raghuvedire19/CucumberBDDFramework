$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/JobSiteUpdate.feature");
formatter.feature({
  "line": 1,
  "name": "User want to update job sites daily",
  "description": "",
  "id": "user-want-to-update-job-sites-daily",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User update profile in Monster websie",
  "description": "",
  "id": "user-want-to-update-job-sites-daily;user-update-profile-in-monster-websie",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Monster: User is on Monster website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Monster: User enters \"vedire.raghu@gmail.com\" and \"Raghu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Monster: User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Monster: User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Monster: User Click on Profile button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Monster: Select Resumes/Cover Letters",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Monster: Click on Self Resume link",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Monster: Click on Settings button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Monster: Click on Update Name button",
  "keyword": "Then "
});
formatter.match({
  "location": "Monster.monster_User_is_on_Monster_website()"
});
formatter.result({
  "duration": 16046015500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vedire.raghu@gmail.com",
      "offset": 22
    },
    {
      "val": "Raghu@123",
      "offset": 51
    }
  ],
  "location": "Monster.monster_User_enters_username_and_Password(String,String)"
});
formatter.result({
  "duration": 626931800,
  "status": "passed"
});
formatter.match({
  "location": "Monster.monster_User_click_on_Login_button()"
});
formatter.result({
  "duration": 9339558500,
  "status": "passed"
});
formatter.match({
  "location": "Monster.monster_User_is_on_home_page()"
});
formatter.result({
  "duration": 21794900,
  "status": "passed"
});
formatter.match({
  "location": "Monster.monster_User_Click_on_Profile_button()"
});
formatter.result({
  "duration": 330650900,
  "status": "passed"
});
formatter.match({
  "location": "Monster.monster_Select_Resumes_Cover_Letters()"
});
formatter.result({
  "duration": 4057549400,
  "status": "passed"
});
formatter.match({
  "location": "Monster.monster_Click_on_Self_Resume_link()"
});
formatter.result({
  "duration": 3947446700,
  "status": "passed"
});
formatter.match({
  "location": "Monster.monster_Click_on_Settings_button()"
});
formatter.result({
  "duration": 3458564300,
  "status": "passed"
});
formatter.match({
  "location": "Monster.monster_Click_on_Update_Name_button()"
});
formatter.result({
  "duration": 3869773000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User update profile in Dice websie",
  "description": "",
  "id": "user-want-to-update-job-sites-daily;user-update-profile-in-dice-websie",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Dice: User is on Dice website",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Dice: User enters \"vedire.raghu@gmail.com\" and \"Raghu@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Dice: User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Dice: User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Dice: User Click on Profile button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Dice: UnSelect and Select Willing to Travel option",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Dice: Click on Done button",
  "keyword": "Then "
});
formatter.match({
  "location": "Dice.dice_User_is_on_Dice_website()"
});
formatter.result({
  "duration": 9765807600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vedire.raghu@gmail.com",
      "offset": 19
    },
    {
      "val": "Raghu@123",
      "offset": 48
    }
  ],
  "location": "Dice.dice_User_enters_username_and_Password(String,String)"
});
formatter.result({
  "duration": 1178701400,
  "status": "passed"
});
formatter.match({
  "location": "Dice.dice_User_click_on_Login_button()"
});
formatter.result({
  "duration": 17403057000,
  "status": "passed"
});
formatter.match({
  "location": "Dice.dice_User_is_on_home_page()"
});
formatter.result({
  "duration": 24037700,
  "status": "passed"
});
formatter.match({
  "location": "Dice.dice_User_Click_on_Profile_button()"
});
formatter.result({
  "duration": 3001027100,
  "status": "passed"
});
formatter.match({
  "location": "Dice.dice_UnSelect_and_Select_Willing_to_Travel_option()"
});
formatter.result({
  "duration": 2249297000,
  "status": "passed"
});
formatter.match({
  "location": "Dice.dice_Click_on_Done_button()"
});
formatter.result({
  "duration": 852717600,
  "status": "passed"
});
});