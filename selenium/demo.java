package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// enter url
		//driver.get("https://www.facebook.com");
		// enter first name
//		Thread.sleep(1000);
//		driver.findElement(By.id("u_0_m")).sendKeys("Avani");
//		Thread.sleep(1000);
//		driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
//		Thread.sleep(1000);
//		//driver.findElement(By.tagName("input")).sendKeys("Kothiya");
//		Thread.sleep(1000);
		
		driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/demo1.html");
		// enter username when both input type value different..
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Avani");
		Thread.sleep(1000);
		// enter last name. here both type for FN and LN is same. so we have to use xpath to differentiate them.
		// otherwise it append in first input only... 
		driver.findElement(By.xpath("html/body/input[2]")).sendKeys("Kuman");
		Thread.sleep(1000);

		// enter password..
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234");
		Thread.sleep(5000);
		// click submit button..
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(1000);

		
		driver.close();

	}

}
