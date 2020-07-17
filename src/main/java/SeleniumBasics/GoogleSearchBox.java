package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchBox {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		//List <WebElement> suggestionList = driver.findElements(By.cssSelector("div.sbtc"));
		By css = By.cssSelector("div.sbtc");
		//By suggestions = By.xpath("//ul[@class='erkvQe']/li//span");
		//By choices = By.xpath("//li[@class='sbct']");
		//selectFromSuggestionList(choices,"selenium foods");
		
		
		System.out.println(suggestionList(css)+" "+suggestionList(css).size() );
		
	}
/**
 * This method selects a suggestions based on the given value
 * @param locator
 * @param value
 */
	public static void selectFromSuggestionList(By locator,String value){
		List <WebElement> suggestionList = driver.findElements(locator);
		for(int i = 0;i<suggestionList.size();i++){
			String text = suggestionList.get(i).getText();
			System.out.println(text);
			if(text.equals(value)){
				suggestionList.get(i).click();
				break;
	}
	
	
		}}
	/**
	 * This method captures all the suggestions in a list and return the list
	 * @param locator
	 * @return list
	 */
	public static List<String> suggestionList(By locator){
		List<String> allSuggestions = new ArrayList<String>();
	
		List <WebElement> suggestionList = driver.findElements(locator);
		for(int i = 0;i<suggestionList.size();i++){

         String text = suggestionList.get(i).getText();
         allSuggestions.add(text);
		}
	
	return allSuggestions;
		
		
		
			
		
	}
}
