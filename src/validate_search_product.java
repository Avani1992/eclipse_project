import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class validate_search_product {
	
	public WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void validate_search() throws InterruptedException 
	{
		driver.get(" http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// signin click
		driver.findElement(By.xpath("//a[@class='login']")).click();
		// click on women tab
		driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]")).click();
		//img text
		String text = driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
		// enter text in search box
		driver.findElement(By.id("search_query_top")).sendKeys(text);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		// get text from displayed item
		String text2 = driver.findElement(By.xpath("//div[@class='right-block']//a[@class='product-name'][contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
		if(text.equals(text2))
		{
			System.out.println("TestCase Passed..");
		}
		else
		{
			System.out.println("TestCase Failed..");
		}
	}
	@AfterMethod()
	public void close()
	{

		driver.close();
	}
}
