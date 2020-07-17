package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://amazon.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
//		for (int i=0;i<links.size();i++){
//		String text =	links.get(i).getText();
//		System.out.println(text);
//			
//		}
		
//		for (WebElement i : links){
//			System.out.println(i.getText());
//		}
		
		
		
		
		// to print the text without blank spaces
		for (WebElement j :links){
			
			if(!j.getText().isEmpty()){
				System.out.println(j.getText());
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
