package stepDefinations;
import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import objectPages.LandingPage;
import objectPages.PageObjectManager;
import resources.TestContextSetup;

@RunWith(Cucumber.class)
public class IndexStepDefinition {

	TestContextSetup testContextSetup;
	PageObjectManager objectManager;
	
	public IndexStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	
    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    //throw new PendingException();
    
    }
    
    @And("^User goes to register page$")
    public void user_goes_to_register_page() {
    	LandingPage landingPage = testContextSetup.objectManager.getLandingPage();
    	landingPage.getRegister().click();
    }

}