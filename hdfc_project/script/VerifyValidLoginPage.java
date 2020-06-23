package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.LoginPage;

public class VerifyValidLoginPage extends BaseTest {
	
	@Test
	public void verifyLoginPage()
	{
		LoginPage l1=new LoginPage(driver);
		l1.setusername("patelavani42@gmail.com");
		l1.setpassword("manager");
		l1.clicklogin();
	}

}
