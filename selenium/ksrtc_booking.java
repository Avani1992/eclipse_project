package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ksrtc_booking {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://ksrtc.in/oprs-web/");
	
	driver.findElement(By.id("fromPlaceName")).sendKeys("BANGALORE");;
	
	
	driver.findElement(By.id("toPlaceName")).sendKeys("SHIRDI");
	
	driver.findElement(By.id("txtJourneyDate")).sendKeys("18/02/2020");
	Thread.sleep(2000);
	
	driver.findElement(By.className("btn btn-primary btn-lg btn-block btn-booking")).click();
	Thread.sleep(2000);
	
	driver.close();
	
}

}
