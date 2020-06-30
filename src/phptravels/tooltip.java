package phptravels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**/

public class tooltip {
	
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
		driver.get("https://www.globalsqa.com/demo-site/tooltip/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// inner frame
		 WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame1);
		// text
		String text = driver.findElement(By.xpath("//h2[contains(text(),\"St. Stephen's Cathedral\")]")).getText();
		System.out.println(text);
		// tooltip msg
		String imgtext = driver.findElement(By.cssSelector("body:nth-child(2) div.ui-widget.photo:nth-child(1) a:nth-child(2) > img.ui-corner-all")).getAttribute("alt");
		System.out.println(imgtext);
		// parent frame
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
// click on forms tab
		driver.findElement(By.xpath("//li[@id='Forms Based']")).click();
		Thread.sleep(1000);
		// inner frame
		WebElement frame2 = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame2);
		System.out.println("1");
		
		String title = driver.findElement(By.xpath("//input[@id='firstname']")).getAttribute("title");
		System.out.println(title);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']")).click();
		Thread.sleep(4000);
	}
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}


}
