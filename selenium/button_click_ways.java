package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button_click_ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
//		driver.findElement(By.id("username")).sendKeys("admin");
//		
//		driver.findElement(By.id("password")).sendKeys("admin");
		
		
		WebElement signin = driver.findElement(By.xpath("//button[.='Sign in']"));
		
		// 1st way
		//signin.click();
//		//2nd way
	//	signin.submit();
//		//3rd way
		signin.sendKeys(Keys.ENTER);
		
		driver.close();
//
	}

}
