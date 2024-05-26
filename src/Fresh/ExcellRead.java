package Fresh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellRead {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("D://ExcelBook1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Login");
		XSSFRow r = ws.getRow(0);
		int row = ws.getLastRowNum();
		System.out.println("Total no of rows are = "+row);
		int cell = r.getLastCellNum();
		System.out.println("Total no of coloumns are = "+cell);
		//Now read cell value and print on the console
		String cellvalue = r.getCell(0).getStringCellValue();
		System.out.println("First cell value is = "+cellvalue);
		String cellvalue1 = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("First cell value is = "+cellvalue1);
		Thread.sleep(5000);
		for (int i = 0; i <=row; i++) {
			String value = ws.getRow(i).getCell(2).getStringCellValue();
			System.out.println(value);
		}
		
	    ws.getRow(2).createCell(2).setCellValue("lazy");;
	  

	}

}
