package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		By email = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		driver.findElement(email).sendKeys("test@gmail.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //over ride
		driver.findElement(password).sendKeys("!006");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);// nullify 
		driver.findElement(loginButton).click();
		
		
		
	}

}
