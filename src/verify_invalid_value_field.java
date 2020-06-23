import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verify_invalid_value_field {
	
	public WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void validate_invalid_value_field() throws InterruptedException 
	{
		driver.get(" http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("patelavani62@gmail.com");
		
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("123");
		driver.findElement(By.id("customer_lastname")).sendKeys("456");
		driver.findElement(By.id("passwd")).sendKeys("123ASD");
//		
		  driver.findElement(By.id("firstname")).sendKeys("123");
		  driver.findElement(By.id("lastname")).sendKeys("456");
		  driver.findElement(By.id("company")).sendKeys("456");
		  driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
		  driver.findElement(By.id("city")).sendKeys("XYZ");
	 // state
		  WebElement state = driver.findElement(By.id("id_state"));
		  Select s4=new Select(state);
		  s4.selectByVisibleText("Indiana");
		  // post code
		  driver.findElement(By.id("postcode")).sendKeys("560068");
	 //country
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select oSelectC=new Select(countrydropDown);
		  oSelectC.selectByVisibleText("United States");
	 // mobileno
		  driver.findElement(By.id("phone_mobile")).sendKeys("12345");
		  driver.findElement(By.id("alias")).sendKeys("Home");
		// click registration button
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		Thread.sleep(2000);
		
	// validate error msg..
		WebElement errormsg = driver.findElement(By.xpath("//div[@class='columns-container']//li[2]"));
		if(errormsg.isDisplayed())
		{
			System.out.println("Fill Valid values in fields..");
			
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
