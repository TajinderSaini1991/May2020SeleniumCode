package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXPath_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.freshworks.com/";
		driver.get(url);
		WebElement ele = driver.findElement(By.xpath("//span[@class ='tag tag-new' ]"));
		WebElement delight = driver.findElement(By.xpath("//div/h1"));
		System.out.println(delight.getText());
		
		System.out.println(ele.getText());
		WebElement header = driver.findElement(By.xpath("//a[@class='banner-notification font-color-light']"));
		System.out.println(header.getText());
		
		//driver.findElement(By.xpath("//a[text()='Platform']")).click();
		List<WebElement> logos = driver.findElements(By.xpath("//div[@class='customer-logos']/div"));
		System.out.println(logos.size());
		for(WebElement i :logos){
			System.out.println(i.getText());
			System.out.println(i.isDisplayed());
		}
		
		
	}

}
