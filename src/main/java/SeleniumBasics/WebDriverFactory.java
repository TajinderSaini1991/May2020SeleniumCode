package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
      WebDriver driver;
 /**
  * This method launches browser on the basis of given browser name
  * @param browser
  * @return driver
  */
      
      
	public WebDriver launchBrowser(String browser){
		if (browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else{
			System.out.println("pass the correct browser");
		}
		
		
		return driver;
		
		
		
	}
/** This method is used to launch url 
 * 	
 * @param url
 */
	public void launchUrl(String url){
		driver.get(url);
	}
	/**
	 * This method return the title of the page
	 * @return page title
	 */
	public String getPageTitle(){
		return driver.getTitle();
	}
	/**
	 * This method returns current url of page
	 * @return current url
	 */
	public String getCurrentUrl(){
	return	driver.getCurrentUrl();
	}
	
	/**
	 * This method closes the browser
	 */
	
	public void closeBrowser(){
		driver.close();
	}
}
