/*check whether textbox is enable,disable,copy text from one field to another textbox.
 * clear textbox data with and without clear.
 * 
 * */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enable_selected_check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/demo3.html");
		Thread.sleep(3000);
		// store id of un textbox.
		WebElement unTB = driver.findElement(By.id("un"));
		
		// store textbox's text.textbox is disabled then we use getAttribute(String) method.
		String text = unTB.getAttribute("value");
		//System.out.println(text);
		
		// copy text from one textbox to another one.
		
		WebElement pwTB = driver.findElement(By.id("pw"));
		pwTB.sendKeys(text);
		
		Thread.sleep(2000);
		
					// check textbox is enabled or desebled...
		
//		if(unTB.isEnabled())
//		{
//			System.out.println("Enabled...");
//		}
//		else
//		{
//			System.out.println("Disabled...");
//		}
		
					// clear enabled textbox using clear and send another text.
		
//		if(pwTB.isEnabled())
//		{
//			//System.out.println("Enabled...");
//			pwTB.clear();
//			pwTB.sendKeys("Kuman");
//			Thread.sleep(2000);
//			System.out.println("Text changed...");
//		}
//		else
//		{
//			System.out.println("Disabled...");
//		}
		
					// clear textbox without using clear.
		
		pwTB.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		Thread.sleep(2000);
		System.out.println("Text clear...");
		
		
				// copy text from one to another without using getAttribute().
		
		
		driver.close();
		

	}

}
