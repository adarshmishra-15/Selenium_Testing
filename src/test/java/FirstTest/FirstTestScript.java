package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * In this testing we will perform the following things:-
 1)Launch Browser
 2)Open URL https://anything.com/
 3)Validate the Title
 4)Close Browser
 */
public class FirstTestScript {

	public static void main(String[] args) {
		
//1)Launch Browser
		WebDriver driver=new ChromeDriver();

//2)Open URL https://wikipedia.com/
		driver.get("http://wikipedia.com/");
//3)We need to validate the title
		String actual_title=driver.getTitle();
		if(actual_title.equals("Wikipedia")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
//4)Close Browser
//	     driver.close();	
	}

}
