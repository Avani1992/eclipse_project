package com.ecommerce.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddtoCart_ErrorMsg extends BasePage {
	
	 public AddtoCart_ErrorMsg(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	 
	 public void addtocart_errormsg()
	 {
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			
			WebElement xy = driver.findElement(By.xpath("//h1[contains(text(),'Mobile')]"));
			
			Point location = xy.getLocation();
			//System.out.println(location);
			int y=location.getY();
			//System.out.println(y);
			
			// scroll to specific location..
			js.executeScript("window.scrollTo(0,"+y+")");

		 driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/button")).click();	
//		    
//		    // 4. Change ‘QTY’ value to 1000 and click ‘UPDATE’ button. 
//		    //    Expected "The requested quantity for "Sony Xperia" is not available." error message is displayed. 
//		    
//		    driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")).clear();	    
//		    driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")).sendKeys("1000");	
//		    driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/button")).click();
//		   	    
//		    // 5. Verify the error message
//		    String reqQty = driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[2]/p")).getText();	    
//		    String msgQty = ("* The requested quantity for \"Sony Xperia\" is not available.");
//		    try {	    	
//		    	Assert.assertEquals(reqQty, msgQty);
//			    } catch (Exception e) {
//			    	e.printStackTrace();	    	
//			    }	
//		    
//		    // 6. Click on ‘EMPTY CART’ link in the footer of list of all mobiles. A message "SHOPPING CART IS EMPTY" is shown.
//		    
//		    driver.findElement(By.xpath(".//*[@id='empty_cart_button']")).click();
//		    	    
//		    // 7. Verify cart is empty
//		    String noItemsStg = ("You have no items in your shopping cart.");
//		    String noItemsMsg = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div/div[2]/p[1]")).getText();
//		    System.out.println("You have no items msg = " + noItemsMsg);
//		    
//		    try {	    	
//	    	Assert.assertEquals(noItemsStg, noItemsMsg);
//		    } catch (Exception e) {
//		    	e.printStackTrace();	    	
//		    }	
		
	 }

}
