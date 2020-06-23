import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verify_mandatory_field {
	
	public WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void validate_mandatory_field() throws InterruptedException 
	{
		driver.get(" http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("patelavani92@gmail.com");
		
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		
		// click registratio button
		
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		Thread.sleep(2000);
		
	// validate error msg..
		WebElement errormsg = driver.findElement(By.xpath("//div[@class='columns-container']//li[2]"));
		if(errormsg.isDisplayed())
		{
			System.out.println("Fill mandatory fields..");
			
		}
		else
		{
			System.out.println("Register sucessfully..");
		}
	}
	@AfterMethod()
	public void close()
	{
		driver.close();
	}



}
