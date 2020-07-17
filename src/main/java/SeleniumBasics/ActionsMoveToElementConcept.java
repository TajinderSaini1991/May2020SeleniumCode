package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		Thread.sleep(5000);
		WebElement content = driver.findElement(By.className("menulink"));
		Actions act = new Actions(driver);
		act.moveToElement(content).perform();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Articles")).click();//doesnt work
		driver.findElement(By.linkText("ARTICLES")).click();
		//driver.findElement(By.xpath("//ul[@class='submenu']//a[text()='Articles']")).click(); //works
		
		
		
		
		
		
		
	}

}
