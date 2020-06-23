package com.bank99.excel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.bank99.pom.Invalidloginpage;
import com.bank99.pom.LoginPage;

public class VerifyInvalidLoginPage extends BaseTestE {
	
	@Test
	public void verifyInvalidLoginPage() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String sheet="VerifyInvalidLoginPage";
		int count=Excel.getRowCount(path, sheet);
		
		for(int i=1;i<=count;i++)
		{
			String un=Excel.getCellValue(path, sheet, i,1);
			String pw=Excel.getCellValue(path, sheet, i, 2);
			
			LoginPage l1=new LoginPage(driver);
			l1.setusername(un);
			l1.setpassword(pw);
			l1.clicklogin();
			
			Invalidloginpage i1=new Invalidloginpage(driver);
			i1.errormsg();
		
		}
	}

}
