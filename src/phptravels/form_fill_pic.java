package phptravels;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class form_fill_pic {
	
	public  WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void verifyForm_fill() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	// click on chose file option
		driver.findElement(By.xpath("//input[@name='file-553']")).sendKeys("C:\\Users\\Kothiya.kuman\\Desktop\\pERSONAL\\chickmagalur\\12.jpg");
		Thread.sleep(1000);
		// first name
		driver.findElement(By.id("g2599-name")).sendKeys("ABCD");
		Thread.sleep(1000);
		driver.findElement(By.id("g2599-email")).sendKeys("ABC@gmail.com");
		Thread.sleep(1000);
		// experience
		WebElement exp = driver.findElement(By.id("g2599-experienceinyears"));
		Select s1=new Select(exp);
		s1.selectByIndex(1);
		Thread.sleep(1000);
		//expertise
		driver.findElement(By.xpath("//label[contains(text(),'Automation Testing')]")).click();
		Thread.sleep(1000);
		// Alert box
		driver.findElement(By.xpath("//button[contains(text(),'Alert Box : Click Here')]")).click();
		Alert a1=driver.switchTo().alert();
		a1.accept();
		a1.accept();
		Thread.sleep(2000);
		// comment
		driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("ASDFGHJ");
		Thread.sleep(1000);
		// submit
		driver.findElement(By.xpath("//button[@class='pushbutton-wide']")).click();
		Thread.sleep(3000);
	
	}
			
	@AfterMethod()
	public void close()
	{
		driver.close();
	}


}
