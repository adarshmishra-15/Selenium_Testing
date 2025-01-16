package Using_Apacahe;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_In_Excel_File {

	public static void main(String[] args) throws IOException {
		//FileOutputStream file=new FileOutputStream("C:\\Users\\2373664\\eclipse-workspace\\Testingous\\testdata\\Empty excel(for using to write data in excel in apache poi).xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();//Here the file is not connected it will get connected after adding the data
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		XSSFRow row1=sheet.createRow(0);//Here we will create one row
		row1.createCell(0).setCellValue("Adarsh Mishhra");
		row1.createCell(1).setCellValue("Cognzant");
		XSSFRow row2=sheet.createRow(1);//Here the second row is created
		row2.createCell(0).setCellValue("Smruti Bhanja");
		row2.createCell(1).setCellValue("Amazon");
		//Now after adding data we need to connect the workboook with the file
		FileOutputStream file=new FileOutputStream("C:\\Users\\2373664\\eclipse-workspace\\Testingous\\testdata\\Empty excel(for using to write data in excel in apache poi).xlsx");

		workbook.write(file);;
		//Now we need to close the workbook and file both
		workbook.close();
		file.close();
		System.out.println("Successfully created the excel file");
		
	}

}
