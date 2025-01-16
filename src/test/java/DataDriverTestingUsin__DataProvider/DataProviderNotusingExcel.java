package DataDriverTestingUsin__DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderNotusingExcel {
WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		if(br.toLowerCase().equals("chrome")) {
			driver=new ChromeDriver();	
			//return driver;
		}
		else if(br.toLowerCase().equals("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true)
		{
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	//Here we have used these testcases for testing in the gmail and passwd
	//Instead of passing data everytime here from the object the data will be taken
	@DataProvider(name="dp")//indices= {0,3,4})
	Object[][] loginData()
	{
		
		Object data[][]= {   
							{"abc@gmail.com", "test123"},
							{"xyz@gmail.com", "test012"},
							{"john@gmail.com", "test@123"},
							{"pavanol123@gmail.com", "test@123"},
							{"johncanedy@gmail.com", "test"},
				
						};
		
		return data;
		
	}
}
