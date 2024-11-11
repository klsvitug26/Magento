package selenium;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class BrowserFactory {
	public static WebDriver webdriver = null;
	public static WebDriver launchApplication(String browser) {
		

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			if (ConfigReader.getStringProps("headless").equalsIgnoreCase("yes")) {
				options.addArguments("--headless");
			}
			webdriver = new ChromeDriver(options);

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			if (ConfigReader.getStringProps("headless").equalsIgnoreCase("yes")) {
				FirefoxBinary binOptions = new FirefoxBinary();
				binOptions.addCommandLineOptions("--headless");
				FirefoxOptions options = new FirefoxOptions();
				options.setBinary(binOptions);
				webdriver = new FirefoxDriver(options);
			} else {
				webdriver = new FirefoxDriver();
			}
		} else {
			try {
				System.out.println(browser + ": is not correct or blank");
				throw new Exception("NO BROWSER FOUND EXCEPTION");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		webdriver.manage().window().maximize();
		webdriver.manage().deleteAllCookies();
		webdriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(ConfigReader.getIntProps("pageLoadTimeout")));
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigReader.getIntProps("implicitlyWait")));

		return webdriver;
	}
}
