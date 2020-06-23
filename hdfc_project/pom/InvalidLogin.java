package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InvalidLogin  extends BasePage{
	
	@FindBy(xpath="//span[contains(text(),'Username or Password is invalid. Please try again.')]")
	private WebElement errormsg;
	
	public InvalidLogin(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void errormsg()
	{
		Assert.assertTrue(errormsg.isDisplayed());
	}

}
