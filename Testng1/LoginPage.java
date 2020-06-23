package Testng1;




import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
Logger logger;
	
	@Test
	public void verifyloginpage()
	{
		logger=Logger.getLogger("amazon");
		
		logger.debug("Open the Chrome Browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		logger.debug("Enter the URL");
		driver.get("http://www.flipkart.com");
		
		
		logger.debug("Close the Browser");
		driver.close();
		
	}

}
