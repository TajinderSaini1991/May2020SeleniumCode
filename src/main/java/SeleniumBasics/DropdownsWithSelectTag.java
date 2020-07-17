package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownsWithSelectTag {
	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://facebook.com");
	//driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		By employees = By.id("Form_submitForm_NoOfEmployees");
//		By industries = By.id("Form_submitForm_Industry");
//		By country = By.id("Form_submitForm_Country");
		
		By month = By.id("month");
		By day = By.id("day");
		By year = By.id("year");
		
		
		
		doSelectByVisibleText(month, "Apr");
		doSelectByVisibleText(day, "4");
		doSelectByVisibleText(year, "2018");
		
		
		doSelectByIndex(month, 5);
		doSelectByIndex(day, 7);
		doSelectByIndex(year, 4);
		
		doSelectByValue(month, "4");
		doSelectByValue(day, "4");
		doSelectByValue(year, "2012");
		
//		doSelectByVisibleText(employees, "16 - 20");
//		doSelectByVisibleText(industries, "Automotive");
//		doSelectByVisibleText(country, "Algeria");
		
//		doSelectByIndex(employees, 5); //26-50
//		doSelectByIndex(industries, 5); //computer
//		doSelectByIndex(country, 4); //american samoa
		
//		doSelectByValue(employees, "801 - 900");
//		doSelectByValue(industries, "Computer/Technology-Reseller");
//		doSelectByValue(country, "Bahrain");
		
	}
	
	
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void doSelectByVisibleText(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	public static void doSelectByIndex(By locator, int index){
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectByValue(By locator,String value){
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
