package FirstTest;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageUsingJSExecutor {

	public static void main(String[] args) {
		WebDriver driver=driver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//to scroll the page by some pixels
		
 	}

	private static WebDriver driver() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://flagpedia.net/index");
		driver.manage().window().maximize();// to maximize the window screen
		return driver;
	}

}
