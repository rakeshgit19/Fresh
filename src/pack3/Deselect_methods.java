package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_methods {

	public static void main(String[] args) throws InterruptedException {
	//write a script  1.verify the listbox is multi or single. 2.and if multi then select items in multidimensional listbox.
	//3.and then select 6 items in a listbox. 4.count no of items which are selected. 5.print the names of 6 items
	//which are selected. 6.deselect from selection.
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/Framework_Rakesh/dropdown.html");
		driver.manage().window().maximize();
		
	//1.for select items in multiselection listbox first we have to find that multiselection listbox and 
	//for select items in multiselection listbox we have to use select method and for using select method 
	//we have to create one object first for multiselection listbox then we will do any operation on it.
		Select multiselection_listbox = new Select(driver.findElement(By.className("w300")));
		
	//1.verify the listbox is multi or single
		boolean value = multiselection_listbox.isMultiple();
		System.out.println(value);
		
	//2 & 3.now select items in multiselection listbox by accessing selection method
		multiselection_listbox.selectByIndex(0);
		Thread.sleep(2000);
		multiselection_listbox.selectByIndex(1);
		Thread.sleep(2000);
		multiselection_listbox.selectByIndex(2);
		Thread.sleep(2000);
		multiselection_listbox.selectByIndex(3);
		Thread.sleep(2000);
		multiselection_listbox.selectByIndex(4);
		Thread.sleep(2000);
		multiselection_listbox.selectByIndex(5);
		Thread.sleep(3000);
		
	//4.count no of items which are selected
		List<WebElement>listbox = multiselection_listbox.getAllSelectedOptions();
		System.out.println("no of item selected =" +listbox.size()); 
		
	//5.print the names of 6 items which are selected
		for (int i = 0; i < listbox.size(); i++) 
		{
		  String itemname = listbox.get(i).getText();	
		  System.out.println(itemname);	
		}
	
	//6.deselect from selection.
		//multiselection_listbox.deselectAll();
		multiselection_listbox.deselectByIndex(0);
		Thread.sleep(2000);
		multiselection_listbox.deselectByIndex(1);
		Thread.sleep(2000);
		multiselection_listbox.deselectByIndex(2);
		Thread.sleep(2000);
		multiselection_listbox.deselectByIndex(3);
		Thread.sleep(2000);
		multiselection_listbox.deselectByIndex(4);
		Thread.sleep(2000);
		multiselection_listbox.deselectByIndex(5);
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
