package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.actimind.com/");
		
		WebElement moveToE = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
		
		Actions action=new Actions(driver);
		
		// move cursor..
		action.moveToElement(moveToE).perform();
		Thread.sleep(2000);
		
		// click on  MS office link
		driver.findElement(By.xpath("//a[contains(text(),'MS Office Plug-ins')]")).click();
		
		Thread.sleep(2000);
		
		
		driver.close();

	}

}
