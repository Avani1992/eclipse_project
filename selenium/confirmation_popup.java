package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmation_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/confirmation_popup.html");
		
		driver.findElement(By.xpath("//button[.='Click Me']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		String text = alert.getText();
		System.out.println(text);
		
		 // ok button
		//alert.accept();
		Thread.sleep(2000);
		
		
		// cancel button...
		alert.dismiss();
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
