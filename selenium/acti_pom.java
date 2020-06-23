package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class acti_pom {
	
	// Declaration
	@FindBy(name="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkbox;
	@FindBy(id="loginButton")
	private WebElement login;
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	// Initialisation
	public acti_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Utilisation 
	public void setusername(String un)
	{
		unTB.sendKeys(un);
	}
	public void setpassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void checkbox()
	{
		checkbox.click();
	}
	public void clicklogin()
	{
		login.click();
	}
	public void clicklogout()
	{
		logout.click();
	}

}
