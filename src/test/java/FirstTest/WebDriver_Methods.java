package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//In this we will get to know many methods of the webdrivers
		
		//Get Methods
		//
		//Conditional Methods
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();
		WebElement web=driver.findElement(By.id("nav-logo-sprites"));
		System.out.println(web.isDisplayed());
		
	}

}
