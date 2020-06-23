package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_ksrtc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement xy = driver.findElement(By.id("fromPlaceName"));
		
		Point location = xy.getLocation();
		//System.out.println(location);
		int y=location.getY();
		//System.out.println(y);
		
		// scroll to specific location..
		js.executeScript("window.scrollTo(0,"+y+")");
		
	Thread.sleep(2000);
		driver.close();

	}

}
