package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// location of text
		WebElement text = driver.findElement(By.xpath("//a[.='Sign in']"));
		System.out.println(text);
		// text on button
		String text2 = text.getText();
		
		System.out.println(text2);
		
		driver.close();
		

	}

}
