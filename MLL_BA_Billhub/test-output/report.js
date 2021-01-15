$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/CreateMemo.feature");
formatter.feature({
  "name": "Create Memo",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Creation of Memo",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_launch_chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opnes the URL \"http://13.235.195.93:3003\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_opnes_the_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Email as \"10000071\" and Password as \"System@2022\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_the_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login Button and then Dashboard got opened",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Login_Button_and_then_Dashboard_got_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on create memo button and create memo popup gets opened",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_clicks_on_create_memo_button_and_create_memo_popup_gets_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on  create memo tab",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_clicks_on_create_memo_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects from state",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_selects_from_state()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects To State",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_selects_To_State()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Proceed Manully Button and create memo pop-gets opened",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Clicks_on_Proceed_Manully_Button_and_create_memo_pop_gets_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters invoice number",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_invoice_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Attaches file",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Attaches_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User adds BT TAG",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_adds_BT_TAG()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with text: Shipx LR Transactions\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027MLLLAPH01180\u0027, ip: \u0027192.168.1.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:148)\r\n\tat pageObjects.CreateMemo.btnBTTAG(CreateMemo.java:294)\r\n\tat stepDefinitions.Steps.user_adds_BT_TAG(Steps.java:139)\r\n\tat ✽.User adds BT TAG(file:///C:/Users/amarav-cont/eclipse-workspace/MLL_BA_Billhub/./Features/CreateMemo.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Selects service category",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Selects_service_category()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User selects sub-service category",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_selects_sub_service_category()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User adds base amount",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_adds_base_amount()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User adds Additional amount",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_adds_Additional_amount()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters the TD",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_the_TD()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters IGST",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_IGST()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters HSN code",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_HSN_code()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters comment",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_comment()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User cliks on save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_cliks_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Selects Submitting At",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Selects_Submitting_At()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User selects submitting To",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_selects_submitting_To()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Clicks_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Use again clicks on submit button and a pop-up gets appeared",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.use_again_clicks_on_submit_button_and_a_pop_up_gets_appeared()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User  clicks on final submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_clicks_on_final_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User logout",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_closes_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});