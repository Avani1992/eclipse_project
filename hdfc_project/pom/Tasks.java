package com.hdfc_project.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks extends BasePage {
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasks;
	
	@FindBy(xpath="//div[@class='overlayTipWrapper']//input[@placeholder='Start typing name ...']")
	private WebElement taskname;
	
	public Tasks(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clicktasks()
	{
		tasks.click();
	}
	
	public void settaskname(String ename)
	
	{
		taskname.click();
		taskname.sendKeys(ename);
		//tasks.sendKeys(Keys.ENTER);
	}
	

}
