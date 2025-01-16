package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS_Selectors {

	public static void main(String[] args) {
		WebDriver driver = driver();
		//Tag and class("tag.class")
		 //driver.findElement(By.cssSelector("span.hm-icon-label")).click();

		// Tag and Attribute("tag[attribute='value]")
		 driver.findElement(By.cssSelector("img[alt=\"Deals in PCs\"]")).click();

		// Tag class attribute("tag.class[attribute='value']")

		// driver.findElement(By.id("nav-search-submit-button")).click();
	}

	static WebDriver driver() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();// to maximize the window screen

		// Tag and id("tag#id")
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Steel Series Headphones");
		return driver;
	}

}
