package FirstTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
		//How to handle Normal ALERT (single button comes to select....eg:- to click "OK")
			driver.findElement(By.xpath("//*[@id='OKTab']/button]")).click();
			Thread.sleep(400);
			Alert myalert= driver.switchTo().alert();// By default alert variable comes in selenium
			myalert.accept();
		//How to handle Confirmation alert "OK"  & "CANCEL" BOTH
			myalert.accept();//---->for accepting the pop up
			myalert.dismiss();//--->for declining the pop up
		//How to handle Prompt alert (both input and  "ok" and "cancel" are there)
			myalert.getText();//--->To get the text shown on the pop up
			myalert.sendKeys("ANything");//---->To send some values in the input field
			myalert.accept();//---->for accepting the pop up
			myalert.dismiss();//--->for declining the pop up
			
	}

}
