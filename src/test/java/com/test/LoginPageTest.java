package com.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeClass;

import com.base.BaseTest;
import com.page.LoginPage;

public class LoginPageTest extends BaseTest {
	
	private LoginPage lp;
	
	@BeforeClass
	public void beforeClass(){
		
		lp = new LoginPage(driver);
	}
	
	public void testUserLogin(){
		
		assertEquals("http://whiteboxqa.com/login.php",lp.userLogin());
	}
	

}
