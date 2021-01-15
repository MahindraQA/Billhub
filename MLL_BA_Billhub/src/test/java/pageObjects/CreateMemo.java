package pageObjects;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateMemo {

	// Intializing webdriver

	private static final String SECONDS = null;

	public WebDriver ldriver;

	// Constructor for the class Create Memo Page
	public CreateMemo(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Object Repositories for Create Customer

	@FindBy(xpath = "//input[@id=\"emailInput\"]")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id=\"passwordInput\"]")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[@id=\"login\"]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "//button[contains(text(),'Create Memo')]")
	@CacheLookup
	WebElement btnCreateMemo;

	@FindBy(xpath = "//span[contains(text(),'Create Memo')]")
	@CacheLookup
	WebElement tabcreateMemo;
	// select[@id='frmState']
	@FindBy(xpath = "//select[@id='frmState']")
	@CacheLookup
	WebElement drpfromstate;

	@FindBy(xpath = "//select[@id='toState']")
	@CacheLookup
	WebElement drptostate;

	// button[contains(text(),'Proceed Manually')]
	@FindBy(xpath = "//button[contains(text(),'Proceed Manually')]")
	@CacheLookup
	WebElement btnProceedManually;

	@FindBy(xpath = "//input[@id='first']")
	@CacheLookup
	WebElement txtInoiceNumber;

	// button[@class="form-control invoice-btn"]
	// button[contains(text(),'Attach')]
	// button[contains(text(),'Attach')]
	@FindBy(xpath = "// button[contains(text(),'Attach')]")
	@CacheLookup
	WebElement btnAttach;

	@FindBy(xpath = "//button[contains(text(),'Done')]")
	@CacheLookup
	WebElement btnDone;

	@FindBy(xpath = "//button[contains(text(),'Tag (BT)')]")
	@CacheLookup
	WebElement btnBTTAG;
	// select[@id='typeService']
	@FindBy(xpath = "//select[@id='typeService']")
	@CacheLookup
	WebElement drpTypeOfService;

	// tbody/tr[5]/td[1]/div[1]/input[1]
	@FindBy(xpath = "//tbody/tr[5]/td[1]/div[1]/input[1]")
	@CacheLookup
	WebElement checkboxDirectLR;
	// body/modal-container[1]/div[1]/div[1]/app-add-lr-popup[1]/div[2]/div[2]/div[2]/button[1]
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/app-add-lr-popup[1]/div[2]/div[2]/div[2]/button[1]")
	@CacheLookup
	WebElement btnAddToList;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/input[1]")
	@CacheLookup
	WebElement txtDirectLRAmount;

	// span[contains(text(),'Add Base Transaction')
	// button[@class="btn btn-primary btn-done"]

	@FindBy(xpath = "//button[@class=\"btn btn-primary btn-done\"]")
	@CacheLookup
	WebElement btnAddBT;

	@FindBy(xpath = "//select[@id='serviCategory']")
	@CacheLookup
	WebElement drpServiceACategory;

	@FindBy(xpath = "//select[@id='subServiCategory']")
	@CacheLookup
	WebElement drpSubServiceACategory;

	@FindBy(xpath = "//input[@id='base']")
	@CacheLookup
	WebElement txtBaseAmount;

	@FindBy(xpath = "//label[contains(text(),'Additional Amount (₹)')]")
	@CacheLookup
	WebElement txtAdditionalAmount;

	@FindBy(xpath = "//input[@id='td']")
	@CacheLookup
	WebElement txtTD;

	@FindBy(xpath = "//input[@id='igst']")
	@CacheLookup
	WebElement txtIGST;

	@FindBy(xpath = "//input[@id='hsnCode']")
	@CacheLookup
	WebElement txtHSNCode;

	@FindBy(xpath = "//input[@id='custName']")
	@CacheLookup
	WebElement txtEndCustomer;

	@FindBy(xpath = "//input[@id='commet']")
	@CacheLookup
	WebElement txtComment;

	// Actions for above repository

	public void setUsername(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);

	}

	public void clickLogin() {

		btnLogin.click();

	}

	public void createMemoButton() {

		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Create Memo')]")));
		// Thread.sleep(2000);

		btnCreateMemo.click();

	}

	public void createMemoTab() {

		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Create Memo')]")));
		tabcreateMemo.click();

	}

	public void fromstate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='frmState']")));

		Select sel = new Select(ldriver.findElement(By.xpath("//select[@id='frmState']")));

		Thread.sleep(2000);
		sel.selectByVisibleText("MAHARASHTRA");

	}

	public void tostate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='toState']")));

		Select sel = new Select(ldriver.findElement(By.xpath("//select[@id='toState']")));

		Thread.sleep(2000);
		sel.selectByVisibleText("RAJASTHAN");

	}

	public void proceedManuallyButton() {

		btnProceedManually.click();
	}

	public void setInvoiceNumber() {
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='first']")));
		txtInoiceNumber.sendKeys("raja1");

		// Thread.sleep(2000);

	}

	/*
	 * public void attachment() throws InterruptedException {
	 * 
	 * try { WebDriverWait wait = new WebDriverWait(ldriver, 30);
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("// button[contains(text(),'Attach')]")));
	 * 
	 * // Actions action = new Actions(ldriver); // WebElement btnAttach =
	 * ldriver.findElement(By.xpath("// // button[contains(text(),'Attach')]"));
	 * ldriver.findElement(By.xpath("// button[contains(text(),'Attach')]")).
	 * sendKeys(Keys.RETURN); // action.doubleClick(btnAttach).perform(); } catch
	 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * // Thread.sleep just for user to notice the event // Thread.sleep(3000); //
	 * btnAttach.click(); // ldriver.navigate().forward();
	 * 
	 * // Thread.sleep(10000);;
	 * 
	 * // button[contains(text(),'Done')]
	 * 
	 * // input[@name="Invoice"] //
	 * /html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-file-upload-popup[1]/
	 * div[2]/div[1]/div[1]/form[1]/div[1]/input[1]
	 * 
	 * // body.billhub_body.ng-tns-0-2.modal-open:nth-child(2) //
	 * modal-container.modal.fade.show:nth-child(8) div.modal-dialog.modal-lg //
	 * div.modal-content div.modal-body div.row:nth-child(2) //
	 * div.col.ng-star-inserted form.ng-untouched.ng-pristine.ng-valid //
	 * div.file-box.truncate.ng-star-inserted:nth-child(1) > //
	 * input.custom-file-input.ng-star-inserted //
	 * body/modal-container[1]/div[1]/div[1]/app-file-upload-popup[1]/div[2]/div[1]/
	 * div[1]/form[1]/div[1]/input[1] //
	 * body/modal-container[1]/div[1]/div[1]/app-file-upload-popup[1]/div[2]/div[1]/
	 * div[1]/form[1]/div[1]/input[1][@class="custom-file-input //
	 * ng-star-inserted"][@name="Invoice"] //
	 * body/modal-container[1]/div[1]/div[1]/app-file-upload-popup[1]/div[2]/div[1]/
	 * div[1]/form[1]/div[1]/input[1][@name="Invoice"]
	 * 
	 * try { WebDriverWait wait1 = new WebDriverWait(ldriver, 40);
	 * wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "// input[@name=\"Invoice\"]")));
	 * 
	 * WebElement upload = ldriver.findElement(By.xpath(
	 * "// input[@name=\"Invoice\"]")); upload.
	 * sendKeys("C:\\Users\\amarav-cont\\Desktop\\Invoice Folder\\Invoices.xlsx"); }
	 * catch (TimeoutException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * Thread.sleep(3000);
	 * 
	 * 
	 * btnDone.click();
	 * 
	 * }
	 */

	public void btnBTTAG() throws InterruptedException {
		// click Tag BT button
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Tag (BT)')]")));

		ldriver.findElement(By.xpath("//button[contains(text(),'Tag (BT)')]")).sendKeys(Keys.RETURN);

		// Select type of service from the drop-down
		WebDriverWait wait1 = new WebDriverWait(ldriver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='typeService']")));
		Select sel = new Select(ldriver.findElement(By.xpath("//select[@id='typeService']")));
		Thread.sleep(3000);
		sel.selectByVisibleText("Shipx LR Transactions");

		// check Direct LR from the List
		WebDriverWait wait2 = new WebDriverWait(ldriver, 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[5]/td[1]/div[1]/input[1]")));

		WebElement checkbox = ldriver.findElement(By.xpath("//tbody/tr[5]/td[1]/div[1]/input[1]"));
		checkbox.click();
		Thread.sleep(2000);
		// click on Button AddToList
		btnAddToList.click();

		// Enter the Amount in Direct LR
		WebElement txtDirectLRAmount = ldriver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]"));
		txtDirectLRAmount.clear();
		txtDirectLRAmount.sendKeys("1000");

		// Click on AddBT Tansaction Button

		WebDriverWait wait3 = new WebDriverWait(ldriver, 30);
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class=\"btn btn-primary btn-done\"]")));

		ldriver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-done\"]")).sendKeys(Keys.RETURN);

	}

	public void serviceCategory() throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(ldriver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='serviCategory']")));
		Select sel = new Select(ldriver.findElement(By.xpath("//select[@id='serviCategory']")));
		Thread.sleep(3000);
		sel.selectByVisibleText("Clearing & Forwarding Charges");

	}

	public void subserviceCategory() throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(ldriver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='subServiCategory']")));
		Select sel = new Select(ldriver.findElement(By.xpath("//select[@id='subServiCategory']")));
		Thread.sleep(3000);
		sel.selectByVisibleText("Cargo Handling Agency, Clearing & Forwarding");

	}

	public void baseAmount() {

		txtBaseAmount.clear();
		txtBaseAmount.sendKeys("1000");
	}

	public void additionalAmount() {

		txtAdditionalAmount.clear();
		txtAdditionalAmount.sendKeys("100");
	}

	public void tdAmount() {

		txtTD.clear();
		txtTD.sendKeys("100");
	}

	public void igstAmount() {
		txtIGST.clear();
		txtIGST.sendKeys("200");

	}

	public void hsnCode() {

		txtHSNCode.clear();
		txtHSNCode.sendKeys("HSN1234");

	}

	public void customer() {

		txtEndCustomer.clear();
		txtEndCustomer.sendKeys("Customer123");
	}

	public void comment() {

		txtComment.clear();
		txtComment.sendKeys("Comment1234");
	}

	/*
	 * public void attachment() throws InterruptedException {
	 * 
	 * 
	 * WebDriverWait wait = new WebDriverWait(ldriver, 30);
	 * 
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("// button[contains(text(),'Attach')]")));
	 * 
	 * // Actions action = new Actions(ldriver); // WebElement btnAttach = //
	 * ldriver.findElement(By.xpath("// // button[contains(text(),'Attach')]"));
	 * 
	 * ldriver.findElement(By.xpath("// button[contains(text(),'Attach')]")).
	 * sendKeys(Keys.RETURN);
	 * 
	 * // action.doubleClick(btnAttach).perform(); } catch
	 * 
	 * 
	 * // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * // Thread.sleep just for user to notice the event // Thread.sleep(3000); //
	 * btnAttach.click(); // ldriver.navigate().forward();
	 * 
	 * // Thread.sleep(10000);;
	 * 
	 * // button[contains(text(),'Done')]
	 * 
	 * // input[@name="Invoice"] //
	 * 
	 * 
	 * /html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-file-upload-popup[1]/
	 * div[2]/div[1]/div[1]/form[1]/div[1]/input[1]
	 * 
	 * // body.billhub_body.ng-tns-0-2.modal-open:nth-child(2) //
	 * modal-container.modal.fade.show:nth-child(8) div.modal-dialog.modal-lg //
	 * div.modal-content div.modal-body div.row:nth-child(2) //
	 * div.col.ng-star-inserted form.ng-untouched.ng-pristine.ng-valid //
	 * div.file-box.truncate.ng-star-inserted:nth-child(1) > //
	 * input.custom-file-input.ng-star-inserted //
	 * body/modal-container[1]/div[1]/div[1]/app-file-upload-popup[1]/div[2]/div[1]/
	 * div[1]/form[1]/div[1]/input[1] //
	 * body/modal-container[1]/div[1]/div[1]/app-file-upload-popup[1]/div[2]/div[1]/
	 * div[1]/form[1]/div[1]/input[1][@class="custom-file-input //
	 * ng-star-inserted"][@name="Invoice"] //
	 * body/modal-container[1]/div[1]/div[1]/app-file-upload-popup[1]/div[2]/div[1]/
	 * div[1]/form[1]/div[1]/input[1][@name="Invoice"]
	 * 
	 * try { WebDriverWait wait1 = new WebDriverWait(ldriver, 40);
	 * wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "// input[@name=\"Invoice\"]")));
	 * 
	 * WebElement upload = ldriver.findElement(By.xpath(
	 * "// input[@name=\"Invoice\"]")); upload.
	 * sendKeys("C:\\Users\\amarav-cont\\Desktop\\Invoice Folder\\Invoices.xlsx"); }
	 * catch (TimeoutException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * Thread.sleep(3000);
	 * 
	 * 
	 * btnDone.click();
	 * 
	 * }
	 */

}
