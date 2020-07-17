package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropDown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
//		 driver.get("https://www.youtube.com/");
//		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@id='search']")).sendKeys("selenium");
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("dresses");
		Thread.sleep(2000);
        By list = By.xpath("//div[@class='ac_results']/ul/li");
        //By list = By.xpath("//ul[@class='sbsb_b']/li//b"); //u tube
        selectFromSuggestionList(list,"summer dresses");
      
      
	}
	public static void selectFromSuggestionList(By locator,String value) {
		List <WebElement> suggestionList = driver.findElements(locator);
		
		for(int i = 0;i<suggestionList.size();i++){
			String text = suggestionList.get(i).getText();
			System.out.println(text);
			if(text.contains(value)){
				suggestionList.get(i).click();
				break;
	}
	
	
		}}
}
