package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		prop.load(fis);
		if (driver == null) {
			String browser = prop.getProperty("browser");
			String url = prop.getProperty("url");
			System.out.println(browser);
			if (browser.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				if (browser.contains("headless")) {
					options.addArguments("headless");
				}
				driver = new ChromeDriver(options);
			} else if (browser.equals("firefox")) {
				// Firefox invocation code
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\src\\main\\java\\resources\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equals("msedge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + "\\src\\main\\java\\resources\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		return driver;

	}

}
