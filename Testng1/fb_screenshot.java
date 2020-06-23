package Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class fb_screenshot {
	
	public static WebDriver driver;
	
	@Test(priority = 1)
	public void url()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test(priority = 2)
	public void username()
	{
		System.out.println("2");
		driver.findElement(By.id("email")).sendKeys("Avani");
		Assert.assertEquals("abc", "abc");
	}
	@Test(priority=3)
	public void password()
	{
		System.out.println("3");
		driver.findElement(By.id("pass")).sendKeys("1234");
		Assert.assertEquals("abc", "xyz");
	}
	@Test(dependsOnMethods = {"url"})
	public void login() throws InterruptedException
	{
		System.out.println("1");
		driver.findElement(By.id("u_0_b")).click();
		Assert.assertEquals("xyz", "vbn");		
		driver.close();
	}

}
