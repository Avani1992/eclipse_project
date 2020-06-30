package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class toolbar {
	
	public  WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void verifytoolbar() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/demo-site/toolbar/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	// frame
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame1);
	// select text
		WebElement start = driver.findElement(By.xpath("//pre[contains(.,'How')]"));
		WebElement end = driver.findElement(By.xpath("//pre[contains(.,'Pole;')]"));
		Actions a1=new Actions(driver);
		a1.keyDown(Keys.CONTROL).click(start).clickAndHold().keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(1000);
		
		
	}
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}


}
