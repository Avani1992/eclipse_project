package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class datepicker {
	
	public  WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void verifyDatepicker() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		
//	// frame
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
//		driver.switchTo().frame(frame1);
//		
//	// click on text box
//		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//	// click next
//		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//		Thread.sleep(1000);
//	// selcet 11
//		driver.findElement(By.xpath("//a[contains(text(),'11')]")).click();
//		Thread.sleep(1000);
//		
//	// parent frame	
//		driver.switchTo().parentFrame();
//		
//	// click dropdown calender
//		driver.findElement(By.xpath("//li[@id='DropDown DatePicker']")).click();
//		Thread.sleep(2000);
//	// inner frame
//		WebElement frame2 = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
//		driver.switchTo().frame(frame2);
//		
//	// click on textbox
//		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//		Thread.sleep(1000);
//	// select month
//		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
//		Select s1=new Select(month);
//		s1.selectByIndex(3);
//		Thread.sleep(1000);
//	// select date
//		driver.findElement(By.xpath("//a[contains(.,'6')]")).click();
//		Thread.sleep(1000);
//		
//	// patent frame
//		driver.switchTo().parentFrame();
	// icon trigger date
		driver.findElement(By.xpath("//li[@id='Icon Trigger']")).click();
		Thread.sleep(2000);
	// inner frame
		WebElement frame3 = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame3);
		
	// click on calender icon
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		Thread.sleep(1000);
	// select date
		driver.findElement(By.xpath("//a[contains(.,'15')]"));
		Thread.sleep(1000);
	}
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}

}
