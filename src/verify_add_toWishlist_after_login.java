/*1. Open link http://automationpractice.com/index.php
2. Move your cursor over Women's link.
3. Click on sub menu 'T-shirts'.
4. Mouse hover on the second product displayed.
5. 'Add to Wishlist' will appear on the bottom of that product, click on it.
6. Verify that error message is displayed 'You must be logged in to manage your wishlist.'
 * 
 * https://www.techlistic.com/2019/08/automate-buy-product-using-selenium.html*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verify_add_toWishlist_after_login {
	
	public WebDriver driver;
	@BeforeMethod()
	public void verify_wishlist()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void validate_email_address() throws InterruptedException 
	{
		driver.get(" http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		//move coursor on woman link
	
		driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]")).click();
		System.out.println("1");
		// mouse hover to display
		Actions a1=new Actions(driver);
		WebElement img = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		
		WebElement wishlist = driver.findElement(By.xpath("//a[@class='addToWishlist wishlistProd_2']"));
		a1.moveToElement(img).moveToElement(wishlist).click().perform();
		System.out.println("3");
		// error msg
		  WebElement msg = driver.findElement(By.xpath("//p[@class='fancybox-error']"));
		  Thread.sleep(2000);
		if(msg.isDisplayed())
		{
			System.out.println("Login First. TestCase Passed..");
		}
		else
		{
			System.out.println("TestCase Failed...");
		}
		
	}
	@AfterMethod()
	public void close()
	{
		driver.close();
	}


}
