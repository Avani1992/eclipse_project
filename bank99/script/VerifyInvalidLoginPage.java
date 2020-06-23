package com.bank99.script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bank99.pom.Invalidloginpage;
import com.bank99.pom.LoginPage;

public class VerifyInvalidLoginPage extends BaseTest{
	
	@Test
	public void verifyInvalidLoginPage() throws IOException, InterruptedException
	{
		LoginPage l1=new LoginPage(driver);
		l1.setusername("mngr263782");
		l1.setpassword("1234");
		l1.clicklogin();
		
		Invalidloginpage i1=new Invalidloginpage(driver);
		i1.errormsg();
	}

}
