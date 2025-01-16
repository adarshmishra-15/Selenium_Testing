package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocatorsUsingList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
//		List <WebElement> web=driver.findElements(By.className("list-group"));//It will capture the web element with same class name
//		System.out.println(web.size());//It will print no of classes print with the same class name
		//List<WebElement> web=driver.findElements(By.tagName("img"));
		//List<WebElement> web2=driver.findElements(By.tagName("a"));
		//System.out.println(web.size());
		//System.out.println(web2.size());
//driver.findElement(By.linkText("About us")).click();
		
	}

}
