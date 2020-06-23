package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class acti_excu_pom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.actitime.com/tcs/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		acti_pom ap=new acti_pom(driver);
		
		driver.navigate().refresh();
		
		ap.setusername("patelavani42@gmail.com");
		ap.setpassword("manager");
		ap.checkbox();
		
		ap.clicklogin();
		Thread.sleep(2000);
		
		ap.clicklogout();
		Thread.sleep(2000);
	
		
		driver.close();

	}

}
