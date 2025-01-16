package GroupingConceptinTestNG;

import org.testng.annotations.Test;

public class GroupingPayment {
  @Test(priority=1,groups= {"sanity","regression","functional"})
  public void inRuppes() {
	  System.out.println("Payment by Rupees");

  }
  @Test(priority=2,groups= {"sanity","regression","functional"})
  public void inDollars() {
	  System.out.println("Payment by Dollars");

  }
}
