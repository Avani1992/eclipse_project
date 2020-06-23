package com.hdfc_project.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutomationConstant {
	
	public static WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://online.actitime.com/tcs/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}

}
