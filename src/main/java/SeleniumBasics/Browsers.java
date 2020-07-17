package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {
	
static WebDriver driver;
	public static void main(String[] args) {
		String browser = "chrome";
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SimTaj\\workspace\\chromedriver.exe ");
			driver = new ChromeDriver();
			
			
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SimTaj\\workspace\\geckodriver.exe ");	
			driver = new FirefoxDriver();
		}
		
		else{
			System.out.println("give the correct browser  name "+browser);
		}
		
		
		
		
		
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\SimTaj\\workspace\\geckodriver.exe ");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fb.com");
	}

}
