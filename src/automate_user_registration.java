import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class automate_user_registration {
	
	public WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void user_registration() throws InterruptedException
	{
		driver.get(" http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		// email address
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("patelavani@gmail.com");
		
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();

		
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Avani");
		driver.findElement(By.id("customer_lastname")).sendKeys("Patel");
		driver.findElement(By.id("passwd")).sendKeys("123ASD");
//		
		  driver.findElement(By.id("firstname")).sendKeys("Avani");
		  driver.findElement(By.id("lastname")).sendKeys("Patel");
		  driver.findElement(By.id("company")).sendKeys("Vsoft");
		  driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
		  driver.findElement(By.id("city")).sendKeys("XYZ");
	 // state
		  WebElement state = driver.findElement(By.id("id_state"));
		  Select s4=new Select(state);
		  s4.selectByVisibleText("Indiana");
		  // post code
		  driver.findElement(By.id("postcode")).sendKeys("56006");
	 //country
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select oSelectC=new Select(countrydropDown);
		  oSelectC.selectByVisibleText("United States");
	 // mobileno
		  driver.findElement(By.id("phone_mobile")).sendKeys("1234567898");
		  driver.findElement(By.id("alias")).sendKeys("Home");
		  // submit
		  driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	 // my accountpage
		  String text = driver.findElement(By.xpath("//span[contains(text(),'Avani Patel')]")).getText();
		  if(text.contains("Avani"))
		  {
			  System.out.println("User verified.Testcase Passed. ");
		  }
		  else
		  {
			  System.out.println("Testcase Failed..");
		  }
		
	}

	@AfterMethod()
	public void close()
	{
		driver.close();
	}

}
