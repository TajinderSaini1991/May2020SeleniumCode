package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeLocators {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("testing");
		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("saini");
		driver.findElement(By.name("Email")).sendKeys("test@gmailcom");
		driver.findElement(By.id("Form_submitForm_JobTitle")).sendKeys("trainer");
		Select no_of_employees = new Select(driver.findElement(By.xpath("//*[@id='Form_submitForm_NoOfEmployees']")));
		
		no_of_employees.selectByIndex(2);
		
		driver.close();
		
		

	}

}
