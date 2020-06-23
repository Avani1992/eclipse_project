package Testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo8_invocationcount {
	
	@Test(invocationCount = 5)
	public void CreateTestcase1()
	{
		Reporter.log("Testcase1",true);
	}
	@Test(invocationCount = 2)
	public void EditTestcase2()
	{
		Reporter.log("Testcase2",true);
	}
	@Test(invocationCount = 3)
	public void DeleteTestcase3()
	{
		Reporter.log("Testcase3",true);
	}

}
