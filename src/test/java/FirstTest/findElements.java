package FirstTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//In this we will use findElements from webpage
//then we will pass some value to it
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://amazon.com/");
//		driver.findElement(By.id("twotabsearchtextbox")); //for locating the web element
	WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));//for storing the web element
		searchBox.sendKeys("Steel Series Headphone");//to send values in the search box
		searchBox.sendKeys(Keys.ENTER);//to click enter
		
		//In a single line we can also represnt the following code 
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hyper X Headphone");

	}

}
