package objectPages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	
	public WebDriver driver;
	public LandingPage landingPage;
	public RegisterPage registerPage;
	public HomePage homePage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	public RegisterPage getRegisterPage() {
		registerPage = new RegisterPage(driver);
		return registerPage;
	}
	public HomePage getHomePage() {
		homePage = new HomePage(driver);
		return homePage;
	}

}
