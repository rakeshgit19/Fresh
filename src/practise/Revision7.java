package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision7 
{

	public static void main(String[] args) 
	{
		
		//write a script to count no of radiobuttons in a webpage and print the names of radiobutton
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("");
		driver.manage().window().maximize();
		
		//get collection of radiobuttons in a webpage
		List<WebElement>olist = driver.findElements(By.tagName("input"));
		System.out.println("no of radiobuttons are ="+olist.size());
		
		//verify which box is selected or not
		for (int i = 0; i <= olist.size(); i++) 
		{
		
			boolean box = olist.get(i).isSelected();
			System.out.println(box);
			
			//print name of checkboxes which are stored in property file
			String checkbox = olist.get(i).getAttribute("box");
			System.out.println(checkbox);
			
			//unselect the checkbox which is already selected and slect which is not selected
			if (!olist.get(i).isSelected()) 
			{
			//select checkbox which are not selected
				olist.get(i).click();
			}
			else 
			{
			
				//unseelect checkbox which are already selected
				olist.get(i).click();
			}
		}
		
		
	}

}
