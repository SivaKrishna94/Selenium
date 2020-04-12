@OrangeHRM
Feature: OrangeHRM Website
@TC01_OrangeHRM
Scenario Outline:
Login to the OrangeHRM website
Given The user launch the given application 
When The user enters "<username>" and "<password>"
Then The user clicks on the login button and user will nagivated to the next page
Then The user will logged out
Examples:
|		username		|		password		|
|		Admin				|		admin123		|
@TC02_OrangeHRM
Scenario:
The user will assign leave
Given The user will opens browser and opens OrangeHRM site
When The user will login to the website  
And The user will enters details of leave
Then The user will assign leave 

@TC03_OrangeHRM
Scenario:
Add a new workshift and add members into that shift
Given The user opens browser and opens OrangeHRM website
When The user login to the site  
Then The user will add a new work shift
Then The user will add members into the shift and save and delete the shift
@TC04_OrangeHRM
Scenario: seach for the employee using details
Given  The user launches browser and login to the OrangeHRM website
When User enters Employee details to search
Then User will open the employee profile and change password
@TC05_OrangeHRM
Scenario:
Add a new Paygrade and delete it
Given The user opens browser and opens OrangeHRM
When The user login to website  
And The user will add a new Paygrade
Then The user will delete the Paygrade

@TC06_OrangeHRM
Scenario:
The user will add a new skill
Given user launch the given browser
When the user login to the home page
Then the user will add a new skill
Then the user will delete the skill
