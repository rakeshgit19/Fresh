package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Revise5 
{

	public static void main(String[] args) 
	{
		
		
		//to login a application using chrome
		System.setProperty("webdriver.chrome.drive","d://chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.navigate().to("https://www.facebook.com/");
		dr.manage().window().maximize();
		
		//using select class
		WebElement drop = dr.findElement(By.id("day"));
				
		Select drop1 = new Select(drop);
		drop1.selectByIndex(2);
		if (drop1.isMultiple()) 
		{
			System.out.println("dropdown is multiple");
		}
		else 
		{
		
			System.out.println("dropdown is not multiple");
		}
		
		

	}

}
