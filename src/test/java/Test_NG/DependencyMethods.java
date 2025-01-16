package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
  @Test(priority=1)
  public void openapp() {
	  Assert.assertFalse(true);
  }
  @Test(priority=2,dependsOnMethods= {"openapp"})
  public void login() {
	  //If the openapp will fail then it will not execute this method it will skip this method
	  Assert.assertFalse(false);
  }
  @Test(priority=3,dependsOnMethods= {"login","openapp"})
  public void search() {
	  Assert.assertFalse(false);
	 //its a multiple dependency where the search method depends upon the passing of both openapp and login together, then only it will get executed
  }
  @Test(priority=4,dependsOnMethods= {"login"})
  public void logout() {
	  Assert.assertFalse(false);
	  
  }
}
