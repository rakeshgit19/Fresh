package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision2 
{

	public static void main(String[] args) 
	{
	
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://vidyalakshmi.co.in");
		dr.manage().window().maximize();
		//to take link name
		String linkname = dr.findElement(By.partialLinkText("vidyalakshmi")).getText();
		//System.out.println("link name is ="+linkname);
		if (linkname.contains("vidyalakshmi")) 
		{
		
			System.out.println("link available in the webpage="+linkname);
		}
		else 
		{
		
			System.out.println("link not available in the webpage ="+linkname);
		}
		
	}

}
