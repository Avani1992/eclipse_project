package com.bank99.script;

import org.testng.annotations.Test;

import com.bank99.pom.LoginPage;
import com.bank99.pom.ManagerID;



public class VerifyLoginPage extends BaseTest{
	
	@Test
	public void verifyLoginPage()
	{
	LoginPage l1=new LoginPage(driver);
	l1.setusername("mngr263782");
	l1.setpassword("najuzAs");
	l1.clicklogin();
	
	
	}
	

}
