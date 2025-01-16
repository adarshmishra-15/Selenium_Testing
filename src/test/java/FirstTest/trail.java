package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class trail {
    public static void main(String[] args) {
        // Ask for user input to select the browser
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'chrome' to launch Chrome or 'edge' to launch Edge: ");
        String browserChoice = scanner.nextLine().trim().toLowerCase();

        // Initialize WebDriver
        WebDriver driver = null;

        try {
            // Launch the chosen browser
            switch (browserChoice) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
                    driver = new ChromeDriver();
                    
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", "/path/to/msedgedriver");
                    driver = new EdgeDriver();
                    //System.out.println("Edge browser launched.");
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'chrome' or 'edge'.");
                    return;
            }

            // Check if driver is initialized before navigating
            if (driver != null) {
                // Navigate to a webpage
                driver.get("http://fb.com");

                // Add any other actions you want to perform in the browser
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                // Close the browser
                driver.quit();
            }
        }
    }
}
