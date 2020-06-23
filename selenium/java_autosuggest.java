package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_autosuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("manual");
		
		List<WebElement> autosug = driver.findElements(By.xpath("//span[contains(.,'manual')]"));
	     
		 int size = autosug.size();
			     
		 System.out.println(size);
			     
		for(int i=0;i<size;i++)
		{
			String text = autosug.get(i).getText();
			System.out.println(text);
		}
//		autosug.get(size-1).click(); 
		
		driver.close();


	}

}
