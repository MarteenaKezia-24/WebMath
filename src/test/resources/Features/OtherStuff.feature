Feature: WebMath Other Stuff Module

Background:
When User opens WebMath "https://www.webmath.com/"
Then User click on Other Stuff

Scenario: Other Stuff page title
Then User verify Other Stuff page title

Scenario: Verify Other stuff Page
When User checks any action from drop down
Then User click Go button 
And User click on help typing link

Scenario: Click on Basic Math in practice math
When User click on basic math
Then User verify basic math page title

Scenario: Select type of Basic math
When User select type of math problem
Then User select type of numbers
And User click on do it

Scenario: pass values in practice math
When User click on basic math
Then User select type of math problem
Then User select type of numbers
And User click on do it
Then User Navigate to answer page
And User click go back to math page

Scenario: check details on Basic Math in practice math
When User click on basic math
Then User checks any action from drop down
Then User click Go button 
And User click on help typing link

Scenario: Click on Average in Handling raw numbers
Then  User click on Average




