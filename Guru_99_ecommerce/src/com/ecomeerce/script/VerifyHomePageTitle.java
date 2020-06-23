package com.ecomeerce.script;

import org.testng.annotations.Test;

import com.ecommerce.pom.HomePageTitle;

public class VerifyHomePageTitle extends BaseTest {
	
	@Test
	public void verifyHomePageTitle()
	{
		HomePageTitle hp=new HomePageTitle(driver);
		hp.homePageTitle("Home page");
		hp.homepagedetail("This is demo site for");
	}
}
