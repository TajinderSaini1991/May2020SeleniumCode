package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptAlerts {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.name("proceed")).click();
Alert alert = driver.switchTo().alert();

	System.out.println(alert.getText());	
		if(alert.getText().equals("Please enter a valid user name")){
			System.out.println("correct alert message");
		}
		else{
			System.out.println("incorrecr message");
		}

		alert.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
	}

}
