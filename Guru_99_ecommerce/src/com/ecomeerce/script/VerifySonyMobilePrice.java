package com.ecomeerce.script;

import org.testng.annotations.Test;

import com.ecommerce.pom.MobilePage;
import com.ecommerce.pom.MobilePriceCompare;

public class VerifySonyMobilePrice extends BaseTest{
	
	@Test
	public void verifySonyMobilePrice() throws InterruptedException
	{
		MobilePage mp=new MobilePage(driver);
		mp.clickMobile();
		
		MobilePriceCompare mc=new MobilePriceCompare(driver);
		mc.mobilePriceCompare("$100.00");
	}

}
