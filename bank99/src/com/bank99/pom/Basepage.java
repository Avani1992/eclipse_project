package com.bank99.pom;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public abstract class Basepage {
	
public WebDriver driver;
	
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String etitle)
	{
		String atitle=driver.getTitle();
		Assert.assertEquals(atitle,etitle);
	}


}
