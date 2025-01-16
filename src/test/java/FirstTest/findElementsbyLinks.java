package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsbyLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//It will open chrome browser
		driver.manage().window().maximize();//To maximize the webpage for automation
		driver.get("https://amazon.com/");//It will open amazon on chrome
	    //driver.findElement(By.linkText("Terms of Use")).click();//it will click on the linktext we provided
		

	}

}
	