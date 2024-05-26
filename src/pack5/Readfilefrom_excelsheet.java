package pack5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfilefrom_excelsheet {

	public static void main(String[] args) throws IOException {
		//read data from excel
		FileInputStream fi = new FileInputStream("D://ExcelBook1.xlsx");
		
		//get workbook from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		//get sheet from workbook
		XSSFSheet ws = wb.getSheet("Login");
		
		//get first row from sheet
		XSSFRow r = ws.getRow(0);
		
		//count no of rows in sheet
		int rowcount = ws.getLastRowNum();
		
		//count no of coloumns from first row
		int coloumncount = r.getLastCellNum();
		System.out.println("no of rows in sheet="+rowcount);
		System.out.println("no of coloumns from first row="+coloumncount);
		fi.close();
		wb.close();
		
		
		

	}

}
