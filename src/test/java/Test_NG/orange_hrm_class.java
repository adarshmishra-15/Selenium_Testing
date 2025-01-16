package Test_NG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/***
 * In this we will perform all 3 using TestNG
 * Open Application
 * Test if logo is present or not
 * Login 
 * close the browser
 */
public class orange_hrm_class {
	WebDriver driver;//It is used a class variable so that the driver can be accessed in every method
  @Test(priority=1)
  //This method will open the app 
  void openapp() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();  
  }
  
  
  @Test(priority=2)
 //this method will check for the logo 
  void testLogo() throws InterruptedException {
	  Thread.sleep(3000);

	boolean bol=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();  
  System.out.println(bol);//if true logo is present and if false logo is not present
  }
  
  
  @Test(priority=3)
  //this method will do the login
  void testLogin() throws InterruptedException {
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  
  
  @Test(priority=4)
  //this method will close the app
  void testLogout() {
	  driver.quit();
  }
}
