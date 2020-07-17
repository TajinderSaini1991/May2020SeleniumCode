package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		//By login = By.id("ctl00_HyperLinkLogin"); //works
		By login2 = By.linkText("LOGIN / SIGNUP");
		//By login3 = By.linkText("Login / Signup"); //doesnt work
		WebElement signUp = driver.findElement(login2);
		Actions act = new Actions(driver);
		act.moveToElement(signUp).perform();
		By spiceClubmembers = By.linkText("SpiceClub Members"); // works
		//By spiceClubmembers2 = By.xpath("//a[text()='SpiceClub Members']");// works
		WebElement members = driver.findElement(spiceClubmembers);
		
		act.moveToElement(members).perform();
		
		driver.findElement(By.linkText("Member Login")).click();
		// driver.findElement(By.xpath("//a[text()='Member Login']")).click(); // doesnt work(there are 2 elements)
		//driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[15]/ul/li[2]/ul/li[1]/a")).click(); // works
	}
}
