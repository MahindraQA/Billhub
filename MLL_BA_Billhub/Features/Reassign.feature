Feature: Reassign Memo from Acknowledge

Scenario: Successful Reassign  Memo with the valid credentials 

Given  User launch chrome Browser 
When User opnes the URL "http://13.235.195.93:3003"
And User enters the Email as "23189085" and Password as "System@2022"
And Click on Login Button
Then Page title should be "Bill Hub"
When User puts the memo number in searching box
And Clicks on the Acknowledge button
Then Acknowledge page will get open
And User checks the check box for the invoice 
When He clicks on reassign  button 
Then A pop appears and he clicks on the ok button