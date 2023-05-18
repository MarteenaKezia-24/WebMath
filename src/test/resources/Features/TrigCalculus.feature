Feature: WebMath Trig & Calculus Module

Background:
When User opens WebMath "https://www.webmath.com/"
Then User click on Trig and Calculus

Scenario: Verify Trig & Calculus Page
When User checks any action from drop down
Then User click Go button 
And User click on help typing link

Scenario: Click on Trignometry Expression in Trignometry
When User click on Trignometry Expressions
Then User verify Trignometry expressions page title 
Then User Types Trignometry expression in box
And User clicks on click here to simply button

Scenario: Click on go math in Trignometry Expression
When User click on Trignometry Expressions
Then User verify Trignometry expressions page title 
Then User Types Trignometry expression in box
And User clicks on click here to simply button
Then User Navigates to answer page
And User click on go to math problem

Scenario: Verify page context in Trignometry Expression
When User click on Trignometry Expressions
Then User checks any action from drop down
Then User click Go button
And User click on help typing link
Then User navigate back to Trig & Calculus page

Scenario: Click on Right Triangle in Trignometry
Then  User click on Right Triangle
And User verify Title of Right Triangle page

Scenario: Verify action of right triangle
When User click on Right Triangle
Then User send values for right triangle
And User click on go button
Then User click on go to math problem

Scenario: Verify page context in Right Triangle
When User click on Right Triangle
Then User send values for right triangle
And User click on Clear the form button

Scenario: Verify page context in Right Triangle
When User click on Right Triangle
Then User checks any action from drop down
Then User click Go button
And User click on help typing link
Then User navigate back to Trig & Calculus page