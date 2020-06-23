package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		Set<String> allwindows = driver.getWindowHandles();
		
		int size = allwindows.size();
		System.out.println(size);
		
		for(String window:allwindows)
		{
			String currentUrl = driver.switchTo().window(window).getCurrentUrl();
			System.out.println(currentUrl);
			
			//String title = driver.switchTo().window(window).getTitle();
			//System.out.println(title);
		}
		
		driver.quit();
	}

}
