package com.ecomeerce.script;

import org.testng.annotations.Test;

import com.ecommerce.pom.HomePageTitle;
import com.ecommerce.pom.MobileNameSort;
import com.ecommerce.pom.MobilePage;

public class VerifyMobileNameSort extends BaseTest{
	
	@Test
	public void verifyMobileNameSort()
	{
		HomePageTitle hm=new HomePageTitle(driver);
		MobilePage mp=new MobilePage(driver);
		mp.clickMobile();
		MobileNameSort mns=new MobileNameSort(driver);
		mns.mobilenamesort();
	}

}
