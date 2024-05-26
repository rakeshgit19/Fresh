package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Revision34 
{

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream fi = new FileInputStream("C:\\Users\\RAKESH\\Desktop\\Book12.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Mama");
		
		//write some text into result coloumn
		XSSFRow r = ws.getRow(0);
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		int cc = r.getLastCellNum();
		System.out.println(cc);
		
		//for writing we have to create cell
		

	}

}
