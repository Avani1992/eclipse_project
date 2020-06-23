package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		
		Thread.sleep(2000);
		
		// switch to alert popup..
		Alert alert=driver.switchTo().alert();
		
		// click ok button...
		alert.accept();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("Bangalore");
		
		Thread.sleep(3000);
		driver.close();

	}

}
