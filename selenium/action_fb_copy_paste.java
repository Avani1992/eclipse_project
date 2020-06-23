package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_fb_copy_paste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement unTB = driver.findElement(By.id("email"));
		unTB.sendKeys("Avani");
		
		Actions action=new Actions(driver);
		
		action.doubleClick(unTB).perform();
		action.sendKeys((Keys.CONTROL+"c")).perform();
		
		Thread.sleep(2000);
		
		WebElement pwTB = driver.findElement(By.id("pass"));
		action.moveToElement(pwTB).click().perform();
		action.sendKeys((Keys.CONTROL+"v")).perform();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
