package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDragDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);

		// act.clickAndHold(source).moveToElement(target).release().build().perform();
		act.dragAndDrop(source, target).perform();
		Thread.sleep(4000);
		driver.close();

		/*
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		  Thread.sleep(2000);
		  driver.switchTo().frame(driver.findElement(By.xpath( "//*[@id='post-2669']/div[2]/div/div/div[1]/p/iframe")));
		  Thread.sleep(2000); 
		  //WebElement src =driver.findElement(By.xpath("//*[@id='gallery']/li[3]/img"));
		   WebElement src = driver.findElement(By.xpath("//ul[@id='gallery']/li/h5[text()='High Tatras 3']"));
           WebElement dest = driver.findElement(By.id("trash"));
            Actions ac = new Actions(driver); 
            ac.dragAndDrop(src, dest).perform();
		  Thread.sleep(4000);
		   driver.close(); */
		
		
		 
	}

}
