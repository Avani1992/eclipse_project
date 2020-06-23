package com.ecommerce.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageTitle extends BasePage{
	
	
	
	public HomePageTitle(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void homePageTitle(String atitle)
	{
		String title = driver.getTitle();
		try
		{
			Assert.assertEquals(atitle, title);
			System.out.println("Passed..");
		}
		catch(Exception ex)
		{
			System.out.println("Failed..");
		}
	}
	public void homepagedetail(String detail)
	{
		WebElement findElement = driver.findElement(By.xpath("//h2[contains(text(),'This is demo site for')]"));
		String text = findElement.getText().trim();
		
		try
		{
			Assert.assertEquals(detail, text);
			System.out.println("Passed..");
		}
		catch(Exception ex)
		{
			System.out.println("Failed..");
		}
	}

}
