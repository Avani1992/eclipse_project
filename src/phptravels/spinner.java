package phptravels;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class spinner {
	
	public  WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void verifySpinner() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/demo-site/spinner/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		
//	// frame
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
//		driver.switchTo().frame(frame1);
//		// increase
//		
//		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
//		Thread.sleep(1000);
//	// decrease	
//		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']")).click();
//		Thread.sleep(1000);driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']")).click();
//		Thread.sleep(1000);
//		
//	// parent frame
//		driver.switchTo().parentFrame();
	// simple spinner
		driver.findElement(By.xpath("//li[@id='Simple Spinner']")).click();
		Thread.sleep(2000);
	// inner frame
		WebElement frame2 = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame2);
	// set value to 5
		driver.findElement(By.xpath("//button[@id='setvalue']")).click();
		Thread.sleep(1000);
	// increase
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
		Thread.sleep(1000);
	// decrase
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(1000);
	// get value
		driver.findElement(By.xpath("//button[@id='getvalue']")).click();
	
	Alert a1=driver.switchTo().alert();
	String text = a1.getText();
	System.out.println("Value="+text);
	Thread.sleep(2000);
	a1.accept();
	Thread.sleep(2000);
	
	WebElement tb = driver.findElement(By.xpath("//body//p[1]"));
	if(tb.isEnabled())
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("No");
		
	}
	Thread.sleep(1000);
	// disable it.
	driver.findElement(By.xpath("//button[@id='disable']")).click();
	Thread.sleep(1000);
	WebElement tb1 = driver.findElement(By.xpath("//input[@id='spinner']"));
	if(tb1.isEnabled())
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("No");
	}
	
	
		
		
		
		
		
	
	}
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}

}
