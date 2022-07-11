package stepDefinitions;
import org.junit.runner.RunWith;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import objectPages.RegisterPage;
import resources.TestContextSetup;

@RunWith(Cucumber.class)
public class LoginStepDefinition{
	
	TestContextSetup testContextSetup;
	
	
	public LoginStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}


	 @And("^Logs in with this info \"([^\"]*)\", \"([^\\\"]*)\"$")
	    public void logs_in_with_this_info_something_something(String username, String password) throws Throwable {
			RegisterPage registerPage = testContextSetup.objectManager.getRegisterPage();
			registerPage.setUsernameLogin(username);
			registerPage.setPasswordLogin(password);
			registerPage.clickLogin();
	    	

	    	//throw new PendingException();
	    }
}