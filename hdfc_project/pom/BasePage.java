package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public abstract class BasePage {
 
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String etitle)
	{
		String atitle = driver.getTitle();
		Assert.assertEquals(atitle, etitle);
	}
	
	

}
