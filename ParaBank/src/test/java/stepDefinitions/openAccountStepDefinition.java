package stepDefinations;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPages.HomePage;
import resources.TestContextSetup;

public class openAccountStepDefinition {

	TestContextSetup testContextSetup;
	
	
	public openAccountStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	
    @When("^User opens new account$")
    public void user_opens_new_account() throws Throwable {
    	HomePage homePage = testContextSetup.objectManager.getHomePage(); 
    	homePage.clickOpenNewAccount();
		Thread.sleep(500);
		Assert.assertTrue(homePage.getError(), !homePage.getTitle().contains("Error"));
		homePage.clickConfirmAccount();
		
        //throw new PendingException();
    }

    @And("^User clicks the new account ID link$")
    public void user_clicks_the_new_account_id_link() throws Throwable {
    	HomePage homePage = testContextSetup.objectManager.getHomePage(); 
    	System.out.println(homePage.getAccountId().getText());
    	homePage.getAccountId().click();
		
        //throw new PendingException();
    }
    
    
    @Then("^Credit Value is displayed$")
    public void credit_value_is_displayed() throws Throwable {
    	HomePage homePage = testContextSetup.objectManager.getHomePage(); 
    	System.out.println(homePage.getCredit());
        //throw new PendingException();
    }    

}