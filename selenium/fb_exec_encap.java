package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_exec_encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		fb_encpsulation fe=new fb_encpsulation(driver);
		
		driver.navigate().refresh(); // StaleElementReferenceException
		
		fe.setname("avani");
		fe.setpassword("1234");
		fe.clicklogin();
		
		driver.close();

	}

}
