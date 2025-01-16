package POM_Examples;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCaseClassForWithoutPageFactory {

	WebDriver driver;
	@BeforeClass
	void setUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	@Test
	//Here in this method we will do all the validation 
	void logIn() {
		//First we need to call the locators and actions class from other class by creating object
		//ClassName lp=new ClassName(driver);
		WithoutPageFactory lp=new WithoutPageFactory(driver);
		//here we can call the method of that class here
		lp.setUserName();
		//Validation
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
	}
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
