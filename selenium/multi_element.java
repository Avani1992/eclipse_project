package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/multielement.html");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		// count of links..
		int count=alllinks.size();
		
		System.out.println(count);
		// print text of links..
		
		for(int i=0;i<count;i++)
		{
			String text = alllinks.get(i).getText();
			System.out.println(text);
		}
		
		// click on Facebook link...
		alllinks.get(0).click();
		Thread.sleep(2000);
		driver.close();
	}

}
