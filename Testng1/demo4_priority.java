package Testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo4_priority {
	
	@Test
	public void Testcase1()
	{
		Reporter.log("Testcase1",true);
	}
	@Test(priority = 2)
	public void Testcase2()
	{
		Reporter.log("Testcase2",true);
	}
	@Test(priority = 1)
	public void Testcase3()
	{
		Reporter.log("Testcase3",true);
	}


}
