package Testng1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

public class CustomListener extends TestListenerAdapter {
	
	
	public void onTestFailure(ITestResult tr)
	{
//		File scrfile=((TakesScreenshot)Capturing_screenshot.driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(scrfile, new File("C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium prog\\Screenshot\\"+tr.getName()+".png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		TakesScreenshot takeshot=((TakesScreenshot) Capturing_screenshot.driver);
		
		File scrfile=takeshot.getScreenshotAs(OutputType.FILE);
		System.out.println(scrfile.getName());
		
		File desfile=new File("C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium prog\\shot\\"+tr.getName()+".png");
		System.out.println(desfile.getName());
		
		try 
		{
			FileUtils.copyFile(scrfile, desfile);
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
