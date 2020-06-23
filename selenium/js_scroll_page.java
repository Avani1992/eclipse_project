package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_scroll_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix/0");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// scroll page till 1000
		//js.executeScript("window.scrollBy(0,1000)");
		
		// scroll page till endof page.
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
