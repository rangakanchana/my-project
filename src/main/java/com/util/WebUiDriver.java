package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebUiDriver {
	
public static WebDriver getDriver(ConfigUtils config){
		
		WebDriver driver = null;
		
		switch(config.BROWSER){
		
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\workspace1\\com.WhiteboxQaAutomation\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\Users\\sridhar\\workspace1\\com.WhiteboxQaAutomation\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		case "html":
			driver = new HtmlUnitDriver();
			break;
			default:
			driver = new FirefoxDriver();	
		}
		driver.get(config.URL);
		return driver;
	}

}
