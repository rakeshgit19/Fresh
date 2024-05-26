package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision26 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		driver.manage().window().maximize();
		
		//store table into webelement
		WebElement table = driver.findElement(By.tagName("table"));
		//count no of rows in table
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("no of rows ="+rows.size());
		
		
		//get specific row andd coloumn from table
		//String text = driver.findElement(By.xpath("//tr[2]/td[2]")).getText();
		//System.out.println(text);
		
		//get specific row andd coloumn from table
		//String text1 = driver.findElement(By.xpath("//tr[4]/td[2]")).getText();
		//System.out.println(text1);
		
		//count no of coloumns in a row
		for (int i = 0; i <=rows.size(); i++) 
		{
		
			List<WebElement>coloumns = rows.get(i).findElements(By.tagName("td"));
			System.out.println("no of coloumns are ="+coloumns.size());
			
		
		}
		
		
		
		

	}

}
