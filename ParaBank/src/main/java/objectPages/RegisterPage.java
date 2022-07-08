package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	public WebDriver driver;
	private By firstname = By.id("customer.firstName");
	private By lastName = By.id("customer.lastName");
	private By streetName = By.id("customer.address.street");
	private By addresscity = By.id("customer.address.city");
	private By addressstate = By.id("customer.address.state");
	private By zipCode = By.id("customer.address.zipCode");
	private By phoneNumber = By.id("customer.phoneNumber");
	private By ssn = By.id("customer.ssn");
	private By userName = By.id("customer.username");
	private By passWord = By.id("customer.password");
	private By rpassword = By.id("repeatedPassword");
	private By registerBtn = By.cssSelector("input[value='Register']");
	private By inputUsername = By.cssSelector("input[name='username']");
	private By inputPassword = By.cssSelector("input[name='password']");
	private By login = By.cssSelector("input[value='Log In']");
	
	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void setName(String name) {
		driver.findElement(firstname).sendKeys(name);
	}
	public void setLastName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}
	public void setStreetName(String street) {
		driver.findElement(streetName).sendKeys(street);
	}
	public void setCity(String city) {
		driver.findElement(addresscity).sendKeys(city);
	}
	public void setState(String state) {
		driver.findElement(addressstate).sendKeys(state);
	}
	public void setZip(String zip) {
		driver.findElement(zipCode).sendKeys(zip);
	}
	public void setPhoneNumber(String phone) {
		driver.findElement(phoneNumber).sendKeys(phone);
	}
	public void setUsername(String username) {
		driver.findElement(userName).clear();
		driver.findElement(userName).sendKeys(username);
	}
	public void setPassword(String password) {
		driver.findElement(passWord).sendKeys(password);
		driver.findElement(rpassword).sendKeys(password);
	}
	public void setSsn(String ssn1) {
		driver.findElement(ssn).sendKeys(ssn1);
	}
	public void clickRegister() {
		driver.findElement(registerBtn).click();
	}
	public void setUsernameLogin(String username) {
		driver.findElement(inputUsername).sendKeys(username);
	}
	public void setPasswordLogin(String password) {
		driver.findElement(inputPassword).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}

}
