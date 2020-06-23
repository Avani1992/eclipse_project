package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.HomePage;
import com.hdfc_project.pom.LoginPage;

public class VerifyHomepage extends BaseTest {
	
	@Test
	public void verifyHomePage()
	{
		LoginPage l1=new LoginPage(driver);
		l1.setusername("patelavani42@gmail.com");
		l1.setpassword("manager");
		l1.clicklogin();
		
		HomePage h1=new HomePage(driver);
		h1.clicklogout();
		
		
	}

}
