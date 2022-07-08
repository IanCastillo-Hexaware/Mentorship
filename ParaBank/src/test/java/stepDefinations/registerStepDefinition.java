package stepDefinations;

import org.junit.Assert;
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
		
		if (!homePage.getTitle().contains(username)) {
			while(!homePage.getTitle().contains(username)&&i<10) {
			i++;
			registerPage.setUsername(username+i);
			registerPage.setPassword(password);
			registerPage.clickRegister();
			Thread.sleep(500);
			}
		}
		Assert.assertTrue(!homePage.getTitle().contains("Error"));
        //throw new PendingException();
    }
	
}