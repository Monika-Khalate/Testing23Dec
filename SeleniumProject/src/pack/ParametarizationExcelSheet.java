package pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParametarizationExcelSheet {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		// How to perform parametarization
		// how to fetch data from excel sheet
		
		
		// 1.path          2.open             3. select sheet 
		//4.row select  5.column/cell select  6. copy value
		
		
	//1. path
		String path = "C:\\Users\\Dell\\Desktop\\Practice1.xlsx";
		FileInputStream file = new FileInputStream(path);
		
	//2. open
//		Workbook book= WorkbookFactory.create(file);
		
	//3. select sheet
//		Sheet sheet = book.getSheet("Sheet1");
		
	//4. select row
//		Row row = sheet.getRow(1);  //argument - row number
//		int firstrownum = sheet.getFirstRowNum();
//		int lastrowno = sheet.getLastRowNum();
			
		
	//5. select cell/column
//		Cell cell = row.getCell(1);  // argument - cell number
//		
//		int firstcellnum = row.getFirstCellNum();
//		int lastcellnum = row.getLastCellNum();
		
		
		
	//6. copy data/ get data
		
		//double value=cell.getNumericCellValue();
		//String data=cell.getStringCellValue();
		//Date date = cell.getDateCellValue();
		
		
   String exceldata = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
	System.out.println(exceldata);	
	
	
		
	}

}


