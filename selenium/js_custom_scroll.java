package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_custom_scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=news&rlz=1C1GCEV_enIN859IN859&oq=news&aqs=chrome.0.69i59j0l4j69i60l3.924j1j4&sourceid=chrome&ie=UTF-8");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement xy = driver.findElement(By.xpath("//h3[.='Latest India News, Headlines, Stories and Videos - Rediff.com']"));
		
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
