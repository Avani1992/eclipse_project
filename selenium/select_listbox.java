package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_listbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/select_listbox.html");

		WebElement listbox = driver.findElement(By.id("slv"));
		// Select is a class....
		Select s1=new Select(listbox);
		
		//List<WebElement> list = driver.findElements(By.xpath("//option"));
		//int size=list.size();
		
		List<WebElement> options = s1.getOptions();
		// count of option
		
		int size = options.size();
		System.out.println("count is:"+size);
		
		// print text
		System.out.println("List is:");
		for(int i=0;i<size;i++)
		{
			String text = options.get(i).getText();
			
			System.out.println(text);
		}
		
		
		
		Thread.sleep(2000);
		s1.selectByIndex(1); // java
		
		Thread.sleep(2000);
		s1.selectByValue("se"); // selenium
		
		Thread.sleep(2000);
		s1.selectByVisibleText("Pearl"); // pearl
		
		Thread.sleep(2000);
		// check for multiple select
		if(s1.isMultiple())
		{
			Thread.sleep(2000);
			s1.deselectByIndex(1); // java deselect
			
			Thread.sleep(2000);
			s1.deselectByValue("se"); // selenium deselect
			
			Thread.sleep(2000);
			s1.deselectByVisibleText("Pearl");  // deselect pearl
			//s1.deselectAll(); // deselectAll
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("False...");
		}
		driver.close();
		
		
		
	}

}
