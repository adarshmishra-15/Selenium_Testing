package Using_Apacahe;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache_Poi_example {

	public static void main(String[] args) throws IOException {
		//Reading data from excel file and printing it on console.
		//Excel File-->Workbook-->Sheets-->Rows-->Cells [we should always follow this hierarchy]
		//Step-1:For reading the file create FileInputStream
		FileInputStream file=new FileInputStream("C:\\Users\\2373664\\eclipse-workspace\\Testingous\\testdata\\data.xlsx");
		//Step-2:Open workbook from file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//Step-3:Now we need to extract the sheet from the workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");//We can also use getsheet(0);-->it will take the number to find the sheet
		//Step-4: Now we need to count the no of rows and columns present in the sheet and store it in two type variable
		int totalRows=sheet.getLastRowNum();//.getLastRowNum()-->it is used for getting the last row number and it counts the rows from 0
		int totalColumns=sheet.getRow(0).getLastCellNum();//.getLastCellNum()--> it is used for getting the last cell number of the sheet and the count starts from 1
		System.out.println("Number of rows:"+totalRows);
		System.out.println("Number of columns:"+totalColumns);
		//Step-5:Now we can read Data from the cell by using two for loops(nested for loops)
		for(int rowCount=0;rowCount<=totalRows;rowCount++) {
			XSSFRow currentRow=sheet.getRow(rowCount);
			for(int colCount=0;colCount<totalColumns;colCount++) {
				XSSFCell cell=currentRow.getCell(colCount);//cells are captured from each row in this 
				System.out.print(cell.toString()+"\t");//In this we converted the cell to string type to print the data 
			}
			System.out.println();
		}
		//Step-6:Now we need to close the workbook
		workbook.close();
		//Step-7:After closing workbook we also need to close the file as well
		file.close();
	}

}
