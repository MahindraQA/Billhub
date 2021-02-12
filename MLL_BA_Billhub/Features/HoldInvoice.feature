Feature: Verfiy Memo 

Scenario: Successful Verfiy Memo with the valid credentials 

Given  User launch chrome Browser 
When User opnes the URL "http://13.235.195.93:3003"
And User enters the Email as "23189085" and Password as "System@2022"
And Click on Login Button
Then Page title should be "Bill Hub"
When User puts the memo number in searching box
And Clicks on the verify button
Then verfiy page  will get open and he clicks  on verfiy button 
When he clicks the hold invoice button 
Then A pop-appears and selects the values from the fields 
And finally clicks on put on hold button 