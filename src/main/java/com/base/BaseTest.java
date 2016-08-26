package com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.util.ConfigUtils;
import com.util.WebUiDriver;

public abstract class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite(){
		
		ConfigUtils config = new ConfigUtils();
		
		this.driver = WebUiDriver.getDriver(config);
		
		
	}

}
