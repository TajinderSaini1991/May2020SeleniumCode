package TestNGConcepts;

import org.testng.annotations.Test;

public class PriorityUseCases {
	
	
	@Test(priority = 1)
	public void test1(){
		System.out.println("test 1");
	}
	
	@Test (priority = 3)
	public void test2(){
		System.out.println("test 2");
	}
	
	@Test (priority = 2)
	public void test3(){
		System.out.println("test 3");
	}
	@Test (priority = 5)
	public void test4(){
		System.out.println("test 4");
	}
	@Test (priority= 4)
	public void test5(){
		System.out.println("test 5");
	}
	@Test (priority=6)
	public void test6(){
		System.out.println("test 6");
	}
	
	
	@Test
	public void test7(){
		System.out.println("test 7");
	}
	
	@Test
	public void test8(){
		System.out.println("test 8");
	}
	
	
	
	
	
	

}
