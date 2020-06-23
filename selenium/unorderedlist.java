package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class unorderedlist {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/unorderedlist.html");
	List<WebElement> allElements = driver.findElements(By.xpath("html/body/ul/li"));
//    System.out.println(allElements);

    for (WebElement element: allElements) {
        System.out.println(element.getText());
           
	}
    driver.close();
	}
	

}
