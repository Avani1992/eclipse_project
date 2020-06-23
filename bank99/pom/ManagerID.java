package com.bank99.pom;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class ManagerID extends Basepage {
	
	@FindBy(xpath="//td[contains(text(),'Manger Id : mngr263782')]")
	private static WebElement text;

	public ManagerID(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	@SuppressWarnings("deprecation")
	public void verifyManagerID(String id)
	{
		WebElement findElement = driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr263782')]"));
		String[] text2 = findElement.getText().split(": ");
		 
		System.out.println(text2[1]);
		try
		{
			Assert.assertEquals(text2[1],id);
			System.out.println("Passed...");
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			// Code to save screenshot at desired location
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\LogFile\\screenshot.png"));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed....");
			
		}
	}
	

}
