package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends BasePage
{

@FindBy(id="username")
private WebElement unTB;

@FindBy(name="pwd")
private WebElement pwTB;

@FindBy(id="loginButton")
private WebElement login;

public LoginPage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}

public void setusername(String name)
{
	unTB.sendKeys(name);
}

public void setpassword(String pass)
{
	pwTB.sendKeys(pass);
}

public void clicklogin()
{
	login.click();
}

}
