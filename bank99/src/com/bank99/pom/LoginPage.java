package com.bank99.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Basepage {
	
	@FindBy(name="uid")
	private WebElement unTB;
	@FindBy(name="password")
	private WebElement pwTB;
	@FindBy(name="btnLogin")
	private WebElement login;
		
		
	public LoginPage(WebDriver driver) 
	{
			super(driver);
			PageFactory.initElements(driver,this);
	}

	public void setusername(String name)
	{
		unTB.sendKeys(name);
	}
	public void setpassword(String password)
	{
		pwTB.sendKeys(password);
	}
	public void clicklogin()
	{
		login.click();
	}


}
