package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class drop_down {
	
	public  WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void verifydrop_down() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		element.click();
		
		Select s1=new Select(element);
		s1.selectByIndex(2);
		Thread.sleep(1000);
		s1.selectByVisibleText("Australia");
		Thread.sleep(1000);
		s1.selectByVisibleText("India");
		Thread.sleep(1000);
		
		
		
		
	
		
	
	}
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}

}
