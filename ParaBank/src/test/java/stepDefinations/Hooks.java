package stepDefinations;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import resources.TestContextSetup;

public class Hooks {
	
	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@After
	public void AfterScenario() throws IOException {
		testContextSetup.testbase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void AfterStepScenario(Scenario scenario) throws IOException {
		WebDriver driver = testContextSetup.testbase.WebDriverManager();
		if(scenario.isFailed()) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileByte = FileUtils.readFileToByteArray(file);
		scenario.attach(fileByte, "image/png", "image");
		}
	}

}
