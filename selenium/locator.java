package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/locator.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.className("c1")).click();
		//driver.findElement(By.id("id1")).click();
		//driver.findElement(By.linkText("Amazon")).click();
		driver.findElement(By.partialLinkText("Amaz")).click();
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
