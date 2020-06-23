import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class autosuggestion {
	
	public WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test()
	public void autosuggestionmethod() throws InterruptedException
	{
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial");
		Thread.sleep(2000);
		List<WebElement> data = driver.findElements(By.className("sbtc"));
		int size=data.size();
		System.out.println(size);
		for(int i=0;i<data.size();i++)
		{
			String text = data.get(i).getText();
			System.out.println(text);
		}
	}
	@AfterMethod()
	public void close()
	{
		driver.close();
	}

}
