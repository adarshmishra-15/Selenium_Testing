package GroupingConceptinTestNG;

import org.testng.annotations.Test;

public class GroupingSignUp {
  @Test(priority=1,groups= {"regression"})
  public void signupbyemail() {
	  System.out.println("Signup by email..");
	  
  }
  @Test(priority=2,groups= {"regression"})
  public void signupbyfb() {
	  System.out.println("Signup by fb..");
	  
  }
  @Test(priority=3,groups= {"regression"})
  public void signupbyphnno() {
	  System.out.println("Signup by phnno..");

  }
}
