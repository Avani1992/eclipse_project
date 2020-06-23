package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class window_popup {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\geckodriver-v0.25.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.xpath("//a[.='3.141.59']")).click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\testbb.exe");

		Thread.sleep(3000);
		driver.close();
	}

}
