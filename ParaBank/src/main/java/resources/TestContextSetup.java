package resources;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectPages.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public PageObjectManager objectManager;
	public TestBase testbase;
	public WebDriverWait wait;
	
	public TestContextSetup() throws IOException {
		testbase = new TestBase();
		objectManager = new PageObjectManager(testbase.WebDriverManager());
		wait = new WebDriverWait(testbase.WebDriverManager(), Duration.ofSeconds(10));
	
	}
}
