package FirstTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSlidersUsingActionsAndGetLocationMethod {

	public static void main(String[] args) {
        WebDriver driver=  getdriver();
		WebElement web1=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println(web1.getLocation());//getX());
		Actions act=new Actions(driver);
		act.dragAndDropBy(web1, 100, 126).perform();
		
			
	}
	public static WebDriver getdriver() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		return driver;
	}
	

}
