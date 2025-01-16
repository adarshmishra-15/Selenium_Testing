package GroupingConceptinTestNG;

import org.testng.annotations.Test;

public class GroupingLogin {
  @Test(priority=1,groups= {"sanity"})
  public void loginbyEmail() {
	  System.out.println("This is the Login by email");
  }
  @Test(priority=2,groups= {"sanity"})
  public void loginbyFb() {
	  System.out.println("This is the Login by fb");
  }
  @Test(priority=3,groups= {"sanity"})
  public void loginbyphnno() {
	  System.out.println("This is the Login by Phone no");
  }
}
