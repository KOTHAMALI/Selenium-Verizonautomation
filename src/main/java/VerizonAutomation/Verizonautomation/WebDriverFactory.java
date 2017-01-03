package VerizonAutomation.Verizonautomation;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import com.google.common.base.Function;

public class WebDriverFactory {

	private static WebDriver driver =null;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		WebDriverFactory.driver = driver;
	}

	
	public void intializeWebDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
	     
//	       System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver.exe");
//	        driver = new FirefoxDriver();
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void setup() throws MalformedURLException{
		String nodeURL;
		//nodeURL = "http://localhost:4444/wd/hub";
		nodeURL = "http://172.16.56.20:5555/wd/hub";
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeURL),capability);
	}
	
	
	
	    public void tearDown() {
		   
	            driver.close();
	        }
	   // This is the most common wait function used in selenium
	    public static WebElement webDriverFluentWait(final By locator) {
	        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
	                .withTimeout(60, TimeUnit.SECONDS)
	                .pollingEvery(10, TimeUnit.SECONDS)
	                .ignoring(NoSuchElementException.class)
	                .ignoring(StaleElementReferenceException.class)
	                .ignoring(ElementNotFoundException.class)
	                .ignoring(WebDriverException.class)
	                .withMessage(
	                        "Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown: " + locator.toString());

	        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(locator);
	            }
	        });

	        return element;
	    }
	 
	    }

