package com.ecommerce.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class MobilePage extends BasePage {

	public MobilePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickMobile()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
	}
	
	public void mobilePageTitle(String atitle)
	{
		
		
		String title = driver.getTitle();
		try
		{
			Assert.assertEquals(atitle,title);
			System.out.println("Passed..");
		}
		catch(Exception ex)
		{
			System.out.println("Failed..");
		}
	}
	
	

}
