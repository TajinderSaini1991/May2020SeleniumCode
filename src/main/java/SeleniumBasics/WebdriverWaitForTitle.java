package SeleniumBasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverWaitForTitle {
   static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = "https://app.hubspot.com/login";
		//String url2 = "https://amazon.com";
		driver.get(url);
		//driver.get(url2);
		System.out.println(doGetPageTitleWithContains(5,"Hub"));
		//System.out.println(doGetPageTitleWithTitleIs(10,"HubSpot Login"));
		System.out.println(doGetPageCurrentUrl(5,"hub"));
		//System.out.println(doGetPageCurrentUrl(5,"amazon"));
		
		
		

	}

	public static String doGetPageTitleWithContains(int timeout,String title){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));	
		return driver.getTitle();
	}
	
	public static String doGetPageTitleWithTitleIs(int timeout,String title){
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	
	public static String doGetPageCurrentUrl(int timeOut,String urlValue){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.urlContains(urlValue));
		return driver.getCurrentUrl();
	}
}
