package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BasePage;

public class LoginPage extends BasePage {
	
	HomePage hp;

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public String userLogin(){
		
		hp.clickLogin();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.id("username")).sendKeys("kanchana123");
		
		driver.findElement(By.id("password")).sendKeys("gold12");
		
		driver.findElement(By.linkText("Login")).submit();
		
		String getCurrentUrl=driver.getCurrentUrl();
		
		return getCurrentUrl;
	}

}
