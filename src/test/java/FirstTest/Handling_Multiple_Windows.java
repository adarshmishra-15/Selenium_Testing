package FirstTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Windows {

	public static void main(String[] args) {
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//apply implicit wait here
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
			//After clicking this is our child url=https://www.orangehrm.com/
			//Now we will capture the ID of the both PAGES and print it 
			Set<String> handles=driver.getWindowHandles();
			//System.out.println(handles);//it will return two sets in the console 
			List<String> list=new ArrayList(handles);//Set collection is convereted to Arraylist
			String childID=list.get(0);
			String parentID=list.get(1);
			//Switching driver from parent window to child window
			 driver.switchTo().window(childID);
			System.out.println(driver.getTitle());
			//Switching driver from parent child to parent window
			 driver.switchTo().window(parentID);
			System.out.println(driver.getTitle());
	}

}
