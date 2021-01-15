Feature: Create Memo

Scenario: Successful Creation of Memo

Given  User launch chrome Browser 
When User opnes the URL "http://13.235.195.93:3003"
And User enters the Email as "10000071" and Password as "System@2022"
And Click on Login Button and then Dashboard got opened
And User clicks on create memo button and create memo popup gets opened
And User clicks on  create memo tab
And  User selects from state
And User selects To State
And User Clicks on Proceed Manully Button and create memo pop-gets opened
Then User enters invoice number
And User Attaches file
And User adds BT TAG
And User Selects service category
And User selects sub-service category
And User adds base amount
And User adds Additional amount
And User enters the TD
And User enters IGST 
And User enters HSN code
And User enters name
And User enters comment
And User cliks on save button
Then User Selects Submitting At 
And User selects submitting To
And User Clicks on submit button 
And Use again clicks on submit button and a pop-up gets appeared
Then User  clicks on final submit button 
And User logout
And User closes the browser





