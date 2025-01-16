package FirstTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_TekStac {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://www.fb.com");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Create new account")).click();
			driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Cognizant");
			driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Technologies");
			driver.findElement(By.xpath("//*[@id=\"sex\"]")).click();
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("987654321");
			Select select=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
			select.selectByVisibleText("15");
			Select select2=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
			select2.selectByIndex(7);
			Select select3=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
			select3.selectByValue("2002");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			WebElement web=driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]"));
			String str69=web.getText();
			System.out.println(str69);
			//driver.findElement(By.xpath("//*[@id=\"u_0_g_W9\"]/i[1]")).click();
			driver.quit();
//			WebElement web2=driver.findElement(By.cssSelector("[data-ownerid='password_step_input']"));
//			String str2=web2.getText();
//			System.out.println(str2);
			//Alert alert=driver.switchTo().alert();
			//String str2=alert.getText();
			//System.out.println(str2);
			//driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			
	}

}
