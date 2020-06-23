package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("u_0_m")).sendKeys("Avani1");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_o")).sendKeys("Patel");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_r")).sendKeys("9426592317");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_w")).sendKeys("avaniP92");
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("6");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("Apr");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1992");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_6")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(6000);
		driver.close();
		

	}

}
