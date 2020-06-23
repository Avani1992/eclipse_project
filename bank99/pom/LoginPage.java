package com.bank99.pom;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
		try
		{

		
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			// Code to save screenshot at desired location
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\LogFile\\screenshot.png"));
		}
		catch (Exception e) {
			// TODO: handle exception
			
			
		}
		login.click();
	}


}
