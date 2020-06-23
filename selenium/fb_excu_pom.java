package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_excu_pom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		fb_pom fp=new fb_pom(driver);
		
		driver.navigate().refresh();
		
		fp.setusername("Avani");
		fp.setpassword("1234");
		fp.clicklogin();

	}

}
