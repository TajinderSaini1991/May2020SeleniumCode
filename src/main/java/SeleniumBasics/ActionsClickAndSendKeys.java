package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		By email = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		

		
		doActionsSendkeys(email, "sunita@gmail.com");
		doActionsSendkeys(password, "test@123");
		doActionsClick(loginButton);

		Thread.sleep(2000);
		driver.close();

	}

	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void doActionsSendkeys(By locator, String value){
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
		
		
	}
	public static void doActionsClick(By locator){
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
}
