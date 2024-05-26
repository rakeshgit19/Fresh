package pack4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchdata_fromtable {

	public static void main(String[] args) {
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.w3schools.com/sql/sql_select.asp");
		dr.manage().window().maximize();
		
		//count no of rows and coloumns in a table .so for counting first we have to store the tble
		WebElement table = dr.findElement(By.xpath("//*[@id=\"main\"]/div[5]/table"));
		
		//count no of rows in a table
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("no of rows ="+rows.size());
		for (int i = 1; i < rows.size(); i++) 
		{
		
			//count  no of coloumns in a table
			List<WebElement>coloumns = rows.get(i).findElements(By.tagName("td"));
			System.out.println("no of coloumns= "+coloumns.size());
			for (int j = 0; j <coloumns.size(); j++) 
			{
			
				String tabletext = coloumns.get(j).getText();
				System.out.println("\t"+tabletext);
			}
		}
		
		

	}

}
