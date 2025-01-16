package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Steel Series Headphones");//Using Relative xpath we did a search on the amazon account
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/div/input")).sendKeys("Steel Series Headphones");// Here we used Absolute path and searched on amazon
		
		//xpath with single attribute(Manually generating xapth using syntax)
		//driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Steel Series Headphones artics 5");
		
		//xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"][@id='lol']")).sendKeys("Steel Series Headphones artics 5");
		
		//xpath using "and" "or" operators
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @id='lol']")).sendKeys("Steel Series Headphones artics 5");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @id='lol']")).sendKeys("Steel Series Headphones artics 5");
		
		//xpath using text() , contains() , and starts-with() method
		//driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Steel Series Headphones artics 5");
		//driver.findElement(By.xpath("//input[starts-with(@id,'twotabsea')]")).sendKeys("Steel Series Headphones artics 5");
		//driver.findElement(By.xpath("//input[text()='Search Amazon']")).sendKeys("Steel Series Headphones artics 5");
		
	}

}
