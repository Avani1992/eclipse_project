package com.hdfc_project.script;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr)
	{
		
		TakesScreenshot shot=((TakesScreenshot)VerifyHomepageTitle.driver);
		
		File srcfile=shot.getScreenshotAs(OutputType.FILE);
		
		File destfile=new File("C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium prog\\Screenshot\\"+tr.getName()+".jpg");
		
		try {
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
