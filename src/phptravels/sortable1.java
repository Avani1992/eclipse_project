package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sortable1 {
	
	public WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void verifysortable1() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/demo-site/sorting");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement xy = driver.findElement(By.xpath("//h1[contains(text(),'Sortable')]"));
		Point p=xy.getLocation();
		int y = p.getY();
		js.executeScript("window.scrollTo(0,"+y+")");
		// frame
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame1);
		// shipping
		WebElement shopping = driver.findElement(By.xpath("//div[contains(text(),'Shopping')]"));
		WebElement feeds = driver.findElement(By.xpath("//div[contains(text(),'Feeds')]"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(shopping, feeds).perform();
		Thread.sleep(4000);
		System.out.println("Hi");
		// parent frame
		driver.switchTo().parentFrame();
		
	// click on simple list 
		driver.findElement(By.id("Simple List")).click();
		Thread.sleep(2000);
	// inner frame
		WebElement frame2=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame2);
		
		WebElement item7 = driver.findElement(By.xpath("//li[contains(text(),'Item 7')]"));
		WebElement item1 = driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
		a1.dragAndDrop(item7, item1).perform();
		Thread.sleep(2000);
		
		WebElement item6 = driver.findElement(By.xpath("//li[contains(text(),'Item 6')]"));
		a1.dragAndDrop(item6, item1).perform();
		Thread.sleep(2000);
		
		WebElement item5 = driver.findElement(By.xpath("//li[contains(text(),'Item 5')]"));
		a1.dragAndDrop(item5, item1).perform();
		Thread.sleep(2000);
		
		WebElement item4 = driver.findElement(By.xpath("//li[contains(text(),'Item 4')]"));
		a1.dragAndDrop(item4, item1).perform();
		Thread.sleep(2000);
		
		WebElement item3 = driver.findElement(By.xpath("//li[contains(text(),'Item 3')]"));
		a1.dragAndDrop(item3, item1).perform();
		Thread.sleep(2000);
		
		WebElement item2 = driver.findElement(By.xpath("//li[contains(text(),'Item 2')]"));
		a1.dragAndDrop(item2, item1).perform();
		Thread.sleep(2000);

	}
	
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}


}
