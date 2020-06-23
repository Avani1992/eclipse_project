/*In order to continue the execution even if comparision fails we can use soft
Assert, which has the nonstatic method
 * */
package Testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert1 {
	
	@Test
	public void title()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		SoftAssert soft=new SoftAssert();
		
		driver.get("https://online.actitime.com/tcs/login.do");
		
		String title = driver.getTitle();
		
		 soft.assertEquals(title, "xyz"); //fail...still driver.close() execute...
		
		//soft.assertEquals(title, "actiTIME - Login"); // pass...
		
		driver.close();
		
		soft.assertAll(); // compulsory we have to write...for fail testcase...
		

	

	}

	





	private void assertEquals(String title, String string) {
		// TODO Auto-generated method stub
		
	}

	
	

}
