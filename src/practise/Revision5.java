package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Revision5 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Select dropdown = new Select(driver.findElement(By.id("")));
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		dropdown.selectByVisibleText("january");
		Thread.sleep(2000);
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		dropdown.selectByIndex(2);
		Thread.sleep(2000);
		dropdown.selectByIndex(3);
		Thread.sleep(2000);
		dropdown.selectByIndex(4);
		Thread.sleep(2000);
		dropdown.selectByIndex(5);
		
		//count no of items which are selected
		List<WebElement>olist = dropdown.getAllSelectedOptions();
		System.out.println("no of items are ="+olist);
		
		//print name of items which are selected
		for (int i = 0; i <= olist.size(); i++)
		{
		
			String itemname = olist.get(i).getText();
			System.out.println(itemname);
		}
		
		//deselect item
		dropdown.deselectByIndex(0);
		Thread.sleep(2000);
		dropdown.deselectByIndex(1);
		Thread.sleep(2000);
		dropdown.deselectByIndex(2);
		Thread.sleep(2000);
		dropdown.deselectByIndex(3);
		Thread.sleep(2000);
		dropdown.deselectByIndex(4);
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
  