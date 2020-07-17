package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXPath_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://classic.crmpro.com");
//		driver.findElement(By.name("username")).sendKeys("batchautomation");
//		driver.findElement(By.name("password")).sendKeys("Test@12345");
//		driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();
//		driver.switchTo().frame("mainpanel");
//		driver.findElement(By.linkText("CONTACTS")).click();
//		driver.findElement(By.xpath("//a[text()='Aashiq Limbu']/..//preceding-sibling::td/input")).click();
		
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		By email = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		driver.findElement(email).sendKeys("simr.saini7@gmail.com");
		driver.findElement(password).sendKeys("!Saini006");
		driver.findElement(loginButton).click();
		Thread.sleep(5000);
		driver.navigate().to("https://app.hubspot.com/contacts/7974888/contacts/list/view/all/");
		Thread.sleep(5000);
		//driver.findElement
		//(By.xpath("//span[text()='smith faubert']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner']"))
		//.click();
		selectContactCheckbox(driver,"aditi saini");
		// //span[text()='smith faubert']//ancestor::td//preceding-sibling::td//input[@type='checkbox']/..
		System.out.println(selectEmailId(driver, "smith faubert"));
	}
	
	public static void selectContactCheckbox(WebDriver driver, String name){
	driver.findElement
	(By.xpath("//span[text()='"+name+"']//ancestor::td//preceding-sibling::td//input[@type='checkbox']/.."))
	.click();
	}
		
//if names are duplicate
	//(//span[text()='aditi saini'])[2]//ancestor::td//preceding-sibling::td//input/..
	
	public static String selectEmailId(WebDriver driver,String name){
		return driver.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//following-sibling::td/a")).getText();
	}
	

}
