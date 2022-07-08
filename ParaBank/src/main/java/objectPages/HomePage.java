package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	private By openNewAccount = By.cssSelector("a[href*='openaccount.htm\']");
	private By confirm = By.cssSelector("input[value='Open New Account']");
	private By accountId = By.id("newAccountId");
	private By credit = By.cssSelector("td[class='ng-binding ng-scope']");
	private By requestLoan = By.cssSelector("a[href='/parabank/requestloan.htm']");
	private By loanamount = By.id("amount");
	private By downpayment = By.id("downPayment");
	private By apply = By.cssSelector("input[value='Apply Now'");
	private By response = By.cssSelector("div[ng-if*='Response']");
	private By error = By.cssSelector("p.error");
	private By title = By.cssSelector(".title");
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void clickOpenNewAccount() {
		driver.findElement(openNewAccount).click();
	}
	public void clickConfirmAccount() {
		driver.findElement(confirm).click();
	}
	public WebElement getAccountId() {
		return driver.findElement(accountId);
	}
	public String getCredit() {
		return driver.findElement(credit).getText();
	}
	public void setLoanAmount(String loanAmount) {
		driver.findElement(loanamount).sendKeys(loanAmount);
	}
	public void setDownPayment(String downPayment) {
		driver.findElement(downpayment).sendKeys(downPayment);
	}
	public void clickApplyBtn() {
		driver.findElement(apply).click();
	}
	public void clickRequestLoan() {
		driver.findElement(requestLoan).click();
	}
	public String getResponse() {
		return driver.findElement(response).getText();
	}
	public String getError() {
		return driver.findElement(error).getText();
	}
	public String getTitle() {
		return driver.findElement(title).getText();
	}
	
}