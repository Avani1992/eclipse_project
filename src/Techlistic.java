import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Techlistic {
	
	public static WebDriver driver;
	public String title;
	@Test(priority=0)
	public void setbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.techlistic.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void seleniumblogpage() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='overflowable-contents']//li[3]//a[1]")).click();
		//driver.findElement(By.xpath("//div[@class='overflow-popup']//a[contains(text(),'Hacking')]")).click();
		Thread.sleep(2000);
		title = driver.getTitle();	
		System.out.println("Title="+title);
		
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void closebrowser()
	{
		driver.close();
	}

}
