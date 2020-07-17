package com.myTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 WebDriver driver;
	 
		@Parameters("browser")
		@BeforeMethod
		public void setUp(String browserName){
			if(browserName.equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
			}
			else if (browserName.equalsIgnoreCase("firefox")){
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			
			else{
				System.out.println("please pass the correct browser");
			}
			driver.get("https://classic.crmpro.com");
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		

		@AfterMethod
		public void tearDown(){
		driver.quit();
		}

}
