package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		// sourse
		WebElement a1 = driver.findElement(By.xpath("//h1[contains(.,'Block 1')]"));
		// destination
		WebElement a4 = driver.findElement(By.xpath("//h1[contains(.,'Block 4')]"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(a1, a4).perform();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
