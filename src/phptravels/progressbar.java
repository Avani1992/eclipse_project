package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class progressbar {
	
	public  WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void verifyProgressbar() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/demo-site/progress-bar/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// frame
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		// click on Download
		driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
		Thread.sleep(4000);
		// cancel
		driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']")).click();
		Thread.sleep(1000);
	}
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}


}
