package Testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1  extends Base_ng{
	
	@Test
	public void Testcase1()
	{
		Reporter.log("Testcase1",true);
	}
	@Test
	public void Testcase2()
	{
		Reporter.log("Testcase2",true);
	}
	@Test
	public void Testcase3()
	{
		Reporter.log("Testcase3",true);
	}

}
