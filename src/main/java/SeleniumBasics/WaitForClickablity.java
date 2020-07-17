package SeleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForClickablity {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	/*	String url = "https://app.hubspot.com/login";
		
		driver.get(url);
		Thread.sleep(5000);
//		By email = By.id("username");
//		By password = By.id("password");
		By loginButton = By.cssSelector("#loginBtn");
		WebElement lgn = driver.findElement(loginButton);
		lgn.click();
		System.out.println("abc");
		System.out.println(lgn.isEnabled());
		System.out.println(lgn.isDisplayed());
		ElementUtil util = new ElementUtil(driver)  ;
		//util.waitForElementPresent(email, 5).sendKeys("test@gmail.com");
		
		//driver.findElement(password).sendKeys("abc@12345");
		util.waitForElementToBeClickable(loginButton, 4).click();
		System.out.println(lgn.isEnabled());
		System.out.println(lgn.isDisplayed());
		System.out.println("abc");
		*/
		
		/*String url = "http://only-testing-blog.blogspot.com/2013/11/new-test.html";
		driver.get(url);
		
		By submit = By.id("submitButton");
		
		
		waitForElementToBeClickable(submit,3).click();*/
		
		
		
		
		
		
		
	}
	public static WebElement waitForElementToBeClickable(By locator,int timeOut){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return	wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	

