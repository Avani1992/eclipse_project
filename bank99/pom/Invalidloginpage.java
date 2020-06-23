package com.bank99.pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Invalidloginpage extends Basepage{
	
	

	public Invalidloginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public void errormsg() throws  InterruptedException
	{
		Alert a1=driver.switchTo().alert();
		Thread.sleep(2000);
		String text = a1.getText();
		System.out.println(text);
		
		try
		{

		
			File scrFile = ((TakesScreenshot)a1).getScreenshotAs(OutputType.FILE);
//			// Code to save screenshot at desired location
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\LogFile\\screenshot2.png"));
		}
		catch (Exception e) {
			// TODO: handle exception
			
			
		}

		a1.accept();
	
		
	}
	
	
	

}
