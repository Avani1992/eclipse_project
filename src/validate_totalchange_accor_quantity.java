/*Open link http://automationpractice.com/index.php
2. Login to the website.
3. Move your cursor over Women's link.
4. Click on sub menu 'T-shirts'.
5. Mouse hover on the second product displayed.
6. 'More' button will be displayed, click on 'More' button.
7. Make sure quantity is set to 1.
8. Select size 'M'
9. Select color of your choice.
10. Click 'Add to Cart' button.
11. Click 'Proceed to checkout' button.
12. Change the quantity to 2.
13. Verify that Total price is changing and reflecting correct price.

 * 
 * */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class validate_totalchange_accor_quantity {
	
	public class validate_buy_order_func {
		
		public WebDriver driver;
		@BeforeMethod()
		public void drivercall()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver(); 
		}
		@Test
		public void validate_total() throws InterruptedException 
		{
			driver.get(" http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			// signin click
			driver.findElement(By.xpath("//a[@class='login']")).click();
			// login
			driver.findElement(By.id("email")).sendKeys("patelavani@gmail.com");
			driver.findElement(By.id("passwd")).sendKeys("123ASD");
			driver.findElement(By.id("SubmitLogin")).click();
			
			// Mouse Hover to Women link
			Actions a1=new Actions(driver);
			a1.moveToElement(driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]"))).click().perform();
			System.out.println("1");
			Thread.sleep(1000);
	
			
			// mouse hovwer to display product
			WebElement img = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]"));
			System.out.println("3");
			// click on More
			WebElement more = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[2]/span[1]"));
			a1.moveToElement(img).moveToElement(more).click().perform();
			System.out.println("4");
			// increase quantity
			driver.findElement(By.xpath("//input[@id='quantity_wanted']")).clear();
			driver.findElement(By.xpath("//input[@id='quantity_wanted']")).sendKeys("1");
			// size change
			WebElement sizelist = driver.findElement(By.id("group_1"));
			Select s1=new Select(sizelist);
			s1.selectByVisibleText("L");
			// select color
			driver.findElement(By.id("color_11")).click();
			// click Addtocart
			driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
			
			// checkout click
			driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
			
			// base price
			String price = driver.findElement(By.xpath("//td[@id='total_product']")).getText();
			System.out.println(price);
			// increase quantity
			driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
			Thread.sleep(1000);
			// changed price
			String changeprice = driver.findElement(By.xpath("//td[@id='total_product']")).getText();
			
			if(changeprice!=price)
			{
				System.out.println("TestCase Passed...");
			}
			
		}
		@AfterMethod()
		public void close()
		{
			driver.findElement(By.xpath("//a[@class='logout']")).click();
			driver.close();
		}
	}

}
