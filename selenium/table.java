package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/table1.html");
		// absolute x-path for find element....
		//List<WebElement> tag = driver.findElements(By.xpath("html/body/table/tbody/tr/td"));// whole table
		//List<WebElement> tag = driver.findElements(By.xpath("html/body/table/tbody/tr[1]/td[2]"));//300
		//List<WebElement> tag = driver.findElements(By.xpath("html/body/table/tbody/tr"));// sql 300 
		//List<WebElement> tag = driver.findElements(By.xpath("html/body/table/tbody/tr[2]")); // java 500
		//List<WebElement> tag = driver.findElements(By.xpath("html/body/table/tbody/tr[1]/td[1] | html/body/table/tbody/tr[2]/td[2]"));
		
		//List<WebElement> tag= driver.findElements(By.xpath("html/body/table/tbody/tr[1]/td[1] | html/body/table/tbody/tr[2]/td[1]"));// sql java
		//List<WebElement> tag= driver.findElements(By.xpath("html/body/table/tbody/tr[1]/td[1] | html/body/table/tbody/tr[2]/td[2]"));// sql 500
		
				// relative x-path..Use (//)sign instead of whole path...
		
		//List<WebElement> tag= driver.findElements(By.xpath("//tr[1]/td[1] | //tr[2]/td[1]"));// sql java
		List<WebElement> findElements = driver.findElements(By.xpath("//tr[1]/td[2]")); // 300
		
		
		for(int i=0;i<findElements.size();i++)
		{
		String text=findElements.get(i).getText();
		System.out.println(text);
		}
		driver.close();

	}

}
