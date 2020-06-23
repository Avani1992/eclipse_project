/*check radiobutton selected or not.find width,height,fontsize and location(x,y axes) of textbox...
 * 
 * */

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_w_h_size {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement Tb = driver.findElement(By.id("email"));
		
		// width & height... 
		Dimension wh = Tb.getSize();
		System.out.println(wh);
		
		// x & y axes
		
		Point xy = Tb.getLocation();
		System.out.println(xy);
		
		// font-size
		
		String fs = Tb.getCssValue("font-size");
		System.out.println(fs);
		
		// check radiobutton selected or not...
		WebElement radio = driver.findElement(By.id("u_0_6"));
		
		
		
		Thread.sleep(2000);
		if(radio.isSelected())
		{
			System.out.println("True...");
		}
		else
		{
			System.out.println("False...");
		}
		
		driver.close();

	}

}
