package resources;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import objectPages.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public PageObjectManager objectManager;
	public TestBase testbase;
	
	public TestContextSetup() throws IOException {
		testbase = new TestBase();
		objectManager = new PageObjectManager(testbase.WebDriverManager());
	}
	

}
