package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMouseHover2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.className("_2AkmmA _29YdH8")).click(); //doesnt work
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		WebElement tv = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		Actions act = new Actions(driver);
		act.moveToElement(tv).perform();
		Thread.sleep(2000);
		WebElement television = driver.findElement(By.linkText("Television"));
		television.click();
	}

}
