package com.hdfc_project.script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.hdfc_project.pom.Version;

public class VerifyVersionE extends BaseTest {
	
	@Test
	public void verifyVersionE() throws EncryptedDocumentException, IOException
	{
		String sheet="VerifyVersionE";
		
		String ver=Excel.getCellValue(PATH, sheet, 1, 1);
				
		System.out.println(ver);
		
		Version v1=new Version(driver);
		v1.verifyVersion(ver);
				
				
				
	}

}
