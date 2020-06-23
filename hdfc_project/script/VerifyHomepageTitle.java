package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.HomePage;
import com.hdfc_project.pom.LoginPage;

public class VerifyHomepageTitle  extends BaseTest{

	@Test
	public void verifyHomepageTitle() throws InterruptedException
	{
		LoginPage l1=new LoginPage(driver);
		l1.setusername("patelavani42@gmail.com");
		l1.setpassword("manager");
		l1.clicklogin();
		
		HomePage h1=new HomePage(driver);
		Thread.sleep(2000);
		h1.verifyTitle("actiTIME - Enter Time-Track");
		h1.clicklogout();
	}
	
}
