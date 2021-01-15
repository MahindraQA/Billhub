package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
// Intializing webdriver

	public WebDriver ldriver;

// Constructor for the class Login Page
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Object Repository
	
	@FindBy(xpath = "//input[@id=\"emailInput\"]")
	@CacheLookup
	WebElement txtEmail_Billhub;

	@FindBy(xpath = "//input[@id=\"passwordInput\"]")
	@CacheLookup
	WebElement txtPassword_Billhub;

	@FindBy(xpath = "//button[@id=\"login\"]")
	@CacheLookup
	WebElement btnLogin_Billhub;
	
	//a[@class=\"nav-link dropdown-toggle\"]
//	/html/body/app-root/app-layout/div/nav/div[2]/div/a
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/div[1]/nav[1]/div[2]/div[1]/a[1]")
	@CacheLookup
	WebElement dropDown;
	
// Chropath -- //body/app-root[1]/app-layout[1]/div[1]/nav[1]/div[2]/div[1]/a[1]
	//a[@class=\"dropdown-item\"]
	
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement btnLogout_Billhub;

	// Actions for above repositories

	public void setUsername(String uname) {
		txtEmail_Billhub.clear();
		txtEmail_Billhub.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		txtPassword_Billhub.clear();
		txtPassword_Billhub.sendKeys(pwd);

	}

	public void clickLogin() {

		btnLogin_Billhub.click();

	}
	/*
	 * public void dropdownLogout() {
	 * 
	 * Select sel = new Select(dropDown);
	 * 
	 * sel.selectByVisibleText("Logout"); 
	 * 
	 * btnLogout_Billhub.click();
	 * 
	 * }
	 */

/*	public void dropDown() {
		dropDown.click(
	}*/

	public void logout() throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(ldriver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/app-root[1]/app-layout[1]/div[1]/nav[1]/div[2]/div[1]/a[1]")));
		//Thread.sleep(2000);
	
	dropDown.click();
		
		//Thread.sleep(2000);
		
	
	
	WebDriverWait wait1 = new WebDriverWait(ldriver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
			btnLogout_Billhub.click();
		
		

	}

}