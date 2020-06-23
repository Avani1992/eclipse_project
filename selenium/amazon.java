package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&switch_account=");
		
//		driver.findElement(By.id("nav-a nav-a-2")).click();
//		Thread.sleep(1000);
//		
		//driver.findElement(By.className("a-aui_157141-c a-aui_72554-c a-aui_dropdown_187959-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate")).click();
		//driver.findElement(By.className("nav-action-inner")).click();
		driver.findElement(By.id("ap_email")).sendKeys("patelavani42@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("ap_password")).sendKeys("avaniamazon92");
		Thread.sleep(1000);
		
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
