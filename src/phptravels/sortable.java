package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sortable {
	
	public WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void verifyTooltip() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/demo-site/sorting/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// frame
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame1);
	
		// pick shipping
		WebElement shipping = driver.findElement(By.xpath("//div[contains(text(),'Shopping')]"));
		WebElement feeds = driver.findElement(By.xpath("//div[contains(text(),'Feeds')]"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(shipping, feeds).perform();
		Thread.sleep(2000);
		
		// outer frame
//		driver.switchTo().parentFrame();
//		Thread.sleep(2000);
	// click on simple list
//		driver.findElement(By.xpath("//li[@id='Simple List']")).click();
//		Thread.sleep(5000);
//		
//		// inner frame
//		WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
//		driver.switchTo().frame(frame2);
//		// pick 7
//		WebElement item7 = driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[7]"));
//		WebElement item1 = driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[1]"));
//		a1.dragAndDrop(item7, item1);
//		Thread.sleep(2000);
//		
	}
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}



}
