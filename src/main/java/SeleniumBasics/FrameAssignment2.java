package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssignment2 {

	public static void main(String[] args)  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
	WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
	System.out.println("drag box is displayed :"+drag.isDisplayed());
	driver.switchTo().defaultContent();
	WebElement themes = driver.findElement(By.linkText("Themes"));
	System.out.println("themes is displayed : "+themes.isDisplayed());
	
	


	}

}
