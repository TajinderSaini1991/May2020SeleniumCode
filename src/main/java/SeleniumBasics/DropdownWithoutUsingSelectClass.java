package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithoutUsingSelectClass {
static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	//driver.get("https://facebook.com");
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//	String dob = "14-Oct-1999";
//	By month = By.xpath("//select[@id='month']/option");
//	By day = By.xpath("//select[@id='day']/option");
//	By year = By.xpath("//select[@id='year']/option");
	
	By country = By.xpath("//select[@id = 'Form_submitForm_Country']/option");
	
	
//   selectWithoutSelectClass(month, "Nov");
//   selectWithoutSelectClass(day, "15");
//   selectWithoutSelectClass(year, "1998");	
   
//   selectWithoutSelectClass(month, dob.split("-")[1]);
//   selectWithoutSelectClass(day, dob.split("-")[0]);
//   selectWithoutSelectClass(year, dob.split("-")[2]);	
		
	selectWithoutSelectClass(country, "Brazil");	
		
	}

	public static void selectWithoutSelectClass(By locator,String value){
		List<WebElement> monthList =	driver.findElements(locator);
		for (int i = 0;i<monthList.size();i++){
			String text = monthList.get(i).getText();
			//System.out.println(text);
			if(text.equals(value)){
				monthList.get(i).click();
				break;
			}
		}	
		
	}
	
	
	
	
}
