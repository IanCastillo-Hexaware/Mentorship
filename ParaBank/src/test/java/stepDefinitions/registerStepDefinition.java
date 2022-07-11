package stepDefinitions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import objectPages.HomePage;
import objectPages.RegisterPage;
import resources.TestContextSetup;

public class registerStepDefinition{

	TestContextSetup testContextSetup;
	


	int i = 0 ;
	
	public registerStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	
	@And("^User enters this info \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void user_enters_this_info_something_something_something_something_something_something_something_something(String name, String lastname, String street, String city, String state, String zip, String phone, String ssn1, String username, String password) throws Throwable {
		HomePage homePage = testContextSetup.objectManager.getHomePage();
		WebDriverWait wait = testContextSetup.wait;
		RegisterPage registerPage = testContextSetup.objectManager.getRegisterPage();
		registerPage.setName(name);
		registerPage.setLastName(lastname);
		registerPage.setStreetName(street);
		registerPage.setCity(city);
		registerPage.setState(state);
		registerPage.setZip(zip);
		registerPage.setPhoneNumber(phone);
		registerPage.setSsn(ssn1);
		registerPage.setUsername(username);
		registerPage.setPassword(password);
		registerPage.clickRegister();
		
		if (!homePage.getTitle().getText().contains(username)) {
			while(!homePage.getTitle().getText().contains(username)&&i<10) {
			i++;
			registerPage.setUsername(username+i);
			registerPage.setPassword(password);
			registerPage.clickRegister();
			wait.until(ExpectedConditions.visibilityOf(homePage.getTitle()));
			}
			if(i>=10) {
				System.out.println("Please try another username");
			}
		}
        //throw new PendingException();
    }
	
}