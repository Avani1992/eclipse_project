package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_all_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement findElement = driver.findElement(By.name("q"));
		
		// Enter selenium
		findElement.sendKeys("selenium");
		
		// press enter
		findElement.sendKeys(Keys.ENTER);
		//
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		// count of links
		int count=alllinks.size();
		System.out.println("Total count:"+count);
		
		//print text of all links..
		for(int i=0;i<count;i++)
		{
			String text = alllinks.get(i).getText();
			if(text.length()>0)
			{
				System.out.println(text);
			}
		}
		
		driver.close();
	}

}
