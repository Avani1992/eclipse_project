package Testng1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public  abstract class Base_ng {
	
	@BeforeSuite
	public void bs()
		{
	Reporter.log("@BeforeSuite",true);
		}
	@AfterSuite
	public void as()
	{
	Reporter.log("@AfterSuite",true);
	}
	@BeforeTest
	public void bt()
	{
	Reporter.log("@BeforeTest",true);
	}
	@AfterTest
	public void at()
	{
	Reporter.log("@AfterTest",true);
	}

	
	@BeforeClass
	public void openApp()
		{
	Reporter.log("OpenApp",true);
		}
	@AfterClass
	public void closeApp()
		{
	Reporter.log("CloseApp",true);
		}
	@BeforeMethod
	public void login()
		{
	Reporter.log("Login",true);
		}
	  @AfterMethod
	public void logout()
		{
	Reporter.log("logout",true);
		}
	  
	  


}
