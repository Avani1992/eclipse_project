package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/demo3.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		// change un.
		
		js.executeScript("document.getElementById('un').value='Kuman'");
		Thread.sleep(3000);
		
		// clear un
		
		js.executeScript("document.getElementById('un').value=''");
		Thread.sleep(3000);
		
		
		driver.close();
		
		

	}

}
