package phptravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo {
	
	public WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void validate_demo() throws InterruptedException 
	{
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(@class,'text-center flights')]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/input[1]")).sendKeys("Ahmedabad");
				Thread.sleep(1000);

		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]")).sendKeys("Ahmedabad");
		Thread.sleep(1000);
		
		
	}
	@AfterMethod()
	public void close()
	{
		driver.close();
	}

}
