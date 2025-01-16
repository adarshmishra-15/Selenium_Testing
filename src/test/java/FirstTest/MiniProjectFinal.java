package FirstTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProjectFinal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 'chrome' to launch Chrome or 'edge' to launch Edge: ");
		String browserChoice = scanner.nextLine().trim().toLowerCase();
		scanner.close();
		WebDriver driver = getDriver(browserChoice);
		if (driver != null) {
			dataEntry(driver);
		}
	}

	/**
	 * @param browserChoice choice of the browser in String data type.
	 * @return driver of the chosen browser.
	 * 
	 */
	public static WebDriver getDriver(String browserChoice) {
		WebDriver driver = null;
		if (browserChoice.equals("chrome")) {
			driver = new ChromeDriver(); // Creates a new chrome driver
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait for 10sec
			driver.get("http://www.fb.com"); // Driver opens Facebook
			driver.manage().window().maximize(); // To maximize the window screen
			return driver; // Returns the chrome driver
		} else if (browserChoice.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://www.fb.com");
			driver.manage().window().maximize();
			return driver;
		} else {
			System.out.println("Please enter a valid Web Browser/ The current web browser is not supported.");
			return driver;
		}

	}

	/***
	 * 
	 * @param driver takes the chosen WebDriver
	 * 
	 */
	public static void dataEntry(WebDriver driver) {
		driver.findElement(By.linkText("Create new account")).click(); //Opened Facebook and clicked on Create New Account
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(cellData(1, 0)); //Identified the First Name input field and passed value from excel sheet by cellData method
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(cellData(1, 1)); //Identified the Last Name input field and passed value from excel sheet by cellData method
		driver.findElement(By.xpath("//*[@id=\"sex\"]")).click(); //Identified the Radio options and clicked on female
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(cellData(1, 5)); //Identified the Phone no input field and passed the value from excel sheet 
		Select selectDay = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		selectDay.selectByVisibleText(cellData(1, 2)); //Here we used Select class(selectByVisibbleText) to identify the day input and passed data from excel sheet
		int i = Integer.parseInt(cellData(1, 3));
		Select selectMonth = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		selectMonth.selectByIndex(i); //Here we used Select class(selectByIndex(0)) to identify the day input and passed data from excel sheet
		Select selectYear = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		selectYear.selectByValue(cellData(1, 4)); //Here we used Select class(selectByValue("")) to identify the day input and passed data from excel sheet
		driver.findElement(By.xpath("//*[@type='submit']")).click(); //Identified and clicked on the SignUp button in the page.
		WebElement web = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]")); //Error message is located here
		String ErrorMsg = web.getText(); //Text of the error message is stored here
		System.out.println(ErrorMsg); //Error message is printed on console

	}

	/***
	 * 
	 * @param rowNum Row of the Excel sheet
	 * @param colNum Column of the Excel sheet
	 * @return it returns the value at the row number and column number.
	 * 
	 */
	public static String cellData(int rowNum, int colNum) {
		String cellData = "";
		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\2373664\\eclipse-workspace\\Testingous\\testdata\\Mini_Project_Data.xlsx"); //It opens the excel file as we have provided the path here
			XSSFWorkbook workbook = new XSSFWorkbook(file); //Opens workbook
			XSSFSheet sheet = workbook.getSheetAt(0); //Opens sheet no(.getSheet("sheetname") also we can use here)
			XSSFRow row = sheet.getRow(rowNum); //Gets the particular row no of the provided sheet
			XSSFCell cell = row.getCell(colNum); //Gets the particular cell value of the provided column from the row
			DataFormatter formatter = new DataFormatter(); //To format the cell data
			cellData = formatter.formatCellValue(cell); 
			workbook.close(); //workbook is closed here
			file.close(); //file is closed here
		}

		catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return cellData; //cell value is returned from here as a string
	}

}
