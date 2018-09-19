Feature: User want to update job sites daily

@FunctionalTest
Scenario: User update profile

Given User is on Monster website
When User enters "vedire.raghu@gmail.com" and "Raghu@123"
And User click on Login button
Then User is on home page
Then User Click on Profile button
Then Select Resumes/Cover Letters
Then Click on Self Resume link
Then Click on Settings button
Then Click on Update Name button

