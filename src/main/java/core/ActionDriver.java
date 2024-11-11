package core;

import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import selenium.BrowserFactory;
import utilities.ConfigReader;
import utilities.ReportManager;
import utilities.Utility;

public class ActionDriver extends BrowserFactory{
	
	protected static ThreadLocal<Integer> step = new ThreadLocal<Integer>();
	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	private static WebElement getElement(By locator) {
		WebElement element = getDriver().findElement(locator);
		return element;
	}
	
	private static void logToReporter(String desc) {
		ReportManager.testPass("Step " + step.get() + " - " + desc);
		step.set(step.get() + 1);
	}

	public synchronized static String captureScreenShot(String path) throws Exception {		
		/*File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		path = path + System.currentTimeMillis() + ".png";
		FileUtils.copyFile(scrFile, new File(path));*/
		
		Utility.createDirectory(path);
		path = path + System.currentTimeMillis() + ".png";
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(ActionDriver.getDriver());
		ImageIO.write(screenshot.getImage(), "PNG", new File(path));

		return path;
	}	
	
	public static void closeInstance() {
		driver.get().quit();
		driver.remove();
	}
	
	public static void createInstance(String browser) {
		step.set(1);
		driver.set(BrowserFactory.launchApplication(browser));
		
//	    if ("chrome".equalsIgnoreCase(browser)) {
//	        ChromeOptions opt = new ChromeOptions();
//	        opt.addExtensions(new File("./extensions/Ad Blocker ext.crx"));
//	        driver.set(new ChromeDriver(opt));
//	    } else {
//	        driver.set(BrowserFactory.launchApplication(browser));
//	    }
		

	}	
	
	public static WebDriver getDriver() {
		return driver.get();
	}	
	
	public static class WebActions {
		public static void clearText(String elementName, By locator) {
			getElement(locator).clear();
			logToReporter(elementName + " is cleared.");
			
		}
		
		// Verify Element is displayed
		public static void assertElementDisplayed(String elementName, By locator) {
			Assert.assertTrue(getElement(locator).isDisplayed());
			logToReporter(elementName + " is displayed.");
		}	
		
		// Click Element
		public static void clickElement(String elementName, By locator) {
			getElement(locator).click();
			logToReporter(elementName + " was clicked.");
		}
		
		public static void navigateToURL(String value) {
			getDriver().get(value);
		}
		
		// Set Password
			public static void setPassword(String elementName, By locator, String value) {
				getElement(locator).sendKeys(value);
				logToReporter(elementName + " is populated with ********.");
			}

		// Set Text
		public static void setText(String elementName, By locator, String value) {
			getElement(locator).sendKeys(value);
			logToReporter(elementName + " is populated with " + value + ".");
		}

		// Wait for Element to be clickable
		public static void waitElementClickable(String elementName, By locator) {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable((By) getElement(locator)));
			getDriver().manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
			logToReporter(elementName + " is clickable.");
		}

		// Wait until element is not visible
		public static void waitElementNotVisible(String elementName, By locator) {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("longWait")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated((By) getElement(locator)));
			logToReporter(elementName + " is not visible.");
		}

		// Wait until element is visible
		public static void waitElementVisible(String elementName, By locator) {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigReader.getIntProps("midWait")));
			wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			logToReporter(elementName + " is visible.");
		}

		// Wait for page to load completely
		public static void waitPageLoadComplete() {
			new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
					.executeScript("return document.readyState").equals("complete"));
		}
		
	    public static void moveToElement(String elementName, By locator) {
	        WebElement element = getElement(locator);
	        Actions actions = new Actions(getDriver());
	        actions.moveToElement(element).perform();
	        logToReporter("Moved to " + elementName + ".");
	    }
	    
	    public static String getText(String elementName, By locator) {
	        String text = getElement(locator).getText();
	        logToReporter(elementName + " text retrieved: " + text);
	        return text;
	    }
	    
	    public static void scrollToPosition(int x, int y) {
	        JavascriptExecutor js = (JavascriptExecutor) getDriver();
	        js.executeScript("window.scrollTo(" + x + ", " + y + ");");
	        logToReporter("Scrolled to position: x = " + x + ", y = " + y);
	    }
	    
	    public static void jsClick(String elementName, By locator) {
	    	 
			JavascriptExecutor js = (JavascriptExecutor) webdriver;
			js.executeScript("arguments[0].click();", getElement(locator));
			logToReporter(elementName + " was clicked.");
		}
	    
	    public static void doubleClickElement(String elementName, By locator) {
	        WebElement element = getElement(locator);
	        Actions actions = new Actions(getDriver());
	        actions.doubleClick(element).perform();
	        logToReporter(elementName + " was double-clicked.");
	    }
	    
        public static void selectVisibleByText(String elementName, By locator, String visibleText) {
            try {
                WebElement dropdown = getElement(locator);
                Select select = new Select(dropdown); // Initialize the Select class
                select.selectByVisibleText(visibleText); // Select the option by visible text
                logToReporter(elementName + " is selected with visible text: " + visibleText);
            } catch (Exception e) {
                logToReporter("Error selecting option for " + elementName + " with visible text: " + visibleText);
                e.printStackTrace();
            }
	    
	    
	}

}
}