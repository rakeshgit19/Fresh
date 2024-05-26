package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class Print_names {

	public static void main(String[] args) throws InterruptedException {
	//write a script for to count no of items in a listbox and print the names of each item in listbox
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		//creating instance object for browser class
		ChromeDriver dr=new ChromeDriver();
		
		//launch url in browser
		dr.get("http://amazon.com");
		dr.manage().window().maximize();
		
		//store listbox into select class
		Select listboxelement = new Select(dr.findElement(By.xpath("//select[@title='Search in']")));
		
		// count or get collection of items in listbox
		List<WebElement>element = listboxelement.getOptions();
		System.out.println("no of items are =" +element.size());
		
		for (int i = 0; i < element.size(); i++) 
		{
		  
		//print name of each item
			String itemname = element.get(i).getText();
			System.out.println(itemname);
			 Thread.sleep(2000);
			 element.get(i).click();
			
		}
		
		Thread.sleep(2000);
		dr.quit();
		
		
	}

}
