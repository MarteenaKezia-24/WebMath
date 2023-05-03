Feature: OrangeHRM User Account

Background:
When User opens OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And User enter Username as "Admin" and Password as "admin123"
Then User Click on Login button 
Then Click on User Account

Scenario: Click on About module in User Account menu
Then Select About module on user account menu
And Click on dialogue close icon
And User Close the Browser


Scenario: Click on Support module in User Account menu
Then Select Support module on user account menu
And Go back to OrangeHRM home page
And User Close the Browser

Scenario: Click on Change Password module on User Account menu and cancel button
When Select Change password module on user account menu
Then Enter Current password
Then Enter Password
And Enter Confirm password
Then Click on cancel button
And User Close the Browser

Scenario: Click on Change Password module on User Account menu and save button
When Select Change password module on user account menu 
Then Enter Current password
Then Enter Password
And Enter Confirm password
Then Click on save button
And Go back to OrangeHRM home page

Scenario: Click on Logout module in User Account menu
Then Click on Logout module"
