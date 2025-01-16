package POM_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithoutPageFactory {

	WebDriver driver;
	//Contructor
	WithoutPageFactory(WebDriver driver){
		this.driver=driver;
	}
	//Locators
	//Here we have created the locators which are used in the webpage login
	By username=By.xpath("//*[@id='username']");
	By pass=By.xpath("//*[@id=\"password\"]");
	By submit=By.xpath("//*[@id=\"submit\"]");
	
	
	//Actions
	void setUserName() {
		driver.findElement(username).sendKeys("student");
		driver.findElement(pass).sendKeys("Password123");
		driver.findElement(submit).click();
	}
}
