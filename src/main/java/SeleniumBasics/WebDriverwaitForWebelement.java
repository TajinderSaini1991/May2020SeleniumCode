package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverwaitForWebelement {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = "https://app.hubspot.com/login";
		//String url2 = "https://mail.rediff.com/cgi-bin/login.cgi";
		String url3 = "https://www.freshworks.com/";
		
		driver.get(url);
		//By signIn = By.name("proceed");
		//driver.findElement(By.name("proceed")).click();
		By email = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
       waitForElementPresent(email, 4).sendKeys("test@gmail.com");
		
		driver.findElement(password).sendKeys("test123");
		
		waitForElementPresent(loginButton, 5).click();
//
//	   WebElement login =	waitForElementToBeClickable(loginButton, 2);
//		login.click();
//	   System.out.println("abc"); 
	 /*  WebDriverWait wait = new WebDriverWait(driver,10);
	   wait.until(ExpectedConditions.alertIsPresent());
	   driver.switch().alert().accept();*/
	/*  Alert alert = waitForAlertPresent(2);
		System.out.println(alert.getText());
		alert.accept();*/
     /* clickwhenReady(signIn,2);
 
	   System.out.println(waitForAlertPresent(2).getText());*/
	   
	/*  By footers = By.cssSelector("ul.footer-nav li a" );
	   
	  ElementUtil util = new ElementUtil(driver)  ;
	List<WebElement> footerLinks =  util.visibilityOfAllElements(footers, 2);
	 for(WebElement i :footerLinks){
		 System.out.println(i.getText());
	 }
	   */
   // waitForElementToBeVisible(email,10).sendKeys("abc");  
	
	}
	
	
	public static WebElement waitForElementPresent(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
	return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public static WebElement waitForElementToBeClickable(By locator,int timeOut){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return	wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public static void clickwhenReady(By locator,int timeOut){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		WebElement element =	wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	
	public static Alert waitForAlertPresent(int timeOut){
		  WebDriverWait wait = new WebDriverWait(driver,timeOut);
		  return  wait.until(ExpectedConditions.alertIsPresent());
	}
	public static WebElement waitForElementToBeVisible(By locator,int timeOut){
		 WebDriverWait wait = new WebDriverWait(driver,timeOut);
		 return   wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
		    
	}
	public static WebElement getElement(By locator) {

		

		
return driver.findElement(locator);
		
		
	}

}
