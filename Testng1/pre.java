package Testng1;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class pre {
	
		 
	
	 
	 @Test
	 public static void captureScreenMethod() throws Exception{
		 
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\geckodriver-v0.25.0-win32\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
	 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(screenshotFile, new File("C:\\SoftwareTestingMaterial.png"));
	 driver.close();
	 driver.quit(); 
	 }
	

}
