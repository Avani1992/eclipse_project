package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/DemoA.html");
		// inner frame/page 
		WebElement frame1 = driver.findElement(By.id("f1"));
		
		// enter into  inner frame..
		driver.switchTo().frame(frame1);
		
		 // 2 inner frame/page
        WebElement frame2 = driver.findElement(By.id("f2"));
		
		// enter into  2-inner frame..
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.id("t3")).sendKeys("Avani");
		
		Thread.sleep(2000);
		
		// switch to parent frmae/page
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("t2")).sendKeys("Kuman");
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("t1")).sendKeys("Kuman-Avani");
		
		Thread.sleep(2000);
		driver.close();

	}

}
