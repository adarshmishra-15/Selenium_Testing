package POM_Examples_Using_PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPageFactory {

	WebDriver driver;
	//Contructor
	WithPageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Locators
	//Here we have created the locators which are used in the webpage login but in this PageFactory we have
	//created directly by using @FindBy Annotation
	@FindBy(xpath="//*[@id='username']") WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]") WebElement pass;
	@FindBy(xpath="//*[@id=\"submit\"]")WebElement submit;
	//We can also store list of web elements
	//@FindBy(tagName="a") List<WebElement> links;
	
	
	//Actions
	//Same as without using pagefactory but here we dont need to use findElement
	void setUserName() {
		(username).sendKeys("student");
		(pass).sendKeys("Password123");
		(submit).click();
	}
}
