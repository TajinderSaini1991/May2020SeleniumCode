package SeleniumBasics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsRightClick {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		  driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		 //By rightClickMe = By.xpath("//span[@class='context-menu-one btn btn-neutral']");
		 By rightClickMe2 = By.xpath("//span[text()='right click me']");
		  
		  ActionsRightClickMe(rightClickMe2);
		  Thread.sleep(2000);
		  
		 // By options = By.xpath("//ul[@class='context-menu-list context-menu-root']//span");
		 // By options2= By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]");
		  By options3 = By.cssSelector("ul.context-menu-list.context-menu-root li.context-menu-icon");
		  
		  
		  rightClickOptions(options3,"Delete");

		


}
	public static void rightClickOptions(By locator, String value) throws InterruptedException{
		

		List<WebElement> options =	driver.findElements(locator);
		System.out.println(options.size());
		for(WebElement i :options){
			String text = i.getText();
		System.out.println(	text);
		
		if(text.equals(value)){
			i.click();
			break;
		}
	}
		
		
	}
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
public static void ActionsRightClickMe(By locator){
	Actions ac = new Actions(driver);
	
	ac.contextClick(getElement(locator)).perform();
	
}


}
