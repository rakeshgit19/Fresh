package Practise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revise4 
{

	public static void main(String[] args) 
	{
		
		//to login a application using chrome
		System.setProperty("webdriver.chrome.drive","d://chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.navigate().to("https://www.facebook.com/");
		dr.manage().window().maximize();
		
		List<WebElement>links = dr.findElements(By.tagName("a"));
		System.out.println("name of the link are =" +links);
		for (int i = 0; i <= links.size(); i++) 
		{
		
			String names = links.get(i).getText();
			System.out.println("names are = " +names);
			
		}

	}

}
