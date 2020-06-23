package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.actitime.com/tcs/login.do");
		
		driver.manage().window().maximize();
		
		WebElement rightClik = driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]"));
		
		Actions action=new Actions(driver);
		
		// perform right click..
		action.moveToElement(rightClik).contextClick().perform();
		Thread.sleep(2000);
		
		// click on Inspect
		
		action.sendKeys("S").perform();
		
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
