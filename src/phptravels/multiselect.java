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

public class multiselect {
	
	public  WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void verifymultiselect() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/demo-site/select-elements/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// frame
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
//		driver.switchTo().frame(frame1);
//		
//		WebElement item1 = driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
		Actions a1=new Actions(driver);
//		a1.keyDown(Keys.CONTROL).click(item1).keyUp(Keys.CONTROL).perform();
//		Thread.sleep(2000);
//		
//		WebElement item3 = driver.findElement(By.xpath("//li[contains(text(),'Item 3')]"));
//		
//		a1.keyDown(Keys.CONTROL).click(item3).keyUp(Keys.CONTROL).perform();
//		Thread.sleep(2000);
//		
//		WebElement item5 = driver.findElement(By.xpath("//li[contains(text(),'Item 5')]"));
//		
//		a1.keyDown(Keys.CONTROL).click(item5).keyUp(Keys.CONTROL).perform();
//		Thread.sleep(2000);
//		
//		WebElement item6 = driver.findElement(By.xpath("//li[contains(text(),'Item 6')]"));
//		
//		a1.keyDown(Keys.CONTROL).click(item6).keyUp(Keys.CONTROL).perform();
//		Thread.sleep(2000);
//		
//	// parent frame
//		driver.switchTo().parentFrame();
//		
//	// Grid Element
//		driver.findElement(By.xpath("//li[@id='Grid Selection']")).click();
//		Thread.sleep(2000);
//		
//		// innerframe
//		WebElement frame2 = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
//		driver.switchTo().frame(frame2);
//		
//		// press2
//		WebElement item2 = driver.findElement(By.xpath("//li[contains(.,'2')]"));
//		a1.keyDown(Keys.CONTROL).click(item2).keyUp(Keys.CONTROL).perform();
//		Thread.sleep(1000);
//		
//		// press4
//		WebElement item4 = driver.findElement(By.xpath("//li[contains(.,'4')]"));
//		a1.keyDown(Keys.CONTROL).click(item4).keyUp(Keys.CONTROL).perform();
//		Thread.sleep(1000);
//		
//		//press5
//		WebElement item9 = driver.findElement(By.xpath("//li[contains(.,'9')]"));
//		a1.keyDown(Keys.CONTROL).click(item9).keyUp(Keys.CONTROL).perform();
//		Thread.sleep(1000);
//		
//		//press7
//		WebElement item7 = driver.findElement(By.xpath("//li[contains(.,'7')]"));
//		a1.keyDown(Keys.CONTROL).click(item7).keyUp(Keys.CONTROL).perform();
//		Thread.sleep(1000);
//		
//		//press10
//		WebElement item12 = driver.findElement(By.xpath("//li[contains(.,'12')]"));
//		a1.keyDown(Keys.CONTROL).click(item12).keyUp(Keys.CONTROL).perform();
//		Thread.sleep(1000);
//		
//	// parent frame
//		driver.switchTo().parentFrame();
		
	// serialize
		driver.findElement(By.xpath("//li[@id='Serialize']")).click();
		Thread.sleep(2000);
		// frame3
		WebElement frame3 = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame3);
		
		// item1
		WebElement items1 = driver.findElement(By.xpath("//li[contains(.,'Item 1')]"));
		a1.keyDown(Keys.CONTROL).click(items1).keyUp(Keys.CONTROL).perform();
		Thread.sleep(1000);
		
		// item1
		WebElement items3 = driver.findElement(By.xpath("//li[contains(.,'Item 3')]"));
		a1.keyDown(Keys.CONTROL).click(items3).keyUp(Keys.CONTROL).perform();
		Thread.sleep(1000);
				
		// item1
		WebElement items4 = driver.findElement(By.xpath("//li[contains(.,'Item 4')]"));
		a1.keyDown(Keys.CONTROL).click(items4).keyUp(Keys.CONTROL).perform();
		Thread.sleep(1000);
		
	// result
		WebElement result = driver.findElement(By.xpath("//span[@id='select-result']"));
		System.out.println(result.getText());
		
		
	
	}
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}

}
