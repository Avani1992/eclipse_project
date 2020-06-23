package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class fb_pom {

	
		@FindBy(id="email")
		private WebElement unTB;
		@FindBy(id="pass")
		private WebElement passTB;
		@FindBy(id="u_0_b")
		private WebElement login;
		
		public fb_pom(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void setusername(String un)
		{
			unTB.sendKeys(un);
		}
		public void setpassword(String pass)
		{
			passTB.sendKeys(pass);
		}
		public void clicklogin()
		{
			login.click();
		}
}
