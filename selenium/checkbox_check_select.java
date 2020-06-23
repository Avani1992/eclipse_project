package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_check_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.actitime.com/tcs/login.do");
		Thread.sleep(3000);
		
		WebElement chkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		chkbox.click();
		Thread.sleep(2000);
		if(chkbox.isSelected())
		{
			System.out.println("True...");
		}
		else
		{
			System.out.println("False...");
		}
		
		driver.close();

	}

}
