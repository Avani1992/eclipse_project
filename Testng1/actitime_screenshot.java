package Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actitime_screenshot {
	
	public static WebDriver driver;
	
	@Test(priority = 1)
	public void url()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://online.actitime.com/tcs/login.do");
		driver.manage().window().maximize();
	}
	@Test(priority = 2)
	public void username()
	{
		//System.out.println("2");
		driver.findElement(By.id("username")).sendKeys("patelavani42@gmail.com");
		Assert.assertEquals("abc", "abc");
	}
	@Test(priority=3)
	public void password()
	{
	
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
	}
	@Test(priority = 4)
	public void chkbox() 
	{
		
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Assert.assertEquals("xyz", "vbn");		
	}
	@Test(priority = 5)
	public void login()
	{
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
	}
	@Test(priority=6)
	public void logout()throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("logoutLink")).click();
		Assert.assertEquals("acv", "acb");
		driver.close();
	}

	
	
	
	

}
