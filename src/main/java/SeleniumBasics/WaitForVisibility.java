package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForVisibility {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = "https://app.hubspot.com/login";
		driver.get(url);

		By email = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		By footer = By.cssSelector("footer br");
//		waitForElementVisible(email, 5).sendKeys("abc@gmail.com");
//		waitForElementPresent(email,5).sendKeys("abc@gmail.com");
//		waitForElementToBeVisible(password,1).sendKeys("test@12345");
//		waitForElementToBeVisible(loginButton,1).click();
		//waitForElementPresent(loginButton,5).click();
		//waitForElementToBeVisible(footer,2); // it is present on dom but not visible
		ElementUtil util = new ElementUtil(driver)  ;
	/*	System.out.println(util.isElementDisplayed(email, 2));
		driver.findElement(email).sendKeys("abc@gmail.com");*/
		util.elementDisplayed(email, 3).sendKeys("abc@gmail.com");
	//	driver.findElement(email).sendKeys("abc@gmail.com");
		
		
	}

	public static WebElement waitForElementToBeVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));

	}
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}
	public List<WebElement> visibilityOfAllElements(By locator,int timeOut){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static WebElement waitForElementPresent(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
	return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	
}
