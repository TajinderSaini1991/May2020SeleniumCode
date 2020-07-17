package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("test@gmail.com");
		driver.navigate().refresh();
       //  element.sendKeys("tajinder@yahoo.com"); //stale element exception
		
		element = driver.findElement(By.id("username"));
		element.sendKeys("tajinder@yahoo.com");

				
		
		
		
		
		
		
		
		
		
	}

}
