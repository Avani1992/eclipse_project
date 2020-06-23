package Testng1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class fb_shot_listener  extends TestListenerAdapter{
	
	public void onTestFailure(ITestResult tr)
	{
		TakesScreenshot shot=((TakesScreenshot)fb_screenshot.driver);
		
		File srcfile=shot.getScreenshotAs(OutputType.FILE);
		System.out.println(srcfile.getName());
		
		File desfile=new File("C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium prog\\"+tr.getName()+".png");
		
		try {
			FileUtils.copyFile(srcfile, desfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
