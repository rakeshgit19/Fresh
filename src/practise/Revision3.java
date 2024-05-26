package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Revision3 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//store surname in webelement
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		//to set dimension
		Dimension dim = surname.getSize();
		System.out.println("height of surname is ="+dim.height);
		System.out.println("width of surname is ="+dim.width);
		
		//select month
		//Select month = new Select(driver.findElement(By.id("month")));
		//month.selectByIndex(3);
		//System.out.println(month.getFirstSelectedOption().getText());
		
		//or you can take above select method by storing mont into webelement
		WebElement month1 = driver.findElement(By.id("month"));
		Select month2 = new Select(month1);
		month2.selectByIndex(3);
		System.out.println(month2.getFirstSelectedOption().getText());
		
		//check month is multiple or not
		boolean monthbox = month2.isMultiple();
		System.out.println(monthbox);
		
		
		
		
		
		driver.close();
		
		
		

	}

}
