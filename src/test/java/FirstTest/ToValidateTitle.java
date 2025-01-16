package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//In this we will validate the title of the webpage(from pc)
//Steps to follow:-
//1)Open Browser
//2)Open URL which you want to validate the title
//3)Validate the title
//4)Close the browser
public class ToValidateTitle {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("file:///C:/Users/2373664/Downloads/test.html");
		String sc=dr.getTitle();
		if(sc.equals("Payroll Loginn")) {
			System.out.println("Passssssss");
		}
		else {
			System.out.println("Failllllll");
		}
		dr.quit();
		
	}

}
