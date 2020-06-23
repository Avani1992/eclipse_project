import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.Authentication.Failed;
import org.testng.Assert;
import org.testng.annotations.Test;

public class godaddy {
	public static WebDriver driver;
	@Test(priority=0)
	public void setbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://in.godaddy.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	@Test(priority=1)
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		try
		{
			Assert.assertEquals("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN", title);
		}
		catch(Exception ex)
		{
			System.out.println("Failed.....");
		}
		
	}
	@Test(priority=2)
	public void getcurrenturl() throws IOException
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl: "+currentUrl);
		try
		{
			File soursefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(soursefile, new File("C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\LogFile\\screenshot1.png"));
			Assert.assertEquals("https://in.godaddy.in/", currentUrl);
		}
		catch(Exception e)
		{	
			
			System.out.println("Failed.....");
		}
	}
	@Test(priority=3)
	public void getpagesourse()
	{
		String pageSource = driver.getPageSource();
		try
		{
			if(pageSource.contains("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN"))
			{
				
			}
		}
		catch(Exception ex)
		{
			System.out.println("Failed...");
		}
//		System.out.println("Pagesource: "+pageSource);
	}
	@Test(priority=5)
	public void closebrowser()
	{
		driver.close();
	}

}
