package com.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BasePage;

public class HomePage extends BasePage {

public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	public int socialIcons(){
		
		int count = 0;
		
		List<WebElement>sociallinks=driver.findElements(By.xpath("//*[@class='pull-right social-icons ']/li"));
		
		if(sociallinks!=null){
			
			count = sociallinks.size();
			}
		return count;
	}

	public boolean isSliderPresent(){
		
	
	boolean isSliderPresent = driver.findElements(By.id("promo-slider")).isEmpty() ? false: true;
	
	return isSliderPresent;
	
	}
	
	public int countSliders(){
		
		
		int sliders = driver.findElements(By.xpath("//*[@class='slides']/li")).size();
		
		return sliders;
		
		
	}
	
	public String clickLogin(){
		
		driver.findElement(By.id("loginButton")).click();
		
		return driver.getCurrentUrl();
		
	}
	
}
