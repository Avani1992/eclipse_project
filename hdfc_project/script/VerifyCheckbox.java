package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.Checkbox;

public class VerifyCheckbox extends BaseTest{
	
	@Test
	public void verifyCheckbox()
	{
		Checkbox c1=new Checkbox(driver);
		c1.checkbox();
	}

}
