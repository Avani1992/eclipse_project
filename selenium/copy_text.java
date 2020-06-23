/*copy text from one textbox to another without getAttribute().Textbox must be enabled...
 * 
 * */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copy_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/demo3.html");
		Thread.sleep(3000);
		
		WebElement unTB = driver.findElement(By.id("un"));
		// copy text from un... textbox must be enabled....
		unTB.sendKeys(Keys.CONTROL+"ac");
		
		WebElement pwTB = driver.findElement(By.id("pw"));
		// paste text to pw...
		pwTB.sendKeys(Keys.CONTROL+"v");
		
		driver.close();

	}

}
