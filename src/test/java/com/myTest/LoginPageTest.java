package com.myTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
	
	
	@Test
	public void getLoginPageTitleTest(){
		Assert.assertEquals(driver.getTitle(), "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	

}
