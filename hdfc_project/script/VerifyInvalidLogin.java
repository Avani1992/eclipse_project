 package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.InvalidLogin;
import com.hdfc_project.pom.LoginPage;
import com.hdfc_project.script.BaseTest;

public class VerifyInvalidLogin extends BaseTest{
	
	@Test
	public void verifyInvalidLogin()
	{
		LoginPage l1=new LoginPage(driver);
		l1.setusername("avani42@gmail.com");
		l1.setpassword("manager");
		l1.clicklogin();
		
		InvalidLogin i1=new InvalidLogin(driver);
		i1.errormsg();
	}
	

}
