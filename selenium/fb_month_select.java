package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_month_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement listbox = driver.findElement(By.id("month"));
		
		Select s1=new Select(listbox);
		
		s1.selectByIndex(2);
		Thread.sleep(1000);
		
		s1.selectByValue("9");
		Thread.sleep(1000);
		
		s1.selectByVisibleText("Aug");
		Thread.sleep(1000);
		
		//s1.deselectAll(); // only for multiple selection work...
		if(s1.isMultiple())
		{
			s1.deselectAll();
		}
		else
		{
			System.out.println("False...");
		}
		
		driver.close();
		

	}

}
