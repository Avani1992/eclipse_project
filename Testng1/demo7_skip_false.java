package Testng1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo7_skip_false {
	
	@Test
	public void createTest()
	{
		Reporter.log("CreateTest",true);
	}
	@Test
	public void editTest()
	{
		Reporter.log("EditTest",true);
	}
	@Test
	public void deleteTest()
	{
		Reporter.log("DeleteTest",true);
		Assert.assertEquals("xyz", "abc"); // make it fail..
	}
	@Test(dependsOnMethods = {"deleteTest"}) // skipped. bcz depends on delete. which is failed.
	public void runTest()
	{
		Reporter.log("RunTest",true);
	}
	

}
