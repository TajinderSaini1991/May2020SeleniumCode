package TestNGConcepts;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	
	
	@Test(expectedExceptions ={ArithmeticException.class,NullPointerException.class})
	public void getNumberTest(){
		System.out.println("this is number test");
		int i =9/0;
		System.out.println("end of test ");
	}

}
