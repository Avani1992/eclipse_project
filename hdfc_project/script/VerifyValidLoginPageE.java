package com.hdfc_project.script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.hdfc_project.pom.HomePage;
import com.hdfc_project.pom.LoginPage;

public class VerifyValidLoginPageE  extends BaseTest{
	
	@Test
	public void verifyLoginPageE() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String sheet="VerifyValidLoginPageE";
		
		String un=Excel.getCellValue(PATH, sheet, 1, 1);
		String pw=Excel.getCellValue(PATH, sheet, 1, 2);
		String lpt=Excel.getCellValue(PATH, sheet, 1, 3);
		String hpt=Excel.getCellValue(PATH, sheet, 1, 4);
		
		LoginPage l1=new LoginPage(driver);
		l1.verifyTitle(lpt);
		l1.setusername(un);
		l1.setpassword(pw);
		l1.clicklogin();
		Thread.sleep(3000);
		
		
		HomePage h1=new HomePage(driver);
		h1.verifyTitle(hpt);
		Thread.sleep(2000);
		
		
		
		
	}
}
