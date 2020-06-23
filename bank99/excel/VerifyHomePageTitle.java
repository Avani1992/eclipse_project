package com.bank99.excel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.bank99.pom.LoginPage;

public class VerifyHomePageTitle extends BaseTestE {
	
	@Test
	public void verifyHomePageTitle() throws EncryptedDocumentException, IOException
	{
		String sheet="VerifyValidLoginPage";
		String un=Excel.getCellValue(path, sheet, 1, 2);
		String pw=Excel.getCellValue(path, sheet, 1, 3);
		String atitle=Excel.getCellValue(path, sheet, 1, 1);
		
		LoginPage l1=new LoginPage(driver);
		l1.setusername(un);
		l1.setpassword(pw);
		l1.clicklogin();
		
		l1.verifyTitle(atitle);
		
	}

}
