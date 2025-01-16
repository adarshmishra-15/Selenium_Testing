package TesTNGListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener{
	
	 public  void onTestSuccess(ITestResult result) {
		    // not implemented
		 System.out.println("LOL pass");
 
		  }
	 public  void onTestFailure(ITestResult result) {
		    // not implemented
		 System.out.println("LOL fail");
		  }
}
