import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon {
	
	public static WebDriver driver;
	public String title;
	@Test(priority=0)
	public void setbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void gettitle()
	{
		title = driver.getTitle();	
		System.out.println("Title="+title);
	}
	@Test(priority=2)
	public void clickAmazonPay() throws InterruptedException
	{
		driver.findElement(By.linkText("Amazon Pay")).click();
		Thread.sleep(2000);
		String paytitle = driver.getTitle();
		System.out.println("AmazonPAy Title: "+paytitle);
	}
	@Test(priority=3)
	public void navigateHomePage()
	{
		driver.navigate().back();
		String Hometitle = driver.getTitle();
		System.out.println(Hometitle);
		try
		{
			Assert.assertEquals(title, Hometitle);
		}
		catch(Exception ex)
		{
			System.out.println("Failed....");
		}
	}
	@Test(priority=4)
	public void closebrowser()
	{
		driver.close();
	}
}
