package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//In this we will check the login functionality of the page which i made on my own i.e payroll login
public class loginfucntionalityofmyproject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/2373664/Downloads/test.html");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.id("hehe")).click();
        Thread.sleep(400);
        driver.switchTo().alert().accept();//--->It will close the pop up that comes after logging in(Normal Alerts)
	}

}
