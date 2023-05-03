Feature: OrangeHRM Recruitment Module

Background:
When User opens OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And User enter Username as "Admin" and Password as "admin123"
Then User Click on Login button 
Then Click on Recruitment module

Scenario: Select all options in Candidates page
When Select Candidates field
Then Select any one option from Job Title
Then Select any one option from Vacany
And Select any one option from Status
When Enter Candidate name in Candidated field 
Then Select date of application from calender
Then Select method of applcation
And Click on Search button
Then User Close the Browser

@SmokeTest
Scenario: Click on Reset button in Candidates page
When Select Candidates field
Then Select any one option from Job Title
Then Select any one option from Vacany
And Select any one option from Status
When Enter Candidate name in Candidated field 
Then Select date of application from calender
Then Select method of applcation
And Click on reset button
Then User Close the Browser

Scenario: Click on Add button icon in candidates page
When Select Candidates field
Then Click on add button

Scenario: Enter required fields in Add candidates window and save
When Select Candidates field
And Click on add button 
Then Enter FirstName MiddleName LastName
Then Enter email id
Then Enter contact Number
And Click on candidate save button
Then User Close the Browser

Scenario: Enter required fields in Add candidates window and cancel
When Select Candidates field
And Click on add button 
Then Enter FirstName MiddleName LastName
Then Enter email id
Then Enter contact Number
And Click on candidate cancel button
Then User Close the Browser

Scenario: Select all options in Vacancies page
When Click on Vacancies module
Then User Close the Browser
