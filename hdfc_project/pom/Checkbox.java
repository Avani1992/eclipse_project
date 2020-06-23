package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Checkbox extends BasePage{
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkbox;
	
	public Checkbox(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void checkbox()
	{
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected());
	}

}
