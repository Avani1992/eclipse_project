package Testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo3_order {
	
	@Test
	public void CreateTestcase1()
	{
		Reporter.log("Testcase1",true);
	}
	@Test
	public void EditTestcase2()
	{
		Reporter.log("Testcase2",true);
	}
	@Test
	public void DeleteTestcase3()
	{
		Reporter.log("Testcase3",true);
	}


}
