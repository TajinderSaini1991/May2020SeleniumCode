package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By employees = By.id("Form_submitForm_NoOfEmployees");
		By industries = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		
//		getDropDownOptionsList(employees);
//		getDropDownOptionsList(industries);
//		getDropDownOptionsList(country);
		
		// 2nd way
		
	List<String> empList =	getDropDownArrayList(employees);
	List<String> indusList =	getDropDownArrayList(industries);
	List<String> countryList =	getDropDownArrayList(country);
	
	System.out.println(empList);
	System.out.println(indusList);
	System.out.println(countryList);
		

	
		
		
	}
	
	public static void getDropDownOptionsList(By locator){
		Select select = new Select(getElement(locator));
	List<WebElement> dropDownOptions =	select.getOptions();
	System.out.println(dropDownOptions.size());
	//for (int i = 0;i<no_Of_employees.size();i++){
//	String text = no_Of_employees.get(i).getText();
//	System.out.println(text);
//}
	
	for (WebElement i :dropDownOptions){
		System.out.println(i.getText());
	}
		
		
	}
	
	
	
	
	public static List<String> getDropDownArrayList(By locator){
		List<String> optionsList = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		
	List<WebElement> options	=select.getOptions();
		
	   for(WebElement i:options){
		optionsList.add(i.getText());
	}
	
		
	return 	optionsList;
		}

	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
}
