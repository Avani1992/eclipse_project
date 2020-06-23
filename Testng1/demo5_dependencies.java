package Testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo5_dependencies {
	
	@Test(dependsOnMethods = {"EditTestcase2","DeleteTestcase3"})
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
