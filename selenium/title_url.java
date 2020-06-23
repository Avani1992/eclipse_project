package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class title_url {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title="+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL="+currentUrl);
		
		Thread.sleep(3000);
		// browser size in terms of width , length..
		Dimension d1=new Dimension(1000, 500);
		driver.manage().window().setSize(d1);
		
		Thread.sleep(3000);
		// browser position according to x, y coordinate on screen...
		Point p1=new Point(500, 200);
		driver.manage().window().setPosition(p1);
		
		Thread.sleep(3000);
		driver.close();


	}

}
