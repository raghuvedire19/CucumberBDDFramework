Feature: Create a new company

@RegressionTest
Scenario Outline: User wants to create a new company

Given User is present on Login page
When Title of page is Free CRM login
Then User enter "naveenk" and "test@123"
And User clicks on Submit button
And User is on Home page
And User onmouseover Company menu and select New Company
Then User enter New company details: <CompanyName> <Industry> <AnnualRevenue> <Employees> <Status> <Phone> <AddressTitle> <Address> <ZipCode> <Tags>
And User submit the page
And User logout

Examples:

| CompanyName| Industry | AnnualRevenue | Employees | Status | Phone | AddressTitle | Address | ZipCode | Tags | 
|"TestCompany"|"Software"|"50000000"|"3000"|"Active"|"876.987.9879"|"Home"|"1700 W Michigan Ave,  MI"|"49202"|"New jobs"|
