package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_list_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		 WebElement listbox = driver.findElement(By.id("month"));
			
		Select select=new Select(listbox);
		select.selectByVisibleText("Sept");
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("6");
		Thread.sleep(2000);
		
		 driver.close();

	}

}
