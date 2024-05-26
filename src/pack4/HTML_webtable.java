package pack4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_webtable {

	public static void main(String[] args) {
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.w3schools.com/sql/sql_select.asp");
		dr.manage().window().maximize();
		
		//get specific row and coloumn data from table
		String text = dr.findElement(By.xpath("//tr[3]/td[2]")).getText();
		System.out.println(text);
		String text1 = dr.findElement(By.xpath("//tr[4]/td[3]")).getText();
		System.out.println(text1);
		
		//count no of rows and coloumns in a table.so for counting first store the table into webelement
		WebElement table = dr.findElement(By.xpath("//*[@id=\"main\"]/div[5]/table"));
		
		//count no of rows in a table
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("no of rows ="+rows.size());
		
		for (int i = 1; i < rows.size(); i++) 
		{
		
			//get no of coloumns in rows
			List<WebElement>coloumns = rows.get(i).findElements(By.tagName("td"));
			System.out.println("no of coloumns ="+coloumns.size());
			if (i==2)
			{
				break;
			}
		}
		
		

	}

}
