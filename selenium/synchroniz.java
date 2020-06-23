package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class synchroniz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\geckodriver-v0.25.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		
		
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("patelavani42@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("avanipatel0604");
		driver.findElement(By.id("passwordNext")).click();
		//Thread.sleep(2000);
		
		driver.close();
	}

}
