package SeleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openapp {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SimTaj\\workspace\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		
		
		
		
		
		
		
		
	}

}
