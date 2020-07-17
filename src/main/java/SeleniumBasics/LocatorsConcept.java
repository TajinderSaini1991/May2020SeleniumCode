package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);

		By email = By.id("username");
		By password = By.id("password");
		//By loginBtn = By.id("loginBtn");
		By SignUp = By.linkText("Sign up");
		By decline = By.id("hs-eu-decline-button");
		By first_name = By.xpath("//*[@id='uid-firstName-5']");
		By last_name = By.cssSelector("#uid-lastName-6");
		By emailSignUp = By.xpath("//*[@id='uid-email-7']");
		By terms = By.partialLinkText("HubSpot Customer ");

		By policy = By.linkText("Privacy policy");

		doSendKeys(email, "abc@gmail.com");
		doSendKeys(password, "test123");
	
		doClick(SignUp);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		doClick(decline);
		doSendKeys(first_name, "tester");
		doSendKeys(last_name, "automation");
		doSendKeys(emailSignUp, "test@1234");
		doClick(emailSignUp);
		String parent = driver.getWindowHandle();
		doClick(terms);
	    System.out.println("This is terms page");
		driver.switchTo().window(parent);
		doClick(policy);
		System.out.println("This is policy page");
		Thread.sleep(2000);
		driver.quit();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();

	}
}
