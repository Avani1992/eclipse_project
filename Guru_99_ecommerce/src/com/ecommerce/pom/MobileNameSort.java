package com.ecommerce.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MobileNameSort extends BasePage {

	public MobileNameSort(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void mobilenamesort()
	{
JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement xy = driver.findElement(By.xpath("//h1[contains(text(),'Mobile')]"));
		
		Point location = xy.getLocation();
		//System.out.println(location);
		int y=location.getY();
		//System.out.println(y);
		
		// scroll to specific location..
		js.executeScript("window.scrollTo(0,"+y+")");
		
		WebElement listbox = driver.findElement(By.xpath("//body[contains(@class,'catalog-category-view categorypath-mobile-html category-mobile')]/div[@class='wrapper']/div[@class='page']/div[@class='main-container col3-layout']/div[@class='main']/div[@class='col-wrapper']/div[@class='col-main']/div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/select[1]"));
		
		Select s1=new Select(listbox);
		s1.selectByVisibleText("Name");
		driver.findElement(By.xpath("//body[contains(@class,'catalog-category-view categorypath-mobile-html category-mobile')]/div[@class='wrapper']/div[@class='page']/div[@class='main-container col3-layout']/div[@class='main']/div[@class='col-wrapper']/div[@class='col-main']/div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/a[1]")).click();
		
		List<WebElement> lists = driver.findElements(By.xpath("//ul[@class='products-grid products-grid--max-4-col']"));
		
		for(int i=0;i<lists.size();i++)
		{
			System.out.println(lists.get(i).getText());
			
			if(lists.get(i).getText().contains("Sony Xperia"))
			{
				WebElement findElement = driver.findElement(By.xpath("//span[contains(text(),'$100.00')]"));
				String text = findElement.getText();
				System.out.println("Price: "+text);
			}
		}
		System.out.println("Passed....");
	}
	

}
