package com.test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.HomePage;

public class HomePageTest extends BaseTest {
	
private HomePage hp;
	
	@BeforeClass
	public void beforeClass(){
		
		hp = new HomePage( driver);
		
	}
	@Test
	public void testSocialLinks(){
		
		assertEquals(hp.socialIcons(),4);
	}
	
	@Test
	public void testIsSliderPresent(){
		
		assertTrue(hp.isSliderPresent());
	}
	
	@Test
	public void testCountSliders(){
		
		assertEquals(hp.countSliders(),6);
	}
	
	@Test
	public void testLoginLink(){
		
		assertEquals(hp.clickLogin(),"http://whiteboxqa.com/login.php");
	}

}
