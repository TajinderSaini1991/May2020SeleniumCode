package TestNGConcepts;

import org.testng.annotations.*;

public class TestNGAnnotations {
	
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("before Suite : create user in dB");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test: upload user details");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before Class : launch browser and url");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method : login ");
	}
	
	@Test(priority = 1)
	public void verifyUserName(){
		System.out.println("Verify user name test");
	}
	
	@Test(priority = 2)
	public void verifyAccountName(){
		System.out.println("Verify account name");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("after method : logout");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("After Class: close browser");
		
	}
	@AfterTest
	public void afterTest(){
		System.out.println("After Test: delete user details");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("After suite : disconnect from database");
	}
}
