package HackathonProjectMyPart;

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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintingSuccessMsg {

		public static void main(String[] args) throws InterruptedException {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 'chrome' to launch Chrome or 'edge' to launch Edge: ");
			String browserChoice = scanner.nextLine().trim().toLowerCase();
			scanner.close();
			WebDriver driver = getDriver(browserChoice);
			if (driver != null) {
				dataEntry(driver);
				}
		}
			public static WebDriver getDriver(String browserChoice) {
				WebDriver driver = null;
				if (browserChoice.equals("chrome")) {
					driver = new ChromeDriver(); // Creates a new chrome driver
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait for 10sec
					driver.get("https://www.coursera.org/"); // Driver opens CourseEra
					driver.manage().window().maximize(); // To maximize the window screen
					return driver; // Returns the chrome driver
				} else if (browserChoice.equals("edge")) {
					driver = new EdgeDriver();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.get("https://www.coursera.org/");
					driver.manage().window().maximize();
					return driver;
				} else {
					System.out.println("Please enter a valid Web Browser/ The current web browser is not supported.");
					return driver;
				}

			}
			public static void dataEntry(WebDriver driver) throws InterruptedException {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//To scroll down the page
				driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div[1]/footer/div/div/div/div[5]/ul/li[12]/a")).click(); //It will click on  For campus
//				Set<String> handles=driver.getWindowHandles();//For switching window we took the windhandles and stored in a set of string
//				System.out.println(handles);
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				Thread.sleep(2000);
				WebElement element=driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/main/div/div[8]/div/div[2]"));
				js1.executeScript("arguments[0].scrollIntoView();",element);//To scroll down the page till the form is visible we used this
				driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(cellData(1, 0)); 
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(cellData(1,1)); 
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(cellData(1, 2));  
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys(cellData(1, 3));  
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys(cellData(1, 4));            
				Select selectInstitute = new Select(driver.findElement(By.xpath("//*[@id=\"Institution_Type__c\"]")));
				selectInstitute.selectByVisibleText(cellData(1, 5)); 
				Thread.sleep(2000);
				Select selectJobRole = new Select(driver.findElement(By.xpath("//*[@id=\"Title\"]")));
				selectJobRole.selectByVisibleText(cellData(1, 6)); 
				Thread.sleep(2000);
				Select selectDepartment = new Select(driver.findElement(By.xpath("//*[@id=\"Department\"]")));
				selectDepartment.selectByValue(cellData(1, 7)); 
				
				Select selectDescribes = new Select(driver.findElement(By.xpath("//*[@id=\"What_the_lead_asked_for_on_the_website__c\"]")));
				selectDescribes.selectByValue(cellData(1, 8)); 
				
				Select selectCountry = new Select(driver.findElement(By.xpath("//*[@id=\"Country\"]")));
				selectCountry.selectByValue(cellData(1, 9)); 
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"mktoForm_1512\"]/div[50]/span/button")).click();
				Thread.sleep(5000);
				
				WebElement web=driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/main/div/div[1]/div/div[2]/div/div/div/h1"));
				
				String ErrorMsg = web.getText(); //Text of the error message is stored here
				System.out.println(ErrorMsg); //Error message is printed on console
				//driver.quit();
			}
			public static String cellData(int rowNum, int colNum) {
				String cellData = "";
				try {
					FileInputStream file = new FileInputStream(
							"C:\\Users\\2373664\\eclipse-workspace\\Testingous\\testdata\\Valid_HandsOn_Project.xlsx"); //It opens the excel file as we have provided the path here
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
