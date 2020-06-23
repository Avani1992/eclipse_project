package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.HomePage;
import com.hdfc_project.pom.LoginPage;
import com.hdfc_project.pom.Tasks;

public class VerifyTasks extends BaseTest {
	
	@Test
	public void verifyTasks() throws InterruptedException
	{
		LoginPage l1=new LoginPage(driver);
		l1.setusername("patelavani42@gmail.com");
		l1.setpassword("manager");
		l1.clicklogin();
		
		Tasks t1=new Tasks(driver);
		t1.clicktasks();
		Thread.sleep(3000);
		//t1.settaskname("Android");
		
		HomePage h1=new HomePage(driver);
		h1.clicklogout();
	}

}
