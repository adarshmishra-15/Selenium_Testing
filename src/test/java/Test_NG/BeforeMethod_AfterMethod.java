package Test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
//Here we will use BeforeMethod and AfterMethod
//we will perform the following 
//Login
//Search
//logout
//login
//Advance Search
//Logout

public class BeforeMethod_AfterMethod {
  @BeforeMethod
  public void login() {
	  System.out.println("This will login first..");
  }
  
  
  @Test(priority=1)
  public void search() {
	  System.out.println("This is Search");

  }
  @Test(priority=2)
  public void advncsearch() {
	  System.out.println("This is Advance Search");

  }

  
  @AfterMethod
  public void logout() {
	  System.out.println("This is Logout");

  }
//Here what happens is that BeforeMethod runs first then the main test annotation runs after that AftermETHOD Annotation runs 
  
}
