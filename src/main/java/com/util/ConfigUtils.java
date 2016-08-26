package com.util;

import java.io.FileReader;
import java.util.Properties;

public class ConfigUtils {
	
private static final String CONFIG_PATH ="C:\\Users\\sridhar\\workspace1\\com.WhiteboxQaAutomation\\resources\\config.properties";
	
	public String BROWSER;
	public String URL;
	
	public ConfigUtils(){
		
		Properties  prop = new Properties();
		
		try {
			prop.load(new FileReader(CONFIG_PATH));
			
			BROWSER=prop.getProperty("browser");
			
			URL=prop.getProperty("url");
		 
		} catch (Exception e) {
			
			e.getMessage();
		}
		
		
		
	}

}
