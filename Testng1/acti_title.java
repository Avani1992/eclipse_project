package Testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class acti_title {
	
	@Test
	public void title()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/tcs/login.do");
		String title = driver.getTitle();
		
		 Assert.assertEquals(title, "xyz"); //fail...driver.close() won't execute.
		
		//Assert.assertEquals(title, "actiTIME - Login"); // pass...driver.close() execute.
		
		driver.close();

	}
	@Test(priority = 1)
	public void demo()
	{
		Reporter.log("Always execute.",true);
		Reporter.log("Not depend upon pass/fail of other testcase",true);
	}

}
