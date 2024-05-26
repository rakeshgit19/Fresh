package pack3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_advertisementwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//get parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//get collection of all windows id
		Set<String>allwins = driver.getWindowHandles();
		System.out.println(allwins);
		
		Iterator<String>x = allwins.iterator();
		while(x.hasNext())
		{
			
			//get each child window
			String child = x.next();
			
		
		   //parent window should not be equal to child window
		   if (!parent.equals(child)) 
		   {
			String pagetitle = driver.switchTo().window(child).getTitle();
			driver.manage().window().maximize();
			System.out.println(pagetitle);
			Thread.sleep(5000);
			driver.close();
		    }
		}
		//switch to parent window
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		
		//click on register with us
		driver.findElement(By.xpath("//div/ul/li[1]/div/div[1]/div/input")).click();
		Thread.sleep(3000);
		
		//click on 'i am a fresher'window
		driver.findElement(By.xpath("//form/div[1]/div/button")).click();
		Thread.sleep(2000);
		driver.close();
		
			
		
		
		
		

	}

}
