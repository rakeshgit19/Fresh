package practise;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Revision9 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com/");
		driver.manage().window().maximize();
		
		//get parent window id
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		//clik on terms link
		driver.findElement(By.id("")).click();
		//switch to child window
		driver.switchTo().window(parentid);
		//get collection of windows
		Set<String>windowsid = driver.getWindowHandles();
		System.out.println(windowsid);
		for(String child:windowsid)
		{
			//parent window should not equal to child window
			if (!parentid.equals(child)) 
			{
			
				//switch to child window
				driver.switchTo().window(child);
			}
			driver.findElement(By.id("")).click();
			Thread.sleep(2000);
		}
		//switch to parent window
		driver.switchTo().window(parentid);
		Thread.sleep(2000);
		
		

	}

}
