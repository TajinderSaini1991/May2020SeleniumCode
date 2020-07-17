package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssgnmnt1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame("mainpanel");
		
		//driver.findElement(By.xpath("a[@title='Contacts']")).click();
      // driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.cssSelector("#navmenu > ul > li:nth-child(4) > a")).click();
		driver.findElement(By.name("cs_name")).sendKeys("sonia");
      
         driver.findElement(By.linkText("Logout")).click();
	}

}
