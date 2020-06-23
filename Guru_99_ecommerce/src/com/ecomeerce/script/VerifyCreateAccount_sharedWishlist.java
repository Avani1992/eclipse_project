package com.ecomeerce.script;

import org.testng.annotations.Test;

import com.ecommerce.pom.CreateAccount_sharedWishlist;

public class VerifyCreateAccount_sharedWishlist extends BaseTest{

	@Test
	public void verifyCreateAccount_sharedWishlist() throws InterruptedException
	{
		CreateAccount_sharedWishlist ca=new CreateAccount_sharedWishlist(driver);
		ca.createAccount_sharedwishlist();
	}
}
