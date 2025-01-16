package Handling_Frames_and_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_iframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/2373664/Downloads/Project69/frames%20and%20iframes.html");// I created this project
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"inputFrame1\"]")).sendKeys("Success");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div/div[1]/button")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		driver.navigate().back();
		driver.navigate().refresh();
		
	}

}
