package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramceConcepts {

	public static void main(String[] args) {
    
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame("main");
		//WebElement header = driver.findElement(By.tagName("h2"));
		//WebElement header = driver.findElement(By.cssSelector("body > h2"));
		WebElement header = driver.findElement(By.xpath("/html/body/h2"));
		System.out.println(header.getText());
		driver.switchTo().defaultContent();
	}

}
