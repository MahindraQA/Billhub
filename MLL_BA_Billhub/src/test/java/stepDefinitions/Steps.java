package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CreateMemo;
import pageObjects.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;
	public CreateMemo cm;

	@Given("User launch chrome Browser")
	public void user_launch_chrome_Browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		cm = new CreateMemo(driver);
	}

	@When("User opnes the URL {string}")
	public void user_opnes_the_URL(String url) {

		driver.get(url);
	}

	@When("User enters the Email as {string} and Password as {string}")
	public void user_enters_the_Email_as_and_Password_as(String email, String password) {

		lp.setUsername(email);
		lp.setPassword(password);

	}

	@When("Click on Login Button")
	public void click_on_Login_Button() {
		lp.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {

		/*
		 * if(driver.getPageSource().contains("Invalid Login Credentials")) {
		 * driver.close(); Assert.assertTrue(false); } else { Assert.assertEquals(title,
		 * driver.getTitle()); }
		 */
	}

	@When("User click on profile drop-down")
	public void user_click_on_profile_drop_down() {

	}

	@Then("List of the data get listed out")
	public void list_of_the_data_get_listed_out() {

	}

	@Then("click on logout option")
	public void click_on_logout_option() throws InterruptedException {

		lp.logout();
		Thread.sleep(3000);
	}

	/*
	 * @Then("Page title should be {string}") public void
	 * page_title_should_be_2(String string) { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */
	@Then("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}

	/*
	 * @Then("Dashboard got opened") public void dashboard_got_opened() {
	 * 
	 * cm= new CreateMemo(driver); Assert.assertEquals("Bill Hub",
	 * cm.getPageTitle());
	 * 
	 * }
	 */

	@When("Click on Login Button and then Dashboard got opened")
	public void click_on_Login_Button_and_then_Dashboard_got_opened() {
		cm.clickLogin();
	}

	@Then("User clicks on create memo button and create memo popup gets opened")
	public void user_clicks_on_create_memo_button_and_create_memo_popup_gets_opened() {

		cm.createMemoButton();

	}

	@Then("User clicks on  create memo tab")
	public void user_clicks_on_create_memo_tab() {

		cm.createMemoTab();
	}

	@Then("User selects from state")
	public void user_selects_from_state() throws InterruptedException {
		cm.fromstate();
	}

	@Then("User selects To State")
	public void user_selects_To_State() throws InterruptedException {
		cm.tostate();
	}

	@Then("User Clicks on Proceed Manully Button and create memo pop-gets opened")
	public void user_Clicks_on_Proceed_Manully_Button_and_create_memo_pop_gets_opened() {
		cm.proceedManuallyButton();
	}

	@Then("User enters invoice number")
	public void user_enters_invoice_number() throws InterruptedException {
		cm.setInvoiceNumber();
	}

	@Then("User Attaches file")
	public void user_Attaches_file() throws InterruptedException {
		// cm.attachment();
	}

	@Then("User adds BT TAG")
	public void user_adds_BT_TAG() throws InterruptedException {
		cm.btnBTTAG();
		;
	}

	@Then("User Selects service category")
	public void user_Selects_service_category() throws InterruptedException {
		cm.serviceCategory();
	}

	@Then("User selects sub-service category")
	public void user_selects_sub_service_category() throws InterruptedException {
		cm.subserviceCategory();
	}

	@Then("User adds base amount")
	public void user_adds_base_amount() {
		cm.baseAmount();
	}

	@Then("User adds Additional amount")
	public void user_adds_Additional_amount() {
		cm.additionalAmount();
	}

	@Then("User enters the TD")
	public void user_enters_the_TD() {
		cm.tdAmount();
	}

	@Then("User enters IGST")
	public void user_enters_IGST()
	{
		cm.igstAmount();
		
	}
	
	
	@Then("User enters HSN code")
	public void user_enters_HSN_code() {
		cm.hsnCode();
	}

	@Then("User enters name")
	public void user_enters_name() {
		cm.customer();
	}

	@Then("User enters comment")
	public void user_enters_comment() {
		cm.comment();
	}

	@Then("User cliks on save button")
	public void user_cliks_on_save_button() {

	}

	@Then("User Selects Submitting At")
	public void user_Selects_Submitting_At() {

	}

	@Then("User selects submitting To")
	public void user_selects_submitting_To() {

	}

	@Then("User Clicks on submit button")
	public void user_Clicks_on_submit_button() {

	}

	@Then("Use again clicks on submit button and a pop-up gets appeared")
	public void use_again_clicks_on_submit_button_and_a_pop_up_gets_appeared() {

	}

	@Then("User  clicks on final submit button")
	public void user_clicks_on_final_submit_button() {

	}

	@Then("User logout")
	public void user_logout() {

	}

	@Then("User closes the browser")
	public void user_closes_the_browser() {

	}
}
