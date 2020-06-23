package Testng1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class actitme_shot_listener extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr)
	{
		TakesScreenshot shot=((TakesScreenshot)actitime_screenshot.driver);
		
		// source file
		File scrfile=shot.getScreenshotAs(OutputType.FILE);
		System.out.println(scrfile.getName());
		
		//destination file
		File desfile=new File("C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium prog\\Screenshot\\"+tr.getName()+".jpg");
		
		try 
		{
			FileUtils.copyFile(scrfile, desfile);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
