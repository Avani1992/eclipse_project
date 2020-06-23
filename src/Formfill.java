import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Formfill {
	
	public static WebDriver driver;
	public String title;
	@Test(priority=0)
	public void setbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	public void filldetail() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Avani");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patel");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("exp-4")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("datepicker")).sendKeys("01-01-1992");
		Thread.sleep(1000);
		
		driver.findElement(By.id("profession-1")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("tool-2")).click();
		Thread.sleep(1000);
		
		WebElement findElement =driver.findElement(By.xpath("//select[@id='continents']"));
		Select s1=new Select(findElement);
		s1.selectByIndex(1);
		Thread.sleep(1000);
		
		WebElement commands = driver.findElement(By.id("selenium_commands"));
		Select s2=new Select(commands);
		s2.selectByVisibleText("WebElement Commands");
		Thread.sleep(1000);
		
		//driver.findElement(By.linkText("Click here to Download File")).click();
		//Thread.sleep(1000);
		
		
		
		
	}
	@Test(priority=2)
	public void closebrowser()
	{
		driver.close();
	}

}
