package stepDefinitions;
import org.junit.runner.RunWith;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import objectPages.HomePage;
import resources.TestContextSetup;

@RunWith(Cucumber.class)
public class RequestLoanStepDefinition{
	
	TestContextSetup testContextSetup;
	
	public RequestLoanStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

	
	
    @When("^User goes for requesting a loan$")
    public void user_goes_for_requesting_a_loan() throws Throwable {
    	HomePage homePage = testContextSetup.objectManager.getHomePage();
		homePage.clickRequestLoan();
    	//throw new PendingException();
    }

    @And("^loan amount is (.+) and down payment is (.+)$")
    public void loan_amount_is_something_and_down_payment_is_something(String loanAmount, String downPayment) throws Throwable {
    	HomePage homePage = testContextSetup.objectManager.getHomePage();
    	homePage.setLoanAmount(loanAmount);
		homePage.setDownPayment(downPayment);
		homePage.clickApplyBtn();
    	//throw new PendingException();
    }
    
    @Then("^The loan info is displayed$")
    public void the_loan_info_is_displayed() throws Throwable {
    	HomePage homePage = testContextSetup.objectManager.getHomePage();
    	System.out.println(homePage.getResponse());
    	//throw new PendingException();
    }

}