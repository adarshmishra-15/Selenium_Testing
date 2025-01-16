package FirstTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class mini_using_poi {

	public static void main(String[] args) throws IOException, InterruptedException {
		
        // Ask for user input to select the browser
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'chrome' to launch Chrome or 'edge' to launch Edge: ");
        String browserChoice = scanner.nextLine().trim().toLowerCase();
        scanner.close();
        if(browserChoice.equals("chrome")) {
        	WebDriver driver=new ChromeDriver();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://www.fb.com");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Create new account")).click();
			//String url="C:\Users\2373664\eclipse-workspace\Testingous\testdata\Mini_Project_Data.xlsx";
			FileInputStream file=new FileInputStream("C:\\Users\\2373664\\eclipse-workspace\\Testingous\\testdata\\Mini_Project_Data.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
		
			//Now we need to count the no of rows and column
			int totalrows=sheet.getLastRowNum();//Returns the last row num
			//int totalcols=sheet.getRow(1).getLastCellNum();//Returns the last no of cells
			for(int i=1;i<=totalrows;i++) {
				XSSFRow row1=sheet.getRow(i);
				String str1=row1.getCell(0).getStringCellValue();
				String str2=row1.getCell(1).getStringCellValue();
				double str3=row1.getCell(2).getNumericCellValue();
				int day=(int)str3;
				String day2=String.valueOf(day);
//				DataFormatter formatter = new DataFormatter();
//				String text = formatter.formatCellValue(str3);
				double str4=row1.getCell(3).getNumericCellValue();
				int mon=(int) str4;
				//String mon2=String.valueOf(mon);
				double str5=row1.getCell(4).getNumericCellValue();
				int yr=(int) str5;
				String yr2=String.valueOf(yr);
				double str6=row1.getCell(5).getNumericCellValue();
				int phnno=(int) str6;
				String phnno2=String.valueOf(phnno);
				System.out.println(str1);
				System.out.println(str2);
				System.out.println(day);
				System.out.println(mon);
				System.out.println(yr);
				System.out.println(phnno);
				driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(str1);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(str2);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"sex\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(phnno2);
				Thread.sleep(2000);
				Select select=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
				select.selectByVisibleText(day2);
				Thread.sleep(2000);
				Select select2=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
				select2.selectByIndex(mon);
				Thread.sleep(2000);
				Select select3=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
				select3.selectByValue(yr2);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(2000);
				WebElement web=driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]"));
				String str69=web.getText();
				System.out.println(str69);
			}	
			
//			XSSFCell firstname = row1.getCell(0);
//			firstname.toString();
//			XSSFCell lastname=row1.getCell(1);
//			lastname.toString();
//			XSSFCell day=row1.getCell(2);
//			day.toString();
//			//int day1=(int)day;
//			//int finalday=Integer.parseInt(day);
//			XSSFCell month=row1.getCell(3);
//			month.toString();
//			XSSFCell year=row1.getCell(4);
//			year.toString();
//			XSSFCell phonenum=row1.getCell(5);
//			phonenum.toString();
		
			

			
        }
        else if(browserChoice.equals("edge")) {
        	WebDriver driver2=new EdgeDriver();
        	driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver2.get("http://www.fb.com");
			driver2.manage().window().maximize();
			driver2.findElement(By.linkText("Create new account")).click();
        }
        else {
        	System.out.println("Please enter a valid browser or the browser is not installed in the system yet.");
        }
	}

	}


