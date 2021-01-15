Feature: Login

Scenario: Successful Login with the valid credentials 

Given  User launch chrome Browser 
When User opnes the URL "http://13.235.195.93:3003"
And User enters the Email as "10000071" and Password as "System@2022"
And Click on Login Button
Then Page title should be "Bill Hub"
When User click on profile drop-down
Then List of the data get listed out
And click on logout option
Then Page title should be "Bill Hub Login"
And Close the browser





