package com.ecomeerce.script;

import org.testng.annotations.Test;

import com.ecommerce.pom.AddtoCart_ErrorMsg;
import com.ecommerce.pom.MobilePage;

public class AddtocartErrormsg extends BaseTest {
	
	@Test
	public void addtocartErrormsg()
	{
		MobilePage mp=new MobilePage(driver);
		mp.clickMobile();
		AddtoCart_ErrorMsg ae=new AddtoCart_ErrorMsg(driver);
		ae.addtocart_errormsg();
	}

}
