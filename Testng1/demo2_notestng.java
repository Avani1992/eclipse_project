package Testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo2_notestng {
	
	@Test
	public void Testcase1()
	{
		Reporter.log("Testcase1",true);
	}
	
	public void Testcase2() // not execute bcz of no @Test
	{
		Reporter.log("Testcase2",true);
	}
	@Test
	public void Testcase3()
	{
		Reporter.log("Testcase3",true);
	}


}
