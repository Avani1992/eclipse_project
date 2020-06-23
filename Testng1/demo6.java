package Testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo6 {
	
	 @Test(priority=0)
	 public void destDemo1()
		   {
	Reporter.log("Hello-1",true);
		   	}
		
	 @Test(priority=2)
	public void aestDemo()
		{
	 Reporter.log("Hi",true);
		}
	   
	   @Test
	public void eestDemo1()
		{
	Reporter.log("Hello",true);
		}
			
	   @Test
	   public void bestDemo1()
	   	{
	   Reporter.log("How are you",true);
	   	}


}
