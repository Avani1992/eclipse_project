package com.bank99.pom;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public abstract class Basepage {
	
public static  WebDriver driver;
	
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String etitle)
	{
		
		String atitle=driver.getTitle();
		System.out.println(atitle);
		Assert.assertEquals(atitle,etitle);
	}


}
