package com.ecommerce.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class CreateAccount_sharedWishlist extends BasePage {

	public CreateAccount_sharedWishlist(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@SuppressWarnings("deprecation")
	public void createAccount_sharedwishlist() throws InterruptedException
	{
		// click on MyAccount link..
		driver.findElement(By.xpath("//div[@id='header-account']//a[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		
		System.out.println("123");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.linkText("Register"));
		
		Point p=element.getLocation();
		int y=p.getY();
		
		js.executeScript("window.scrollTo(0,"+y+")");
		
		// click on Create An Account
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//p[@class='required']"));
		Point p2=element2.getLocation();
		int y2=p2.getY();
		
		js.executeScript("window.scrollTo(0,"+y2+")");
		Thread.sleep(1000);
		
		//first name
		String fn="Avani123";
		driver.findElement(By.id("firstname")).sendKeys(fn);
		// Middle name
		String mn="Kumar";
		driver.findElement(By.id("middlename")).sendKeys(mn);
		// Last name
		String ln="Patel12";
		driver.findElement(By.id("lastname")).sendKeys(ln);
		// Email
		driver.findElement(By.id("email_address")).sendKeys("p123atel@gmail.com");
		// password
		driver.findElement(By.id("password")).sendKeys("1234567");
		//confirm password
		driver.findElement(By.id("confirmation")).sendKeys("1234567");
		Thread.sleep(3000);
		
		WebElement element3 = driver.findElement(By.id("confirmation"));
		
		Point p3=element3.getLocation();
		int y3=p3.getY();
		js.executeScript("window.scrollTo(0,"+y3+")");
		// click on register
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]/span[1]/span[1]")).click();
		
		// read welcome msg
		WebElement element4 = driver.findElement(By.xpath("//h1[contains(text(),'My Dashboard')]"));
		Point p4=element4.getLocation();
		int y4=p4.getY();
		js.executeScript("window.scrollTo(0,"+y4+")");
		
		System.out.println("Passed...................");
		
//		String msg="Welcome,"+" "+fn+" "+mn+" "+ln+"!";
//		try
//		{
//			Assert.assertEquals(msg,welcome_text);
//			System.out.println("Passed...");
//		}
//		catch(Exception ex)
//		{
//			System.out.println("Failed...");
//		}
		
	}

}
