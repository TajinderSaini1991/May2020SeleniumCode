package TestNGConcepts;



import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	
	@Test
	public void login(){
		System.out.println("login test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods = "login")
	public void homePage(){
		System.out.println("homepage test");
	}
	@Test(dependsOnMethods = "login")
	public void dealsPage(){
	System.out.println("dealspage test");	
	}
	
}
