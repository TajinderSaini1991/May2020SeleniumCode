package SeleniumBasics;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FluentWaitConcept {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://app.hubspot.com/login");
		By email = By.id("username");
		//By password = By.id("password");
		//By loginButton = By.cssSelector("#loginBtn");

		waitForElementWithFluentWaitConcept(driver, email, 6).sendKeys("abc@gmail.com");
*/

	/*	driver.get("https://classic.crmpro.com/");

		By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.xpath("//input[@value='Login']");

		//waitForElementWithFluentWait(driver, username, 10).sendKeys("batchautomation");
		//driver.findElement(password).sendKeys("Test@12345");
		waitForElementWithFluentWaitConcept(driver,username,5).sendKeys("batchautomation");
		waitForElementWithFluentWaitConcept(driver, password, 5).sendKeys("Test@12345");
		driver.findElement(loginButton).click();*/
		
		
				
	}

	
	public static WebElement waitForElementWithFluentWaitConcept(WebDriver driver, By locator, int timeOut){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	
	
	public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator, int timeOut) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

	WebElement element = wait.until(new Function<WebDriver, WebElement>() {
      
		public WebElement apply(WebDriver driver) {
		return driver.findElement(locator);	
		}
	});
		
	return element;	
		
	}

}
