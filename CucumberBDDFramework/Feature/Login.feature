Feature: Free CRM Login feature

@SmokeTest @RegressionTest
Scenario: User login to the website and logout

Given User is present on Login page
When Title of page is Free CRM login
Then User enter "naveenk" and "test@123"
And User clicks on Submit button
And User is on Home page
And User logout


#Scenario Outline: Verify login with different inputs 
#
#Given User is present on Login page
#When Title of page is Free CRM login
#Then User enter <username> and <password>
#And User clicks on Submit button
#And User is on Home page
#And User logout
#And Close Browser


#Examples:
#| username | password |
#| "test1" | "test@123" |
#| "naveenk" | "test@123" |
#| "12345" | "test@123" |


