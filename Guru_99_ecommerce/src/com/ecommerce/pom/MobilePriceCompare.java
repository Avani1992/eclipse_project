package com.ecommerce.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MobilePriceCompare  extends BasePage{

	public MobilePriceCompare(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void mobilePriceCompare(String price2) throws InterruptedException
	{
JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement xy = driver.findElement(By.xpath("//h1[contains(text(),'Mobile')]"));
		
		Point location = xy.getLocation();
		//System.out.println(location);
		int y=location.getY();
		//System.out.println(y);
		
		// scroll to specific location..
		js.executeScript("window.scrollTo(0,"+y+")");

		WebElement findElement = driver.findElement(By.xpath("//span[contains(text(),'$100.00')]"));
		String price = findElement.getText();
		System.out.println("Price: "+price);
		
//		driver.findElement(By.xpath("//h2[@class='product-name']//a[contains(text(),'Sony Xperia')]")).click();
//		System.out.println("1");
//		String currentUrl2 = driver.getCurrentUrl();
//		System.out.println("error: "+currentUrl2);
//		driver.findElement(By.xpath("//input[@class='btn']")).click();
//		System.out.println("2");
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		Thread.sleep(2000);
//		WebElement more = driver.findElement(By.xpath("//h2[contains(text(),'More Views')]"));
//		
//		Point location1 = more.getLocation();
//		//System.out.println(location);
//		int y1=location1.getY();
//		//System.out.println(y);
//		
//		// scroll to specific location..
//		js.executeScript("window.scrollTo(0,"+y1+")");
//
//		WebElement findElement2 = driver.findElement(By.xpath("//span[@class='price']"));
//		String price2 = findElement2.getText();
		try
		{
		Assert.assertEquals(price, price2);
		System.out.println("Passed");
		}
		catch(Exception ex)
		{
			System.out.println("Failed");
		}

	}

}
