package Testng1;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class Capturing_screenshot {
	
	public static WebDriver driver;
	

	@Test
	public void testCase_1() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	driver.get("https://www.google.co.in");
	Assert.assertEquals("abc", "xyz");
	
	}

	@Test
	public void testCase_2()
	{
	driver.findElement(By.name("q")).sendKeys("Selenium");	
	Assert.assertEquals("abc", "xyz");	
	}

	@Test
	public void testCase_3()
	{
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Assert.assertEquals("cvb", "ghjk");
		
	}

}
