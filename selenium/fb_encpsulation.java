package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fb_encpsulation {
	
	// Declaration
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement login;
	
	// Initialisation
	
	public fb_encpsulation(WebDriver driver)
	{
		unTB=driver.findElement(By.id("email"));
		pwTB=driver.findElement(By.id("pass"));
		login=driver.findElement(By.id("u_0_b"));
		
	}
	//Utilisation
	
	public void setname(String un)
	{
		unTB.sendKeys(un);
	}
	public void setpassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clicklogin()
	{
		login.click();
	}
	

}
