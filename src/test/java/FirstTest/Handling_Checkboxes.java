package FirstTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		//Selecting checkbox
			//driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();//it will select the check box
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();//it will again unselect the same check box
		//To check the status before and after selecting the checkbox
			//WebElement ele1ment=driver.findElement(By.xpath("//*[@id=\"sunday\"]"));
			//System.out.println("Before checking the check box: "+ele1ment.isSelected());//It will print false as the checkbox is not selected by default
			//ele1ment.click();
			//System.out.println("After checking the check box: "+ele1ment.isSelected());//It will print true as we selected the checkbox
		//To find no of checkboxes present in the whole webpage
			
	}

}
