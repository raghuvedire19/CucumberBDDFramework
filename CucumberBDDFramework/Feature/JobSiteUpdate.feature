Feature: User want to update job sites daily

@FunctionalTest
Scenario: User update profile in Monster websie

Given Monster: User is on Monster website
When Monster: User enters "vedire.raghu@gmail.com" and "Raghu@123"
And Monster: User click on Login button
Then Monster: User is on home page
Then Monster: User Click on Profile button
Then Monster: Select Resumes/Cover Letters
Then Monster: Click on Self Resume link
Then Monster: Click on Settings button
Then Monster: Click on Update Name button

@FunctionalTest
Scenario: User update profile in Dice websie

Given Dice: User is on Dice website
When Dice: User enters "vedire.raghu@gmail.com" and "Raghu@123"
And Dice: User click on Login button
Then Dice: User is on home page
Then Dice: User Click on Profile button
Then Dice: UnSelect and Select Willing to Travel option
Then Dice: Click on Done button
