package Practise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Revise6 
{

	public static void main(String[] args) 
	{
		
		
		        //to login a application using chrome
				System.setProperty("webdriver.chrome.drive","d://chromedriver.exe");
				ChromeDriver dr = new ChromeDriver();
				dr.navigate().to("https://www.facebook.com/");
				dr.manage().window().maximize();
				
				
				Select month = new Select(dr.findElement(By.id("month")));
				List<WebElement>month1 = month.getOptions();
				for (int i = 0; i < month1.size(); i++) 
				{
				
					String name = month1.get(i).getText();
					System.out.println("name is =" +name);
				}
				
				
				
	}

}
