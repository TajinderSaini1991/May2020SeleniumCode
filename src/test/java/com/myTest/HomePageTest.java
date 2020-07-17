package com.myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	

	
	
	
	@Test
	public void getHomePageTitleTest() {
		doLogin();
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRMPRO");
	}
	
	public void doLogin() {
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("//input[@type='submit']"))).perform();
		
	}
}
