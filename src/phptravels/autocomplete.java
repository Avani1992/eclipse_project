package phptravels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class autocomplete {
	
	public  WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void verifyAutocomplete() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/demo-site/auto-complete/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// frame
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		// textbox
		WebElement tb = driver.findElement(By.xpath("//input[@id='search']"));
		tb.sendKeys("a");
		Thread.sleep(1000);
		List<WebElement> complete = driver.findElements(By.xpath("//ul[@id='ui-id-1']"));
		int size = complete.size();
		for(int i=0;i<size;i++)
		{
			complete.get(i).click();
			Thread.sleep(1000);
			break;
		}
		Thread.sleep(2000);
	}
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}


}
