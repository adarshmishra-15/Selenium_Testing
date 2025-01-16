package Test_NG;

import org.testng.annotations.Test;

//Open app
//login
//logout
public class my_first_test_case_in_testNG {
	@Test(priority=1)
	void openapp(){
		System.out.println("Opening app(it will open first)");
	}
	@Test(priority=2)
	
	void login() {
		System.out.println("Logging in(it will open second)");
	}
	@Test(priority=69)
	void logout() {
		System.out.println("Logging out(it will open third/last)");
	}
	
	/*Fundamentals of TestNG
	 * By default without any priority the @Test annonation will execute on the basis of alphabetical order of the methods
	 * To avoid the above condition priority is used(@Test(priority=0)
	 * Once we use priority in our methods then order of writing the methods doesnt valid
	 * Priority numbers can be anything random need not to be sequential 
	 * Priority can be negative number as well
	 * If priority is not specified to test annotation then by default it takes the priority as 0
	 * if priority are given same then it will consider the alphabetical order of the methods
	 * If @Test annotation is removed from any method then it will not execute that method
	 * 
	 * 
	*/
}
