package com.hdfc_project.script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.hdfc_project.pom.InvalidLogin;
import com.hdfc_project.pom.LoginPage;

public class VerifyInvalidLoginPageE extends BaseTest {
	
	@ Test
	public void verifyInvalidLoginPageE() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String sheet="VerifyInvalidLoginPageE";
		
		int rowCount = Excel.getRowCount(PATH, sheet);
		
		for(int i=1;i<=rowCount;i++)
		{
			String un=Excel.getCellValue(PATH, sheet, i, 1);
			String pw=Excel.getCellValue(PATH, sheet, i, 2);
			
			LoginPage l1=new LoginPage(driver);
			l1.setusername(un);
			l1.setpassword(pw);
			l1.clicklogin();
			
			Thread.sleep(2000);
			InvalidLogin i1=new InvalidLogin(driver);
			i1.errormsg();
		}
	}

}
