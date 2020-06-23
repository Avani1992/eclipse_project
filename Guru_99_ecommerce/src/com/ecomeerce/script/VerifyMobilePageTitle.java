package com.ecomeerce.script;

import org.testng.annotations.Test;

import com.ecommerce.pom.MobilePage;

public class VerifyMobilePageTitle extends BaseTest {
	@Test
	public void verifyMobilePageTitle()
	{
		MobilePage mp=new MobilePage(driver);
		mp.clickMobile();
		mp.mobilePageTitle("Mobile");
	}

}
