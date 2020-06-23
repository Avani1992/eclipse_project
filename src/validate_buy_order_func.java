/*. Open link http://automationpractice.com/index.php
2. Login to the website.
3. Move your cursor over Women's link.
4. Click on sub menu 'T-shirts'.
5. Mouse hover on the second product displayed.
6. 'More' button will be displayed, click on 'More' button.
7. Increase quantity to 2.
8. Select size 'L'
9. Select color.
10. Click 'Add to Cart' button.
11. Click 'Proceed to checkout' button.
12. Complete the buy order process till payment.
13. Make sure that Product is ordered.
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

public class validate_buy_order_func {
	
	public WebDriver driver;
	@BeforeMethod()
	public void drivercall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	@Test
	public void validate_buy_order_func() throws InterruptedException 
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
		// click on T-shirts
		
		// mouse hovwer to display product
		WebElement img = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		System.out.println("3");
		// click on More
		WebElement more = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[2]/span[1]"));
		a1.moveToElement(img).moveToElement(more).click().perform();
		System.out.println("4");
		// increase quantity
		driver.findElement(By.xpath("//input[@id='quantity_wanted']")).clear();
		driver.findElement(By.xpath("//input[@id='quantity_wanted']")).sendKeys("2");
		// size change
		WebElement sizelist = driver.findElement(By.id("group_1"));
		Select s1=new Select(sizelist);
		s1.selectByVisibleText("L");
		// select color
		driver.findElement(By.id("color_14")).click();
		// click Addtocart
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		
		// checkout click
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
		driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
		// select Agreement
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
		// choose payment option
		driver.findElement(By.xpath("//a[@class='cheque']//span[contains(text(),'(order processing will be longer)')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
		
		String msg = driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		if(msg.contains("complete"))
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
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		driver.close();
	}


}
